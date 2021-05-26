package AtividadesGen;

import java.util.Scanner;

public class CategoriaIdade {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Qual o seu nome?: ");
		nome = leia.nextLine();
		
		System.out.print("Qual a sua idade?: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
		{
			System.out.printf("\n%s, Esta na categoria Infantil com %d anos",nome,idade);
		}
		else if(idade >= 15 && idade <= 17)
		{
			System.out.printf("\n%s, Esta na categoria Juveil com %d anos",nome,idade);
		}
		else if(idade >= 18)
		{
			System.out.printf("\n%s, Esta na categoria Adulto com %d anos",nome,idade);
		}
		
	}

}
