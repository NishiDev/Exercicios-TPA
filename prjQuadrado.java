import java.util.Scanner;

public class prjQuadrado {

	public static void main(String[] args) {
		final int TAM = 10;
		int A[] = new int [TAM], B[] = new int [TAM], i=0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um total de 10 inteiros:");
		
		for (i=0;i<TAM;i++) {
			A[i] = in.nextInt();
		}
		
		System.out.println("Estes são os quadrados dos elementos:");
		
		for (i=0;i<TAM;i++) {
			B[i] = A[i] * A[i];
			System.out.println(B[i]);
		}
		
		in.close();
	}

}
