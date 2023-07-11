package exer4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura q  = new Quadrado(3);
		System.out.println(q.calcularArea());
		
		Figura t = new Triangulo(3, 10);
		System.out.println(t.calcularArea());
		
		Figura c = new Circulo(10);
		System.out.println(c.calcularArea()); 
		
		
	}

}
