programa
{
	
	funcao inicio()
	{
		inteiro nfilhos, sfilhos=0, contp=0, c 
		real salario, somasal =0.0, mediasal, mfilhos, maiorsal=0.0, perc100

		para(c=1; c<=20; c++)
		{
			escreva("\nDigite o seu salário: ")
			leia(salario)
			escreva("\nNúmero de filhos: ")
			leia(nfilhos)

			somasal = somasal + salario
			sfilhos = sfilhos + nfilhos

			se(maiorsal < salario)
			{
				maiorsal = salario
			}

			se(salario <= 100)
			{
				contp++
			}
		}
		mediasal = somasal / 4
		mfilhos = sfilhos / 4
		perc100 = (contp * 100) / 4

		escreva("\nMedia salarial: R$",mediasal)
		escreva("\nMedia de filhos: ",mfilhos)
		escreva("\nMedia maior salário: R$",maiorsal)
		escreva("\nPercentual de pessoas que recebem ate R$100: ",perc100,"%")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */