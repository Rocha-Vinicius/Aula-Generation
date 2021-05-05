programa
{
	
	funcao inicio()
	{
		inteiro c, quantidade=0, soma=0
		para(c=1; c<501; c+=2)
		{
			se (c % 3 == 0)
			{
				quantidade++
				soma = soma + c
			}
		}

		escreva("A soma dos ",quantidade, " valores é ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */