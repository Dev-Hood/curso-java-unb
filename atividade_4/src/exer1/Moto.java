package exer1;

public class Moto extends Veiculo{
	@Override
	public void acelerar(int velocidade) {
		System.out.println(" A velocidade do da moto é "+velocidade);
	}

	@Override
	public void frear() {
		System.out.println("Freando a moto...");
	}
}
