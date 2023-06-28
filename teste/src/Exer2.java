import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um inteiro M:");
		int m = sc.nextInt();
		System.out.println("Digite um inteiro N:");
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i= m ; i <= n; i++) {
			if(i % 2 == 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma dos numeros pares de "+m+" a "+n+" é: "+soma);
	}
}
