package exer5;

import exer2.*;
public class CadastroContas {

	public static void main(String[] args) {
			Conta c = new Conta(11, 200);
			Conta c1 = new Conta(22, 300);
			ContaCorrente cc = new ContaCorrente(33, 400);
			ContaCorrente cc1 = new ContaCorrente(44, 500);
			
			c.deposita(1000);
			c1.deposita(7);
			cc.deposita(200);
			cc1.deposita(20);
			
			c.sacar(20);
			c1.sacar(20);
			cc.sacar(20);
			cc1.sacar(20);
			
			c.extrato();
			c1.extrato();
			cc.extrato();
			cc1.extrato();
			
			
			

	}

}
