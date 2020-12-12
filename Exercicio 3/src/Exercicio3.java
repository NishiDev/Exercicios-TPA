import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, r;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite uma quantidade qualquer de metros para ser convertida em quilometros");
		x= in.nextInt();
		
		r=x/1000;
		System.out.println(r);
		in.close();
	}

}
