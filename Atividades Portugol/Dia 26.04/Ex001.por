programa
{
	//Criador @Vinicius Rocha
	funcao inicio()
	{
		//Variaveis para dados de dia, mês, ano e idade em dias 
		inteiro dia, mes, ano, anoat, idaded 
		escreva("\n====================")
		escreva("\n     GENERATION     ")
		escreva("\n====================")
		
		escreva("\nQuantos dias você tem? ")
		leia(dia)
		escreva("\nQuantos mêses você tem? ")
		leia(mes)
		escreva("\nQuantos anos você tem? ")
		leia(ano)
		idaded = (ano * 365) + (mes * 30) + dia
		escreva("\nO total da sua idade em dias é ",idaded)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */