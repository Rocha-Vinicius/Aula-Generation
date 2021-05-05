programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real nota1, nota2, nota3, media
		cadeia nome
		escreva("\n====================")
		escreva("\n     GENERATION     ")
		escreva("\n====================")
		escreva("\nNome do(a) aluno(a): ")
		leia(nome)
		escreva("Digite a primeira nota de ",nome,": ")
		leia(nota1)
		escreva("Digite a segunda nota de ",nome,": ")
		leia(nota2)
		escreva("Digite a terceira nota de ",nome,": ")
		leia(nota3)
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10
		escreva("\nO(A) aluno(a) ",nome," teve a média ",mat.arredondar(media,1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */