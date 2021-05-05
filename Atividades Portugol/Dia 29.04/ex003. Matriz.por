programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], linha, coluna

		para(linha=0; linha<4; linha++)
		{
			para(coluna=0; coluna<6; coluna++)
			{
				//escreva("Digite um número: ")
				//leia(n1[linha][coluna])
				n1[linha][coluna] = Util.sorteia(10, 99)

				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
			}
		}
		
		limpa()
		para(linha=0; linha<4; linha++)
		{
			para(coluna=0; coluna<6; coluna++)
			{
				//escreva("Digite outro número: ")
				n2[linha][coluna] = Util.sorteia(10, 99)
				
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
			}
		}

		
		limpa()
		para(linha=0; linha<4; linha++)
		{
			para(coluna=0; coluna<6; coluna++)
			{
				
				escreva("[ ",m1[linha][coluna], " ]")
				
			}
			escreva("\n")
		
			
		}
		escreva("\n")
		para(linha=0; linha<4; linha++)
		{
			para(coluna=0; coluna<6; coluna++)
			{
				escreva("[ ",m2[linha][coluna], " ]")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 740; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */