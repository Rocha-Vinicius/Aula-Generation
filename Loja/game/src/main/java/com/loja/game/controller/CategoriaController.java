package com.loja.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	
	@GetMapping("/todos")
	public ResponseEntity<List<Categoria>> findAllCategoria(){
		List<Categoria> listaDeCategorias = repository.findAll();
		return ResponseEntity.ok().body(listaDeCategorias);
	}
	
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Categoria> findyByIDCategoria (@PathVariable long id){
		return repository.findById(id)
		.map(resp-> ResponseEntity.ok(resp))
		.orElse(ResponseEntity.notFound().build());
		
	}
	
	/*@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> findByDescricaoCategoria (@PathVariable String descricao){
		return ResponseEntity.ok().body(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	*/
	@PostMapping("/cadastrar")
	public ResponseEntity<Categoria> postCategoria (@RequestBody Categoria newCategoria){
		return service.cadastroPostagem(newCategoria)
				.map(catCadastro -> ResponseEntity.status(201).body(catCadastro))
				.orElse(ResponseEntity.status(400).build());
	}
	
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<Categoria> putCategoria (@PathVariable(value = "id") Long id, @RequestBody Categoria novosDados){
		return service.atualizarCat(id, novosDados)
				.map(catAtualizada -> ResponseEntity.status(201).body(catAtualizada))
				.orElse(ResponseEntity.status(400).build());
	}
	
	@DeleteMapping("/deletar/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
