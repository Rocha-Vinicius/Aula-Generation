package AtividadesGen;

import java.util.Scanner;

public class Ex002Arrays {

	public static void main(String[] args) {
		
		/*2- Faça um programa que receba 6 números inteiros e mostre:
			• Os números pares digitados;
			• A soma dos números pares digitados;
			• Os números ímpares digitados;
			• A quantidade de números ímpares digitados.*/
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int [6];
		int c, somapar=0, quantimpar=0;
		
		for(c=0; c<6; c++) {
			System.out.printf("Entre com o [%d] número: ",c+1);
			num[c] = leia.nextInt();
			
			if(num[c] %2 == 0) {
				somapar +=num[c];
			}
			else {
				quantimpar ++;
			}
			
		}
		for(c=0; c<6; c++) {
			if(num[c] %2 == 0) {
			System.out.println("\nEste número "+num[c]+" <-- é PAR");
			}
			else {
			System.out.println("\nEste número "+num[c]+" <-- é ÍMPAR");
			}
		}
		System.out.println("\nSomatório de pares: "+somapar);
		System.out.println("\nQuantidade de ímpares "+quantimpar);
	}

}
