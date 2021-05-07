package AtividadesGen;

import java.util.Scanner;

public class Ex003ArraysM {

	public static void main(String[] args) {
		
		/*3- Leia uma matriz 3 x 3, conte e escreva 
		 * quantos valores maiores que 10 ela possui.
		 */
		
		Scanner leia = new Scanner(System.in);
		
			int[][] matriz = new int [3][3];
			
			int linha, coluna, maior10=0;
			
			for(linha=0; linha<3; linha++) {
				for(coluna=0; coluna<3; coluna++) {
					System.out.printf("Digite o valor da [%d] [%d]: ",linha+1,coluna+1);
					matriz[linha][coluna] = leia.nextInt();
					
					if(matriz[linha][coluna] > 10) {
						maior10++;
					}
				}
			}
			System.out.println("\nMATRIZ: \n");
			for(linha=0; linha<3; linha++) {
				for(coluna=0; coluna<3; coluna++) {
					System.out.printf(" [%d] ",matriz[linha][coluna]);
				}
				System.out.println();
			}	
			
			System.out.printf("\nA matriz posui no total %d números maiores que 10",maior10);
	}

}
