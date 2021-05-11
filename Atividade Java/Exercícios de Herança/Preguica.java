package AtividadesGen;

public class Preguica extends Animal{
	private boolean naarvore;
	
	public Preguica(String nome, String cor, int idade, boolean naarvore)
	{
		super(nome, cor, idade);
		this.naarvore = true;
	}

	public boolean isNaarvore() {
		return naarvore;
	}

	public void setNaarvore(boolean naarvore) {
		this.naarvore = naarvore;
	}
}
