package atividade_8_exer1;

import armazenamento.*;
public class SimpleFactory {
	public static final String ARQ = "ARQ";
	public static final String H2 = "H2";
	
	
	private SimpleFactory(){}
	
	public static Armazenamento createArmazenamento (String tipo) throws Exception {
		if(tipo.equals(ARQ)) {
			return new ArmazenamentoArquivo();
		}else if (tipo.equals(H2)){
			return new ArmazenamentoH2();
		}else {
		   throw new Exception("Tipo de armazenament não existe!");
		}
	}
	
}
