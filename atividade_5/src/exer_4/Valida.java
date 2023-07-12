package exer_4;

import java.util.ArrayList;
import java.util.List;

public class Valida {

	public static void main(String[] args) {
		String teste = "(({{   }}))()[[{{}}]] ";
		System.out.println(isValid(teste));
	}
	public void teste() {
		
	}
	
	
	public static boolean isValid(String s) {
		

		List<Integer> base = new ArrayList<>(0);
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			int size = base.size();
			if(s.charAt(i)=='(') {
				base.add(1);
			}
			if(s.charAt(i)=='{') {
				base.add(2);
			}
			if(s.charAt(i)=='[') {
				base.add(3);
			}
			if(s.charAt(i)==')'){
				if(base.get(size-1)== 1)  {
					base.remove(size-1);
				}else {
					return false;
				}	
			}
			if(s.charAt(i)=='}'){
				if(base.get(size-1)== 2) {
					base.remove(size-1);
				}else {
					return false;
				}	
			}
			if(s.charAt(i)==']'){
				if(base.get(size-1)== 3) {
					base.remove(size-1);
				}else {
					return false;
				}	
			}
			System.out.println(base);
		}
		
		if(base.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
