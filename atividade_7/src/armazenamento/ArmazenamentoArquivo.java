package armazenamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import calculadora.Nodo;
import calculadora.Operacao;

public class ArmazenamentoArquivo implements Armazenamento {
	private String diretorio = "./";

	@Override
	public void salvarExpressao(String id, String expressao) {
		try (FileWriter fileOutputStream = new FileWriter(diretorio + id + "_expressao.txt");
				BufferedWriter bw = new BufferedWriter(fileOutputStream)) {
			bw.write(expressao);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void salvarOperacao(String id, Nodo operacao) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(diretorio + id + "_operacao.obj");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(operacao);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void salvarResultado(String id, int resultado) {
		try (FileWriter fileOutputStream = new FileWriter(diretorio + id + "_resultado.txt");
				BufferedWriter bw = new BufferedWriter(fileOutputStream)) {
			bw.write(Integer.toString(resultado));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String recuperarExpressao(String id) {
		try (FileReader fileOutputStream = new FileReader(diretorio + id + "_expressao.txt");
				BufferedReader bw = new BufferedReader(fileOutputStream)) {
			return bw.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Operacao recuperarOperacao(String id) {
		try (FileInputStream fileInputStream = new FileInputStream(diretorio + id + "_operacao.obj");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Operacao) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int recuperarResultado(String id) {
		try (FileReader fileOutputStream = new FileReader(diretorio + id + "_resultado.txt");
				BufferedReader bw = new BufferedReader(fileOutputStream)) {
			return Integer.parseInt(bw.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<String> listarExpressoes() {
		// TODO Auto-generated method stub
		// NÃO CONSEGUI FAZER PROFESSOR
		return null;
	}

}
