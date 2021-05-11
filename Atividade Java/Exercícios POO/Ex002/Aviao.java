package AtividadesGen;

public class Aviao {
	
	String cor;
	String modelo;
	double altitude;
	
	void decola()
	{
		System.out.println("Decolando...");
	}
	
	void altura(double baixo)
	{
		double novaaltura = this.altitude + baixo;
		this.altitude = novaaltura;
	}
	
	
	
}
