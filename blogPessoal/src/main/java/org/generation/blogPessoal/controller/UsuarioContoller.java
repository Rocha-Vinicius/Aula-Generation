package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioContoller {

	@Autowired
	private UsuarioService usuarioService;
	private UsuarioRepository repository;
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user){
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario){
		return usuarioService.cadastrarUsuario(usuario)
				.map(verificaemailUsuario -> ResponseEntity.status(201).body(verificaemailUsuario))
				.orElse(ResponseEntity.status(400).build());
	}

	@GetMapping("/todos")
	public ResponseEntity<List<Usuario>> buscarTodes() {
		List<Usuario> listarTodos = repository.findAll();
		return ResponseEntity.status(200).body(listarTodos);
	}
	
	@GetMapping("/id/{id_usuario}")
	public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable(value = "id_usuario") Long idUsuario) {
		return repository.findById(idUsuario)
				.map(usuarioExistente -> ResponseEntity.status(200).body(usuarioExistente))
				.orElse(ResponseEntity.status(204).build());
	}
	
	@GetMapping("/nome/pesquisar")
	public ResponseEntity<Object> buscarUsuarioPorNome(@RequestParam(defaultValue = "") String nome){
		List<Usuario> listaDeUsuarios = repository.findAllByNomeContaining(nome);

		if(!listaDeUsuarios.isEmpty()) {
			return ResponseEntity.status(200).body(listaDeUsuarios);
		}else {
			return ResponseEntity.status(204).body("Usuario não existente");
		}
	}
	
	@PutMapping("/atualizar/{id_usuario}")
	public ResponseEntity<Usuario> atualizarUsuario(
			@PathVariable(value = "id_usuario") Long idUsuario,
			@Valid @RequestBody Usuario atualizacaoUsuario){
		return usuarioService.atualizarUsuario(idUsuario, atualizacaoUsuario)
				.map(usuarioAtualizado -> ResponseEntity.status(201).body(usuarioAtualizado))
				.orElse(ResponseEntity.status(304).build());
	}

	@DeleteMapping("/deletar/{id_usuario}")
	public ResponseEntity<String> deletarUsuario(@PathVariable Long id_usuario) {
		Optional<Usuario> usuarioExistente = repository.findById(id_usuario);

		if (usuarioExistente.isPresent()) {
			repository.deleteById(id_usuario);
			return ResponseEntity.status(200).body("Usuário deletado com sucesso");
		} else {
			return ResponseEntity.status(400).body("Erro ao deletar usuário. \nUsuário não existe");
		}
	}
}
