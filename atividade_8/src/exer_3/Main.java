package exer_3;

public class Main {
    public static void main(String[] args) {
        // Criando os arquivos
        Arquivo arquivo1 = new Arquivo("arquivo1.txt");
        Arquivo arquivo2 = new Arquivo("arquivo2.txt");

        // Criando os diretórios
        Diretorio diretorio1 = new Diretorio("Diretorio1");
        Diretorio diretorio2 = new Diretorio("Diretorio2");
        Diretorio diretorio3 = new Diretorio("Diretorio3");

        // Adicionando arquivos aos diretórios
        diretorio1.adicionarSistema(arquivo1);
        diretorio2.adicionarSistema(arquivo2);

        // Adicionando diretórios ao diretório raiz
        diretorio3.adicionarSistema(diretorio1);
        diretorio3.adicionarSistema(diretorio2);

        // Imprimindo a estrutura do sistema de arquivos
        diretorio3.printNome();
    }
} 
