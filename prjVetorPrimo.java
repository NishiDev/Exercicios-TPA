import java.util.Scanner;

public class prjVetorPrimo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, o, d, p,  qnt=0, A[] = new int [TAM];
		
		System.out.print("Digite 10 elementos inteiros para verificar se são primos: ");
		for (i=0;i<TAM;i++) {
			A[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			d = 0;
			o = i;
			for(p=1;p<=A[o];p++) {
				if (A[o] % p == 0) {
					d = d + 1;
				}
			}
			if (d == 2) {
				qnt = qnt + 1;
				System.out.println(A[o]+" Este elemento é um primo");
			}else {
				System.out.println(A[o]);
			}
		}
		System.out.println(qnt+" Esta é a quantidade de elementos primos");
		
		in.close();
	}

}
