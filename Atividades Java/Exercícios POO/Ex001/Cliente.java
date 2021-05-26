package AtividadesGen;

import java.util.Scanner;

public class Cliente {
	
	Scanner leia = new Scanner(System.in);
	
	double valorp, valort;
	
	private String nomeCliente;
	private int codigoCliente;

	public Cliente(String nome, int codigo)
	{
		this.nomeCliente = nome;
		this.codigoCliente = codigo;
	}

	public Scanner getLeia() 
	{
		return leia;
	}

	public void tLeia(Scanner leia) 
	{
		this.leia = leia;
	}

	public double getValorp() 
	{
		return valorp;
	}

	public void setValorp(double valorp) 
	{
		this.valorp = valorp;
	}

	public double getValort() 
	{
		return valort;
	}

	public void setValort(double valort) 
	{
		this.valort = valort;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public void setLeia(Scanner leia)
	{
		this.leia = leia;
	}
	
	public double valor(double valorp)
	{
		System.out.println("Para sair digite ZERO");
		System.out.println("\nDigite o valor dos produtos individualmente: ");
	
		do
		 {
			 System.out.println("\nEntre com o valor: ");
			 valorp = leia.nextDouble();
			 valort = valort + valorp;
		 }
		 while(valorp>0.0);
		 return valort;
	}
	public String getInfo()
	{
		String info = nomeCliente +"\t"+codigoCliente;
		return info;
	}
	
	public void Compra()
	{
		 System.out.printf("Total: %.2f\n",valor(0.0));
	}
}
