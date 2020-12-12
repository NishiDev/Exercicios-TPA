import java.util.Scanner;
public class NumParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println(" Digite um número inteiro para saber se ele é par ou impar");
		n = in.nextInt();
		
		if((n % 2) == 0) {
			System.out.println(" O número " +n+ " é Par!");
		} else {
			System.out.println(" O número " +n+ " é Ímpar!");
		}
		
		in.close();
	}

}
