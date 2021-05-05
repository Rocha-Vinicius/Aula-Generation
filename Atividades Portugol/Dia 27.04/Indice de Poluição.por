programa
{
	
	funcao inicio()
	{
		real indice

		escreva("\n====================")
		escreva("\n     GENERETION     ")
		escreva("\n====================")

	
		escreva("\nQual o índice de poluição?: ")
		leia(indice)
		se (indice >= 0.3 e indice < 0.4)
		{
			escreva("\nATENÇÃO!!!")
			escreva("\nAs empresas do 1° grupo precisam suspender suas atividades.")
		}
		senao se (indice >= 0.4 e indice < 0.5)
		{
			escreva("\nATENÇÃO!!!")
			escreva("\nAs empresas do 1° e 2° grupos precisam suspender suas atividades.")
		}
		senao se (indice >= 0.5)
		{
			escreva("\nATENÇÃO!!!")
			escreva("\nAs Todas as empresas precisam suspender suas atividades.")
		}
		senao se (indice < 0.3)
		{
			escreva("\nNenhuma empresa precisa parar suas atividades.")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */