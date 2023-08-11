package exer_3;
import java.util.ArrayList;
import java.util.List;

public class Diretorio implements SistemaArquivos {
    private String nome;
    private List<SistemaArquivos> listaSistemas;

    public Diretorio(String nome) {
        this.nome = nome;
        this.listaSistemas = new ArrayList<>();
    }

    public void adicionarSistema(SistemaArquivos sistema) {
        listaSistemas.add(sistema);
    }

    @Override
    public void printNome() {
        System.out.println(nome);
        for (SistemaArquivos sistema : listaSistemas) {
            sistema.printNome();
        }
    }
}
