package atividade_7;

import armazenamento.Armazenamento;
import armazenamento.ArmazenamentoArquivo;
import calculadora.Divisao;
import calculadora.Expo;
import calculadora.Multiplicacao;
import calculadora.Nodo;
import calculadora.Operacao;
import calculadora.Soma;
import calculadora.Valor;

public class Main {

	public static void main(String[] args) {
	Armazenamento armazenamento = new ArmazenamentoArquivo();
//		Armazenamento armazenamento = new ArmazenamentoH2();


		String expressao1 = "(5 + (10 / 2))";
		String expressao2 = "(3 * (8 + 2))";


		String id1 = "expressao1";
		String id2 = "expressao2";


		String semEspacos1 = expressao1.replaceAll("\\s+", "");
		String semEspacos2 = expressao2.replaceAll("\\s+", "");


		Nodo operacao1 = criarOperacao(semEspacos1);
		Nodo operacao2 = criarOperacao(semEspacos2);


		int resultado1 = operacao1.calcula();
		int resultado2 = operacao2.calcula();
		
		armazenamento.salvarExpressao(id1, expressao1);
		armazenamento.salvarOperacao(id1, operacao1);
		armazenamento.salvarResultado(id1, resultado1);

		armazenamento.salvarExpressao(id2, expressao2);
		armazenamento.salvarOperacao(id2, operacao2);
		armazenamento.salvarResultado(id2, resultado2);

		// Recuperando uma expressão, operação e resultado pelo ID
		String expressaoRecuperada = armazenamento.recuperarExpressao(id1);
		Operacao operacaoRecuperada = armazenamento.recuperarOperacao(id1);
		int resultadoRecuperado = armazenamento.recuperarResultado(id1);

		System.out.println("Expressão recuperada: " + expressaoRecuperada);
		System.out.println("Operação recuperada: " + operacaoRecuperada);
		System.out.println("Resultado recuperado: " + resultadoRecuperado);
		
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}


	private static Nodo criarOperacao(String expressao) {
	
		try {
			int valor = Integer.parseInt(expressao);
			return new Valor(valor);
		} catch (NumberFormatException e) {

			int nivelParenteses = 0;
			int indexOperador = -1;

			for (int i = 0; i < expressao.length(); i++) {
				char caractere = expressao.charAt(i);
				if (caractere == '(') {
					nivelParenteses++;
				} else if (caractere == ')') {
					nivelParenteses--;
				} else if (nivelParenteses == 1
						&& (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/' || caractere == '^')) {
					indexOperador = i;
				}
			}

			if (indexOperador != -1) {
			
				String operador = expressao.substring(indexOperador, indexOperador + 1);
				String operando1 = expressao.substring(1, indexOperador);
				String operando2 = expressao.substring(indexOperador + 1, expressao.length() - 1);

			
				Nodo op1 = criarOperacao(operando1);
				Nodo op2 = criarOperacao(operando2);

			
				switch (operador) {
				case "+":
					return new Soma(op1, op2);
				case "-":
					
					throw new UnsupportedOperationException("Operador '-' não suportado.");
				case "*":
					
					return new Multiplicacao(op1, op2);
				case "/":
					return new Divisao(op1, op2);
				case "^":
					return new Expo(op1,op2);
				default:
					throw new IllegalArgumentException("Operador inválido.");
				}
			} else {
				throw new IllegalArgumentException("Expressão inválida.");
			}
		}
	}
}
