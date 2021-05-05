programa
{
	//Criador @Vinicius Rocha
	funcao inicio()
	{
		inteiro evento, hora, minutos, segundos
		escreva("\n====================")
		escreva("\n     GENERATION     ")
		escreva("\n====================")
		
		escreva("\nDigite quantos segundos durou o Evento ")
		leia(evento)
		hora = evento / 3600
		minutos = (evento % 3600) / 60
		segundos = (evento % 3600) / 60
		escreva("O evento durou \nHora(s) ",hora,"\nMinuto(s) ",minutos, "\nSegundo(s) ",segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */