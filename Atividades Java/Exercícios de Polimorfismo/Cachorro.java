package Exerc�cioPolimorfismo;

public class Cachorro extends Animal{
	
		private String raca;
		
		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
		
		public String getNome()
		{
			return "Nome: "+super.getNome()+"\nIdade: "+this.getIdade()+"\nSom: "+this.getSom()+"\nRa�a: "+this.getRaca()+"\nFaz: "+this.getFaz();
		}
}
