package com.loja.game.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		@Size(min = 5, max = 100)
		private String titulo;
		
		@NotNull
		@Size(min = 10, max = 500)
		private String texto;
		
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "fk_categoria")
		@JsonIgnoreProperties("produtos")
		private Categoria categoria;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getTexto() {
			return texto;
		}


		public void setTexto(String texto) {
			this.texto = texto;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		
}
