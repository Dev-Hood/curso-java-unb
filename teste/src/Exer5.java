import java.util.Iterator;
import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um palavra:");
		String palavra = sc.next();
		palavra = palavra.trim().toLowerCase();
		boolean isPalind = true;
		for (int i = palavra.length(); i > 0; i--) {
			if(palavra.charAt(i-1)!= palavra.charAt(palavra.length()- i)) {
				isPalind = false;
				break;
			}
		}
		
		if(isPalind) {
			System.out.println("a palavra é palindromo");
		}else {
			System.out.println("a palavra não é palindromo");
		}
		
	}

}
