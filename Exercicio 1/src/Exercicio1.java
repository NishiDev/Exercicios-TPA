import java.util.Scanner;
public class Exercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, r;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite três numeros inteiros para saber a soma de seus quadrados");
		a= in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
		
		a=a*a;
		b=b*b;
		c=c*c;
		r=a+b+c;
		System.out.println(r);
		in.close();
	}
	
}
