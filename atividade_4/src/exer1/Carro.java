package exer1;

public class Carro extends Veiculo{
	
	@Override
	public void acelerar(int velocidade) {
		System.out.println(" A velocidade do carro é "+velocidade);
	}

	@Override
	public void frear() {
		System.out.println("Freando o carro...");
		
	}
}
