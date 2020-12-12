package prjTabuada;
import java.util.Scanner;

public class tabuadaInt {
	
	public static void main(String[] args) {
		int n, i, r;
		Scanner in = new Scanner(System.in);
		i = 1;
		
		System.out.println("Digite um número inteiro para saber a tabuada dele:");
		n = in.nextInt();
			while (i <=10) {
				r = n * i;
				
				System.out.println(r);
				i++;
				
			}
		in.close();
	}
}
