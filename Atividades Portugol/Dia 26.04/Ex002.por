programa
{
	//Criador @Vinicius Rocha
	funcao inicio()
	{
		inteiro idaded, dia, mes, ano
		escreva("\n====================")
		escreva("\n     GENERATION     ")
		escreva("\n====================")
		
		escreva("\nDigite sua idade em dias: ")
		leia(idaded)
		ano = idaded /365
		mes = (idaded % 365) / 30
		dia = (idaded % 365) % 30
		escreva("\nSua data de nascimento foi em \nDia ",dia,"\nMês ",mes,"\nAno ",ano)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */