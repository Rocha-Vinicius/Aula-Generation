programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia nome

		escreva("\n====================")
		escreva("\n     GENERETION     ")
		escreva("\n====================")
		
		escreva("\nQual o nome do(a) Atleta? ")
		leia(nome)
		escreva("\nQual a idade de ",nome,"? ")
		leia(idade)

		se (idade >= 5 e idade <= 7)
		{
			escreva("\nO(A) atleta ",nome,"\ntem ",idade, " anos\nE esta na categoria Infantil A")
		}
		
		senao se (idade >= 8 e idade <= 11)
		{
			escreva("\nO(A) atleta ",nome,"\ntem ",idade, " anos \nE esta na categoria Infantil B")
		}
		
		senao se (idade >= 12 e idade <= 13)
		{
			escreva("\nO(A) atleta ",nome,"\ntem ",idade, " anos \nE esta na categoria Juvenil A")
		}
		
		senao se (idade >= 14 e idade <= 17)
		{
			escreva("\nO(A) atleta ",nome,"\ntem ",idade, " anos \nE esta na categoria Juvenil B")
		}
		
		senao se (idade >= 18)
		{
			escreva("\nO(A) atleta ",nome,"\ntem ",idade, " anos \nE esta na categoria Adulto")
		}
		
		senao
		{
			escreva("\nMuito novo para uma classificação")
		}
		escreva("\nMuito obrigado e tenha um otimo dia.")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */