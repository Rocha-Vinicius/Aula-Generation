package AtividadesGen;

public class Cavalo extends Animal{
	private boolean ferradura ;
	
	public Cavalo(String nome, String som, int idade, boolean ferradura)
	{
		super(nome, som, idade);
		this.ferradura = false;
	}

	public boolean isFerradura() {
		return ferradura;
	}

	public void setFerradura(boolean ferradura) {
		this.ferradura = ferradura;
	}
	
}
