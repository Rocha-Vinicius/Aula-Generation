programa
{
	
	funcao inicio()
	{
		real a, b, c

		escreva("\n====================")
		escreva("\n     GENERETION     ")
		escreva("\n====================")

		escreva("\nDigite o valor da ALTURA do triângulo: ")
		leia(a)
		escreva("\nDigite o valor da BASE do triângulo: ")
		leia(b)
		se (a>=0 e b>=0)
		{
			c = (a * b)/2
			escreva("\nA área do triângulo é: ",c)
		}
		senao 
		{
			escreva("\nValores invalidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */