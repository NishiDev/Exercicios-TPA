import java.util.Scanner;
public class NumPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println(" Digite um n�mero inteiro para saber se ele � positivo ou negativo");
		n = in.nextInt();
		
		if (n<1) {
			System.out.println(" Seu n�mero � negativo");
		} else {
			System.out.println(" Seu n�mero � positivo");
		}
		
		in.close();
	}

}
