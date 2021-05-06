	package AtividadesGen;

	import java.util.Scanner;

	public class MaiorNumero 
	{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1, num2, num3, maior=0;
			Scanner leia = new Scanner(System.in);
			//Entrada da variavel num1
			System.out.print("Entre com o primeiro número: ");
			num1 = leia.nextInt();
			//Entrada da variavel num2
			System.out.print("Entre com o segundo número: ");
			num2 = leia.nextInt();
			//Entrada da variavel num3
			System.out.print("Entre com o terceiro número: ");
			num3 = leia.nextInt();
			
			if(num1 > num2 && num1 > num3)
			{
				maior = num1;
			}
			else if(num2 > num3 && num2 > num1)
			{
				maior = num2;
			}
			else
			{
				maior = num3;
			}
			System.out.println("\nO maior número digitado foi "+maior);
		}

	}

