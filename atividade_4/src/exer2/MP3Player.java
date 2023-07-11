package exer2;

public class MP3Player implements FormatoAudio {
	private String arquivo = "";
	@Override
	public void abrir(String arquivo) {
		// TODO Auto-generated method stub
		this.arquivo = arquivo;
		System.out.println("O MP3 player abriu o arquivo "+arquivo);

	}

	@Override
	public void reproduzir() {
		if(this.arquivo != "") {
			System.out.println("O MP3 player está reproduzindo o arquivo "+this.arquivo);
		}else {
			System.out.println("Nenhum arquivo foi aberto");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void pausar() {
		if(this.arquivo != "") {
			System.out.println("O MP3 player pausou o arquivo "+this.arquivo);
		}else {
			System.out.println("Nenhum arquivo foi aberto");
		}
	}

	@Override
	public void parar() {
		if(this.arquivo != "") {
			System.out.println("O MP3 player parou o arquivo "+this.arquivo);
			this.arquivo = "";
		}else {
			System.out.println("Nenhum arquivo foi aberto");
		}

	}

}
