package AtividadesGen;

public class Ex001Arrays {

	public static void main(String[] args) {
		
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
			inteiros. O programa deve executar os seguintes passos:
			
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
			
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
			A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
			
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
			
			(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		
		
		//1° Passo. Atribuição dos valores
		
		int[] A = {1, 0, 5, -2, -5, 7};
		
		//2° Passo Variável para receber a soma da posições 0, 1 e 5.
		
		int soma=0;
		soma += A[0] + A[1] + A[5]; 
		System.out.println("\nA soma entre os valores  é: "+soma);
		
		//3° Passo Modifique o vetor na posição 4, atibuindo a esta posição o valor 100
		A[4] = 100;
		
		//4° Mostre na tela cada valor do vetor A, um em cada linha.
		for(int c : A) {
			System.out.printf("\n[%d]",c);
		}
	}

}
