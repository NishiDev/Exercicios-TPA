package ExeFixa��o;

import java.util.Scanner;
public class ExeFixa��o1 {

	public static void main(String[] args) {
		double s;
		Scanner in = new Scanner(System.in);
		System.out.println(" Este Programa ira verificar se seu sal�rio � acima ou abaixo do valor m�nimo de sal�rio");
		System.out.println(" Digite o valor do seu sal�rio abaixo");
		
		s = in.nextDouble();
		
		if(s < 954.00) {
			System.out.println(" Seu sal�rio est� abaixo do valor m�nimo " +s);
		}else {
			if(s==954.00) {
				System.out.println(" Seu sal�rio � igual ao valor m�nimo " +s);
			}else {
				System.out.println(" Seu sal�rio est� acima do valor m�nimo " +s);
			}
		}
		in.close();
	}

}
