import java.util.Scanner;
public class NumInteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n;
		
		
		System.out.println(" Digite um número inteiro");
		n = in.nextInt();
		
		if (n>20) {
			System.out.println(n);
		} else {
			System.out.println(" Digite um outro número inteiro");
		}
		
		in.close();
	}

}
