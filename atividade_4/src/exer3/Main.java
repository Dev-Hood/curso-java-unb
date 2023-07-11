package exer3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("tallys",19));
		alunos.add(new Aluno("alberto",40));
		alunos.add(new Aluno("ju",34));
		alunos.add(new Aluno("gusta",12));
		alunos.add(new Aluno("ferreira",70));
		alunos.add(new Aluno("dalber",10));
		alunos.add(new Aluno("leo",60));
		alunos.add(new Aluno("pedro",56));
		alunos.add(new Aluno("sirineu",65));
		alunos.add(new Aluno("fe",14));
		
		System.out.println(alunos.get(0).getNome());
		
		System.out.println(maxIdade(alunos).getNome());
		System.out.println(minIdade(alunos).getNome());
	
	}
	
	public static Aluno maxIdade(List<Aluno> alunos) {
		Aluno max = alunos.get(0);
		for (int i = 1; i < alunos.size(); i++) {
			if(alunos.get(i).comparar(max) > 0) {
				max = alunos.get(i);
			}
		}
		return max;
	}
	
	public static Aluno minIdade(List<Aluno> alunos) {
		Aluno min = alunos.get(0);
		for (int i = 1; i < alunos.size(); i++) {
			if(alunos.get(i).comparar(min) < 0) {
				min = alunos.get(i);
			}
		}
		return min;
	}

}
