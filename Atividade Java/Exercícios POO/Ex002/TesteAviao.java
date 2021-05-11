package AtividadesGen;

public class TesteAviao {

	public static void main(String[] args) {
	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/	
	
		
		Aviao novoAviao = new Aviao();
		novoAviao.cor = "Vermelha";
		novoAviao.modelo = "Boing";
		novoAviao.altitude = 0;
		
		novoAviao.decola();
		
		novoAviao.altura(40);
		System.out.println("\n\t***AVIÃO***");
		System.out.println("----------------");
		System.out.println("Modelo: "+novoAviao.modelo);
		System.out.println("----------------");
		System.out.println("Cor: "+novoAviao.cor);
		System.out.println("----------------");
		System.out.println("Altitude: "+novoAviao.altitude+" Mil pés");
		
	}

}
