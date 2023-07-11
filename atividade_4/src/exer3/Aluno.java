package exer3;

public class Aluno extends ObjetoComparavel {
	private String nome;
	private int idade;
	
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public int comparar(Comparavel outro) {
		if(((Aluno) outro).getIdade()< this.idade) {
            return 1;
        }else {
        	return -1;
        }
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
}
