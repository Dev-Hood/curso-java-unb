package exer2;

public class WAVPlayer implements FormatoAudio {
	private String arquivo = "";
	@Override
	public void abrir(String arquivo) {
		// TODO Auto-generated method stub
		this.arquivo = arquivo;
		System.out.println("O WAVPlayer abriu o arquivo "+arquivo);

	}

	@Override
	public void reproduzir() {
		if(this.arquivo != "") {
			System.out.println("O WAVPlayer está reproduzindo o arquivo "+this.arquivo);
		}else {
			System.out.println("Nenhum arquivo foi aberto");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void pausar() {
		if(this.arquivo != "") {
			System.out.println("O WAVPlayer pausou o arquivo "+this.arquivo);
		}else {
			System.out.println("Nenhum arquivo foi aberto");
		}
	}

	@Override
	public void parar() {
		if(this.arquivo != "") {
			System.out.println("O WAVPlayer parou o arquivo "+this.arquivo); 
			this.arquivo = "";
		}else {
			System.out.println("Nenhum arquivo foi aberto");
		}

	}

}
