package AtividadesGen;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro bolt = new Cachorro ("Bolt", "late", 5, "Golden");
		Cavalo spirit = new Cavalo ("Spirit", "relincha", 8, false);
		Preguica flecha = new Preguica ("Flecha", "grita", 12, true);
		
		System.out.println("CACHORRO");
		System.out.println("Nome: "+bolt.getNome());
		System.out.println("Som: "+bolt.getSom());
		System.out.println("Idade: "+bolt.getIdade()+" anos");
		System.out.println("Ra�a: "+bolt.getRaca());
		System.out.println("\n*************\n");
		
		System.out.println("CAVALO");
		System.out.println("Nome: "+spirit.getNome());
		System.out.println("Som: "+spirit.getSom());
		System.out.println("Idade: "+spirit.getIdade()+" anos");
		System.out.println("Usando Ferradura?: "+spirit.isFerradura());
		System.out.println("\n*************\n");
		
		System.out.println("PREGUI�A");
		System.out.println("Nome: "+flecha.getNome());
		System.out.println("Som: "+flecha.getSom());
		System.out.println("Idade: "+flecha.getIdade()+" anos");
		System.out.println("Est� na Arvore?: "+flecha.isNaarvore());
	}
	
}
