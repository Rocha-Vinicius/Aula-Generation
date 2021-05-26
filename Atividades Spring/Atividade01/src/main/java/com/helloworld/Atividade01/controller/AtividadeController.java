package com.helloworld.Atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AtividadeController {

	/*Atividade 1 
	 * Spring-boot (minha primeira aplicação):
	Crie uma aplicação spring de hello world.
	
	A aplicação deverá conter um end-point que retorna
	uma string com as habilidades e mentalidades que você
	utilizou para realizar essa atividade.
 */

@RequestMapping(value = "/habilidadeEMentalidade")
	@GetMapping
		public String habilidadeEMentalidade() {
			return "\t\tHABILIDADES E MENTALIDADES\n"
					+ "-- Habilidade: Orientação ao Detalhe\n"
					+ "-- Mentalidade: Persistência e Mentalidade de Crescimento";
		}
	
	
	
	/*Atividade 2 
	 * Spring-boot (minha segunda aplicação):
		Crie uma aplicação spring de hello world.
		A aplicação deverá conter um end-point que retorna
		uma string com os seus objetivos de aprendizagem para
		essa semana.
	*/
	
@RequestMapping(value = "/objetivo")
	@GetMapping
		public String objetivos() {
			return "OBJETIVOS DE APRENDIZAGEM DA SEMANA"
					+ "\n-- Objetivo de Aprendizagem: Sprint";
		}

}