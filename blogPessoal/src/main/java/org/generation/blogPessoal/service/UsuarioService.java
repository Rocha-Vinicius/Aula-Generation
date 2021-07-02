package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;


import org.apache.commons.codec.binary.Base64;
import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Optional<Usuario> cadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Optional<Usuario> verificaUsuario = repository.findByUsuario(usuario.getUsuario());
		if(verificaUsuario.isPresent()) {
			return Optional.empty();
		} else {
			String senhaEncoder = encoder.encode(usuario.getSenha());
			usuario.setSenha(senhaEncoder);
			return Optional.ofNullable(repository.save(usuario));
		}
	}
	
	public Optional<UserLogin> Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setId(usuario.get().getId());
				user.get().setNome(usuario.get().getNome());
				user.get().setFoto(usuario.get().getFoto());
				user.get().setTipo(usuario.get().getTipo());
				user.get().setUsuario(usuario.get().getUsuario());
				return user;
			}
		}
		
		return null;
		
	}

	/**
	 * Utilizada para atualizar os campos de Nome e senha do Usuario
	 * @param idUsuario - Long idUsuario
	 * @param atualizacaoUsuario - Entidade Usuario
	 * @since 1.0
	 * @author Vinicius
	 * @return Retorna um Optional com entidade Usuario caso o mesmo exista. Do contraio um Optional Vazio
	 */
	public Optional<Usuario> atualizarUsuario(Long idUsuario, Usuario atualizacaoUsuario){
		Optional<Usuario> usuarioExistente = repository.findById(idUsuario);
		
		if(usuarioExistente.isPresent()) {
			usuarioExistente.get().setNome(atualizacaoUsuario.getNome());
			usuarioExistente.get().setSenha(atualizacaoUsuario.getSenha());
			return Optional.ofNullable(repository.save(usuarioExistente.get()));
		}else {
			return Optional.empty();
		}
	}
}
