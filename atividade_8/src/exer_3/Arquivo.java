package exer_3;

public class Arquivo implements SistemaArquivos {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void printNome() {
        System.out.println(nome);
    }
}
