package AtividadesGen;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, pot;
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0)
		{
			raiz = Math.sqrt(num);
			System.out.print("O n�mero "+num+" � PAR");
			System.out.printf("\nE sua Raiz Quadrada �: %5.2f",raiz);
			
		}
		else
		{
			pot = Math.pow(num, 2);
			System.out.print("O n�mero "+num+" � IMPAR " );
			System.out.printf("\nElevado ao Quadrado �: %5.2f",pot);
		}
	}

}
