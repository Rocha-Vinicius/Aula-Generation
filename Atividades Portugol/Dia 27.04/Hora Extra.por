programa
{
	
	funcao inicio()
	{
		real n, ex=0.0, sal=0.0, hora=0.0
		escreva("\n====================")
		escreva("\n     GENERETION     ")
		escreva("\n====================")

		escreva("\nDigite as horas trabalhadas: ")
		leia(n)
		se (n>50)
		{
			ex= n - 50
			hora = ex * 20.0
			sal = (10.00 * 50.00) + hora
			escreva("O total de horas foi ",ex, "\nO salário total foi R$",sal,"\nE o toal de salário excedente foi ",hora)
		}
		senao
		{
			escreva("O total de horas excedidas foi H",ex, "\nO salário total foi R$",sal,"\nE o toal de salário excedente foi ",hora)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */