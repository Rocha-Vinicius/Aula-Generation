package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//model para postagem
@Entity
@Table(name = "postagem") //indica que essa entidade vai virar uma tabela dentro do banco de dados ocm o nome de postagem
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //define como esse atributo id vai se comportar dentro do banco de dados, será uma primary key
	private long id;

	 //não aceitará valores vazios
	@NotNull
	@Size(min = 5, max = 100) //define o tamanho minimo e maximo da quantidade de caracter para o atributo
	private String titulo;

	@NotNull
	@Size(min = 10, max = 500)
	private String texto;
	
	
	@Temporal(TemporalType.TIMESTAMP) //indica que estamos trabalhando com tempo e o tipo de tempo
	//pega a data do sistema
	private Date data = new java.sql.Date(System.currentTimeMillis());

	//definindo as relações entre os models
	@ManyToOne  //define que a relação é de muitos para um, muitas postagens possuem um mesmo tema
	@JsonIgnoreProperties("postagem") //ignorará a propriedade lista - postagem do model tema
	private Tema tema; //Tema da postagem

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Date getDate() {
		return data;
	}

	public void setDate(Date data) {
		this.data = data;
	}

}
