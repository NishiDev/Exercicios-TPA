package prjTabuadaFOR;
import java.util.Scanner;
public class PrjTabuadaFOR {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int r, n, i;
		
		System.out.println("Digite um número inteiro para saber a sua tabuada");
		n = in.nextInt();
		
		for (i=1;i<=10;i++) {
			r = n * i;
			System.out.println(r);
		}
		in.close();
	}

}
