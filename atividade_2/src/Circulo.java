import aula3oo.heranca.Forma;

public class Circulo extends Forma {
	private double raio;
	
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	
	@Override
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public double perimetroA() {
		double perimetro = 2 * Math.PI * raio;
		return perimetro;
	}
	
	
	public static void main(String[] args) {
		Circulo c = new Circulo(5);	
		
		System.out.println(c.calcularArea());
		
		System.out.println(c.perimetroA());
	}
}
