package prjFatorial;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int i=1, n, r;
			
				System.out.println(" Este programa realizara o calculo do fatorial de um número inteiro que você digitar");
				
				System.out.println(" Digite um número Inteiro e saiba o seu fatorial");
				n = in.nextInt();
				r = n;
				do {
				
				r = r * i;
				System.out.println(r);
				
				i++;
			}while (i < n);
			in.close();

	}

}
