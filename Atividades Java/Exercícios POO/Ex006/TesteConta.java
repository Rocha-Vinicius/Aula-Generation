package AtividadesGen;

public class TesteConta {

	public static void main(String[] args) {
		/*Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe,
		 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto
		 * e apresente as informa��es deste objeto no console.
		 */
		
		// declara��o de atributos da classe
		

				// instanciando um objeto da classe ClassePaciente
				
				ContaBancaria saldoConta = new ContaBancaria("Marcela",1259,1267,5670);
				
				//troca de mensagens (chamada metodo imprimirInfo())
				saldoConta.imprimirInfo();
				System.out.println("\nNovo Saldo");
				saldoConta.setSaldo(10890);
				System.out.println();
				saldoConta.imprimirInfo();
				

	}

}
