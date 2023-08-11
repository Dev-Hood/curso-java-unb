package exer4;

public class Triangulo implements Figura{
	
	private double base;
	private double altura;
	
	public Triangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.base * this.altura)/2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
