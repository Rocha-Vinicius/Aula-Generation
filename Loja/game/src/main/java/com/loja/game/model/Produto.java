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
		private Long idProduto;
		
		@NotNull
		@Size(min = 5, max = 100)
		private String nomeProduto;
		
		@NotNull
		@Size(min = 10, max = 50)
		private String nomeEstudio;
		
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "fk_categoria")
		@JsonIgnoreProperties({"produtoCategoria"})
		private Categoria gerador;


		public Long getIdProduto() {
			return idProduto;
		}


		public void setIdProduto(Long idProduto) {
			this.idProduto = idProduto;
		}


		public String getNomeProduto() {
			return nomeProduto;
		}


		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}


		public String getNomeEstudio() {
			return nomeEstudio;
		}


		public void setNomeEstudio(String nomeEstudio) {
			this.nomeEstudio = nomeEstudio;
		}


		public Categoria getGerador() {
			return gerador;
		}


		public void setGerador(Categoria gerador) {
			this.gerador = gerador;
		}

}
