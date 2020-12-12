import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, o;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite um numero inteiro para saber seu antecessor e seu sucessor");
		n= in.nextInt();
		
		m=n-1;
		System.out.println(m);
		o=n+1;
		System.out.println(o);
		in.close();
	}

}
