package AtividadesGen;

import java.util.Scanner;

public class Ex004While {

	public static void main(String[] args) 
	{
		
		/*4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.
		*/
		
		
		Scanner leia = new Scanner(System.in);
		int op1, op2, c=1, idade, mulheresn=0, homensa=0, outrosc=0, pc=0, pc40=0, pc18=0;
		
		while(c <= 3)
		{
		
			System.out.print("Qual o Sexo da Pessoa?" );
			System.out.print("\n1- FEMININO / 2- MASCULINO / 3- OUTROS: " );
			op1 = leia.nextInt();
			System.out.print("\n" );
			
			System.out.print("Qual o perfil da Pessoa?" );
			System.out.print("\n1- CALMA / 2- NERVOSA / 3- AGRESSIVA: " );
			op2 = leia.nextInt();
			System.out.print("\n" );
			
			System.out.print("Qual a idade da Pessoa?: " );
			idade = leia.nextInt();
			System.out.print("\n" );
			
			if(op2 ==1)
			{
				pc++;
			}
			if(op1 == 1 && op2 == 2)
			{
				mulheresn++;
			}
			if(op1 == 2 && op2 == 3)
			{
				homensa++;
			}
			if(op1 == 3 && op2 == 1);
			{
				outrosc++;
			}
			if(idade > 40 && op2 == 1)
			{
				pc40++;
			}
			if(idade <18 && op2 == 1)
			{
				pc18++;
			}
			c++;
		}
		System.out.println("O número de pessoas calmas; "+pc);
		System.out.println("O número de mulheres nervosas; "+mulheresn);
		System.out.println("O número de homens agressivos; "+homensa);
		System.out.println("O número de outros calmos; "+outrosc);
		System.out.println("O número de pessoas nervosas com mais de 40 anos; "+pc40);
		System.out.println("o número de pessoas calmas com menos de 18 anos; "+pc18);
	}

}
