programa
{
	inclua biblioteca Util
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro res[10],  cont=0, dado, maior=0, soma=0, ocorrencia=0
		real  media=0.0
		escreva("Quantos lados terá o dado?: ")
		leia(dado)
		para(cont=0; cont<10; cont++)
		{
			escreva("\n",cont+1,"º Lançamento : ",Util.sorteia(1, dado))
			Util.aguarde(1000)
			res[cont] = Util.sorteia(1, dado)

			soma = soma + res[cont]

			se(maior <= res[cont])
			{
				maior = res[cont]
			}
		}
		media = soma / 10
			para(cont=0; cont<10; cont++)
			{
				se(maior <= res[cont])
				{
					ocorrencia++
				}
			}
		
		escreva("\n")
		escreva("\nA média dos lançamentos foi: ",mat.arredondar(media, 2))
		escreva("\nA ocorrência de maior pontuação foi: ",ocorrencia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {res, 7, 10, 3}-{cont, 7, 20, 4}-{soma, 7, 43, 4}-{ocorrencia, 7, 51, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */