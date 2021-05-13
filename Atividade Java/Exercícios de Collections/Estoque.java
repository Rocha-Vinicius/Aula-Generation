package ExercícioCollections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int op;
			
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> estoque = new ArrayList();
			
			do
			{
				System.out.println("\n-------------------------------");
				System.out.println("(1) Deseja adicionar produto ao estoque?");
				System.out.println("(2) Deseja remover produto do estoque?");
				System.out.println("(3) Deseja atualizar produtos do estoque?");
				System.out.println("(4) Mostrar produtos do estoque?");
				System.out.println("(0) Encerrar o Programa");
				System.out.println("Digite sua opção: ");
				op = leia.nextInt();
				switch(op)
				{
				
				case 1:
					leia.nextLine();
					System.out.println("Digite o produto para adicionar ao estoque: ");
					String produto = leia.nextLine();
					estoque.add(produto);
					break;
				
				case 2:
					leia.nextLine();
					System.out.println("Digite o produto que será removido: ");
					String excluir = leia.nextLine();
					if(estoque.contains(excluir))
					{
						estoque.remove(excluir);
					}
					else
					{
						System.out.println("Produto não encontrado!");
					}
					break;
					
				case 3:
					leia.nextLine();
					System.out.println("Digite o produto a ser atualizado: ");
					String atualizar = leia.nextLine();
					System.out.println("Digite o nome do novo produto que entrará no lugar de "+atualizar+": ");
					String novo = leia.nextLine();
					if(estoque.contains(atualizar))
					{
						estoque.remove(atualizar);
						estoque.add(novo);
					}
					else
					{
						System.out.println("Produto não encontrado!");
					}
					break;
					
				case 4:
					leia.nextLine();
					System.out.println();
					System.out.println("========ESTOQUE========");
					System.out.println(estoque);
					break;
				
				case 0:
					leia.nextLine();
					System.out.println("\nFinalizando....");
					break;
					
					default:
						System.err.println("Código invalido...");
				}
			}while(op != 0);
		}
}
