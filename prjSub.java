import java.util.Scanner;

public class prjSub {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, A[] = new int [TAM], B[] = new int [TAM], C[] = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite dois número para saber o resultado da subtração entre eles:");
			A[i] = in.nextInt();
			B[i] = in.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			C[i] = A[i] - B[i];
			System.out.println("O resultado da "+(i+1)+"° subtração é: "+A[i]+"-"+B[i]+"="+C[i]);
		}
		in.close();
	}

}
