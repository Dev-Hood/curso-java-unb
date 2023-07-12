package exer_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> lista =  new ArrayList<>();
		lista.add(10);
		lista.add(4);
		lista.add(7);
		lista.add(9);
		lista.add(10);
		lista.add(7);
		lista.add(0);
		lista.add(8);
		lista.add(1);
		lista.add(4);
		lista.add(10);
		lista.add(3);
		
		System.out.println(findDuplicates(lista));
		
	}
	
	public static List<Integer>findDuplicates(List<Integer> numbers){
		List<Integer> repete =  new ArrayList<>();
		
		for (int i = 0; i < numbers.size(); i++) {
			int cont = 0;
			if(!repete.contains(numbers.get(i))) {
				for (int j = 0; j<numbers.size(); j++) {
					if(numbers.get(i)==numbers.get(j)){
						cont++;
					}
					if(cont==2) {
						repete.add(numbers.get(i));
						break;
					}
				}	
			}
		}
		
		return repete;
		
	}
}
