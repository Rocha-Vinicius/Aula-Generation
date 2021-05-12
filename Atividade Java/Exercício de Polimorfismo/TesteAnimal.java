package ExercícioPolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Cachorro dog = new Cachorro();
			dog.setNome("Coragem");
			dog.setIdade(4);
			dog.setSom("Au, au...");
			dog.setRaca("Vira-Lata");
			dog.setFaz("Corre");
			
			Cavalo horse = new Cavalo();
			horse.setNome("Bala no Alvo");
			horse.setIdade(15);
			horse.setSom("iiirrrí...");
			horse.setFerradura(false);
			horse.setFaz("Corre");
			
			Preguica sloth = new Preguica();
			sloth.setNome("Sid");
			sloth.setIdade(25);
			sloth.setSom("AAAAAHHHH...");
			sloth.setArvore(true);
			sloth.setFaz("Sobe em árvore");
			
			
			Animal[] ani = new Animal[3];
			ani[0] = dog;
			ani[1] = horse;
			ani[2] = sloth;
			
			for(Animal anim:ani)
			{
				System.out.println(anim.getNome());
				System.out.println();
				System.err.println("=========================");
				System.out.println();
			}
	}

}
