programa
{
	
	funcao inicio()
	{
		inteiro num
		escreva("\n====================")
		escreva("\n     GENERETION     ")
		escreva("\n====================")

		escreva("\nDigite um número: ")
		leia (num)

		se(num % 2 == 0)
		{
			escreva("\nO número ",num," é PAR")
			se (num>0)
			{
				escreva(" e POSSITIVO")
			}
			senao
			{
				escreva(" e NEGATIVO")
			}
		}
		senao
		{
			escreva("\nO número ",num," é IMPAR")
			se (num>0)
			{
				escreva(" e POSSITIVO")
			}
			senao
			{
				escreva(" e NEGATIVO")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */