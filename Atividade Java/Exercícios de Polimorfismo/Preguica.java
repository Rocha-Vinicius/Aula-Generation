package Exerc�cioPolimorfismo;

public class Preguica extends Animal{
	
	private boolean arvore;

	public boolean getArvore() {
		return arvore;
	}

	public void setArvore(boolean arvore) {
		this.arvore = arvore;
	}
	
	public String getNome()
	{
		return "Nome: "+super.getNome()+"\nIdade: "+this.getIdade()+"\nSom: "+this.getSom()+"\nEst� na Arvore?: "+this.getArvore()+"\nFaz: "+this.getFaz();
	}
}
