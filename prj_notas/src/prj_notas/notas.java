package prj_notas;

import java.util.Scanner;
public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, m;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite a primeira nota");
		n1= in.nextDouble();
		System.out.println(" Digite a segunda nota");
		n2= in.nextDouble();
		m = (n1 + n2)/2;
		System.out.println(" A sua média é: "+m);
		System.out.println(m);
		
		if (m<6) {
			System.out.println("Você foi reprovado! ");
	} else {
		System.out.println("Você foi aprovado! ");
}
		
		in.close();
	}
}