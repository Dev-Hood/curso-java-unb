package exer3;

import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Gerente extends Funcionario {
	private String departamento;
	
	public double bonus() {
		return getSalario() * 0.1;
	}
	
	public Gerente(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("" + this.departamento + " \n" + getNome() + "\n"+ getSalario()) ;
	}
	
	public static void main(String[] args) {
		Gerente g = new Gerente("Vendas");
		g.setNome("tall");
		g.setSalario(10000);
		
		System.out.println(g.bonus());
		
		System.out.println(g.toString());
	}
}
