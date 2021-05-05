programa
{
	
	funcao inicio()
	{
		inteiro num[5], cont, maior=0, p=0
		
		para (cont=0; cont<5; cont++)
		{
			escreva("Digite a ",cont+1,"ª pontuação: ")
			leia(num[cont])

		}
		para (cont=0; cont<5; cont++)
		{
			se(maior < num[cont])
			{
				maior = num[cont]
				p = cont+1
			}	
		}
		escreva("\nO maior valor foi: ",maior,"\nNa posição: ",p)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */