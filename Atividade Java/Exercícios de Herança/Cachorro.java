package AtividadesGen;

public class Cachorro extends Animal{
	private String raca;
	
	public Cachorro(String nome, String som, int idade, String raca)
	{
		super(nome, som, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
