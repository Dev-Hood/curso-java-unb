package exer2;

public class Conta {
	private int numero;
	private double saldo;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	{}
	
	public void sacar(double valor) {
		if(valor < this.saldo) {
			this.saldo-= valor;
			System.out.println("Saldo realizado com Sucesso!");
		}else {
			System.out.println("Voce não tem Saldo Suficiente!");
		}
	}
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	public void extrato() {
		System.out.println("Conta de Numero: "+this.numero +" Seu saldo é: "+this.saldo);
	}
	
}
