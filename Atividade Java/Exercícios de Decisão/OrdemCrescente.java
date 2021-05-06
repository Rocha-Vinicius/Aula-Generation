	package AtividadesGen;

	import java.util.Scanner;

	public class OrdemCrescente 
	{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1, num2, num3, meio;
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Entre com o primeiro número: ");
			num1 = leia.nextInt();
			
			System.out.print("Entre com o segundo número: ");
			num2 = leia.nextInt();
			
			System.out.print("Entre com o terceiro número: ");
			num3 = leia.nextInt();
			//Condicional feito para mudar o valor das variaveis do maior para o menor.
			if(num2 > num1)
			{
				 meio = num1;
				 num1 = num2;
				 num2 = meio;
			}
			if(num3 > num1)
			{
				meio = num1;
				num1 = num3;
				num3 = meio;
			}
			if(num3 > num2)
			{
				meio = num2;
				num2 = num3;
				num3 = meio;
			}
			System.out.println("\nA ordem crescente dos números é: "+num3+", "+num2+", "+num1);
		}

	}
	
