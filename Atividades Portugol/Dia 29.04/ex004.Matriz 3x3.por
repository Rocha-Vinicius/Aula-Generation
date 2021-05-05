programa
{
	
	funcao inicio()
	{
		inteiro num[3][3], soma=0, somap=0 , l, c

		para(l=0; l<3; l++)
		{
			para(c=0; c<3; c++)
			{
				escreva("Informe o valor da [",l+1,"..",c+1,"]:")
				leia(num[l][c])
				
				se(l == c)
				{
					somap += num[l][c]
				}
				soma += num[l][c]
			}
		}
		limpa()
		
		para(l=0; l<3; l++)
		{
			para(c=0; c<3; c++)
			{
				escreva("[ ",num[l][c]," ]")
			}
			escreva("\n")
		}
		
		escreva("\nA soma da Matriz é: ",soma)
		escreva("\nE a soma da Diagonal Principal é: ",somap)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */