package AtividadesGen;

import java.util.Scanner;

public class Ex006DoWhile {

	public static void main(String[] args) {
	
		/*6- Escrever um programa que receba vários números inteiros no teclado. E no
			final imprimir a média dos números múltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0 ; 
		double media, quantidade=0;
		
		do
		{
			System.out.printf("Digite um número: ");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num != 0)
			{
				soma = soma + num;
				quantidade++;
			}			
		}while(num > 0);
		
		media = soma / quantidade;
		System.out.printf("\nA media dos números multiplos de 3 é: %s",media);
	}

}
