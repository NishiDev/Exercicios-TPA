package ExeFixa��o;

import java.util.Scanner;
public class ExeFixa��o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Este programa pode identificar se um n�mero inteiro � negativo, neutro ou positivo ");
		System.out.println(" Digite um n�mero inteiro");
		n = in.nextInt();
		
		if(n < 0) {
			System.out.println(" Seu n�mero � negativo "+n);
		} else {
			if(n==0) {
				System.out.println(" Seu n�mero � neutro "+n);
			}else {
				System.out.println(" Seu n�mero � positivo "+n);
			}
		}
		in.close();
			}
	}


