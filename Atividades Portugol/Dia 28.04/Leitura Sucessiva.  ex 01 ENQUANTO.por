programa
{
	
	funcao inicio()
	{
		inteiro num=0, soma=0, numtotal=0
		real media=0.0
		enquanto(num >=0)
		{
			escreva("Digite um número: ")
			leia(num)
			se (num >= 0)
			{
				numtotal++
				soma = soma + num
			}
			media = soma / numtotal
		}
		escreva("\nA soma deu ",soma," o total de números digitados foi ",numtotal)
		escreva("\nE a media é ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */