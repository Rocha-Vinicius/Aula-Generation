package AtividadesGen;

import java.util.Scanner;

public class Ex002Arrays {

	public static void main(String[] args) {
		
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
			� Os n�meros pares digitados;
			� A soma dos n�meros pares digitados;
			� Os n�meros �mpares digitados;
			� A quantidade de n�meros �mpares digitados.*/
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int [6];
		int c, somapar=0, quantimpar=0;
		
		for(c=0; c<6; c++) {
			System.out.printf("Entre com o [%d] n�mero: ",c+1);
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
			System.out.println("\nEste n�mero "+num[c]+" <-- � PAR");
			}
			else {
			System.out.println("\nEste n�mero "+num[c]+" <-- � �MPAR");
			}
		}
		System.out.println("\nSomat�rio de pares: "+somapar);
		System.out.println("\nQuantidade de �mpares "+quantimpar);
	}

}
