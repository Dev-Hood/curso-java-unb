import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite seu email: ");
		String email = sc.next();
		int pos = email.indexOf('@') + 1;
		System.out.println("Seu domínio é: "+ email.substring(pos));

	}

}
