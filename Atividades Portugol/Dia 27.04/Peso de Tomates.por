programa
{
	
	funcao inicio()
	{
		real P, E=0.0, M=0.0
		escreva("\n====================")
		escreva("\n     GENERETION     ")
		escreva("\n====================")
		
		escreva("\nDigite o peso dos tomates (Kg): ")
		leia(P)
		se (P > 50)
		{
			E = P -50
			M = E * 4.00
			escreva("\nO peso total foi de ",P,"Kg \nCom ",E,"Kg de excesso \nE o valor da multa é de R$",M)
		}
		senao
		{
			escreva("\nO peso total foi de ", P,"Kg \nCom ",E," de excesso \nE o valor da multa é de R$",M)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */