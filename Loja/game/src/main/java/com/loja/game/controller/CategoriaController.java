package com.loja.game.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loja.game.model.Categoria;
import com.loja.game.repository.CategoriaRepository;
import com.loja.game.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	@Autowired
	private CategoriaService service;
	
	
	@GetMapping("/id_categoria")
	public ResponseEntity<Optional<Categoria>> findyByIDCategoria (@PathVariable(value = "id_categoria") Long idCategoria){
		
		Optional<Categoria> idDaCategoria = repository.findById(idCategoria);
		
		if(idDaCategoria.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(idDaCategoria);
		}
	}
		
	@GetMapping("/buscar")
	public ResponseEntity<Object> buscarCategoriaPorNome(@RequestParam(defaultValue = "") String nomeCategoria) {
		List<Categoria> listaDeCategorias = repository.findAllByNomeCategoriaContaining(nomeCategoria);
		
		if(listaDeCategorias.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listaDeCategorias);
		}
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Object> postCategoria (@RequestBody Categoria newCategoria){
		return service.cadastroCategoria(newCategoria)
				.map(catCadastro -> ResponseEntity.status(201).body(catCadastro))
				.orElse(ResponseEntity.status(400).body("Categoria já existente"));
	}
	
	@PutMapping("/atualizar/{id_categoria}")
	public ResponseEntity<Object> putCategoria (@PathVariable(value = "id_categoria") Long idCategoria, @Valid @RequestBody Categoria atualizacaoCategoria){
		return service.atualizarCat(idCategoria, atualizacaoCategoria)
				.map(catAtualizada -> ResponseEntity.status(201).body(catAtualizada))
				.orElse(ResponseEntity.status(400).body("Categoria já existente"));
	}
	
	@DeleteMapping("/categoria/{id_categoria}")
	public void delete(@PathVariable Long idCategoria) {
		repository.deleteById(idCategoria);
	}
	
}
