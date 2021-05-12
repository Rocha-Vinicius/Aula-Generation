package ExercícioPolimorfismo;

public class Cavalo extends Animal{
	
	private boolean ferradura;

	public boolean getFerradura() {
		return ferradura;
	}

	public void setFerradura(boolean ferradura) {
		this.ferradura = ferradura;
	}
	
	public String getNome()
	{
		return "Nome: "+super.getNome()+"\nIdade: "+this.getIdade()+"\nSom: "+this.getSom()+"\nUsando Ferradura?: "+this.getFerradura()+"\nFaz: "+this.getFaz();
	}
	
}
