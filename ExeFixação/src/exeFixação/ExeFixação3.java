package ExeFixa��o;

import java.util.Scanner;
public class ExeFixa��o3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f, c;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Este programa pode converter graus fahrenheit em graus celsius e dizer se a temperatura esta Fria, Amena ou Calorente");
		System.out.println(" Digite uma temperatura em graus fahrenheit");
		
		f = in.nextDouble();
		c = (f - 32) * 5/9;
		
		if(c < 15) {
			System.out.println(" A Temperatura "+c);
			System.out.println(" � Fria");
		}else {
			if(c < 22) {
				if(c >= 15) {
					System.out.println(" A Temperatura "+c);
					System.out.println(" � Amena");
				}
			}else {
				if(c >= 22) {
					System.out.println(" A Temperatura "+c);
					System.out.println(" � Calorente");
				}
			}
			
		}
		
		in.close();
	}

}
