programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro a, b, c
		real d, r, s
		escreva("\n====================")
		escreva("\n     GENERATION     ")
		escreva("\n====================")
		
		escreva("\nDigite o 1° número: ")
		leia(a)
		escreva("Digite o 2° número: ")
		leia(b)
		escreva("Digite o 3° número: ")
		leia(c)
		r = mat.potencia(a + b, 2.0)
		s = mat.potencia(b + c, 2.0) 
		d = (r + s) / 2
		escreva("Resultado: ",d)		
		
		
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