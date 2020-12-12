package ExeFixação;

import java.util.Scanner;
public class ExeFixação2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Este programa pode identificar se um número inteiro é negativo, neutro ou positivo ");
		System.out.println(" Digite um número inteiro");
		n = in.nextInt();
		
		if(n < 0) {
			System.out.println(" Seu número é negativo "+n);
		} else {
			if(n==0) {
				System.out.println(" Seu número é neutro "+n);
			}else {
				System.out.println(" Seu número é positivo "+n);
			}
		}
		in.close();
			}
	}


