package exer2;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	private double limite = 300;
	
	public double getLimite() {
		return limite;
	}
	

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if(valor < this.limite) {
			super.sacar(valor);
		}else {
			System.out.println("Voce nao tem limite disponível");
		}
		
	}
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(22,500);
		cc.setLimite(200);
		cc.sacar(50);
		cc.extrato();
		cc.deposita(500);
		cc.extrato();
		cc.sacar(250);
		
	
		

	}

}
