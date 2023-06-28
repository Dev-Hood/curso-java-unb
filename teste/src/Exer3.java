import java.util.Random;
import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Random random =  new Random();
		int ale = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tente acertar o numero aleatório, digite um número:");
		int n = scanner.nextInt();
		int contador = 1;
		while(n != ale) {
			if(n < ale) {
				System.out.println("O numero a ser adivinhado é maior, tente novamente:");
			}else {
				System.out.println("O numero a ser adivinhado é menor, tente novamente:");
			}
			contador++;
			n = scanner.nextInt();
		}
		
		System.out.println("Você acertou! em "+contador+" tentativas");
		
		
	}
}
