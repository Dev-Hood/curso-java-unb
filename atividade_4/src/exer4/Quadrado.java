package exer4;

public class Quadrado implements Figura {

	private double lado;
	
	public Quadrado (double l) {
		this.lado = l;
	}
	
	@Override
	public double calcularArea() {
		return this.lado*this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
