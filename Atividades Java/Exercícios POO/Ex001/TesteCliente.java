package AtividadesGen;

import java.util.Scanner;

import AtividadesGen.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		String nome;
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		nome = ler.nextLine();
		
		Cliente cliente1 = new Cliente(nome,1234);
		cliente1.Compra();
		System.out.println(cliente1.getInfo());
	}

}
