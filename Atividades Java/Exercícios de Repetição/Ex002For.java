package AtividadesGen;

import java.util.Scanner;

public class Ex002For {

	public static void main(String[] args) {
				
		/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		Scanner leia = new Scanner(System.in);
		
		int num, c, par=0, impar=0;
		
		for(c=0+1; c<10; c++)
		{
			System.out.print("Entre com o "+c+"° número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				par = par + 1;
			}
			else
			{
				impar = impar + 1;
			}
		}
		System.out.println("O total de números PARES são: "+par);
		System.out.println("O total de números IMPARES são: "+impar);
	}

}
