package Exerc�cioPolimorfismo;

public class Animal {
	
	/*2-Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
		anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
		�, independente do tipo de animal.*/
	
	private String nome;
	private String som;
	private String faz;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getFaz() {
		return faz;
	}
	public void setFaz(String faz) {
		this.faz = faz;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
