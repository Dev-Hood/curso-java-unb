package exer4;

public class Circulo implements Figura{

	private double raio;
	
	public Circulo (double r) {
		this.raio = r;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI *Math.pow(raio, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
