package AtividadesGen;

import java.util.Scanner;

public class Ex003While {

	public static void main(String[] args) 
	{
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
		*/
		Scanner leia = new Scanner(System.in);
		
		int idade=0, menos21=0, mais50=0;
		
		
		while(idade!=-99)
		{
			System.out.printf("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade >=1 && idade < 21)
			{
				menos21++;
			}
			if(idade > 50)
			{
				mais50++;
			}

		}
		System.out.printf("\nO total de pessoas com menos de 21 anos: %d",menos21);
		System.out.printf("\nO total de pessoas com mais de 50 anos: %d",mais50);
	}

}
