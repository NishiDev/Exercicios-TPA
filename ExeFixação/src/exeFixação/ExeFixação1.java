package ExeFixação;

import java.util.Scanner;
public class ExeFixação1 {

	public static void main(String[] args) {
		double s;
		Scanner in = new Scanner(System.in);
		System.out.println(" Este Programa ira verificar se seu salário é acima ou abaixo do valor mínimo de salário");
		System.out.println(" Digite o valor do seu salário abaixo");
		
		s = in.nextDouble();
		
		if(s < 954.00) {
			System.out.println(" Seu salário está abaixo do valor mínimo " +s);
		}else {
			if(s==954.00) {
				System.out.println(" Seu salário é igual ao valor mínimo " +s);
			}else {
				System.out.println(" Seu salário está acima do valor mínimo " +s);
			}
		}
		in.close();
	}

}
