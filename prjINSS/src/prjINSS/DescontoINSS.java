package prjINSS;
import java.util.Scanner;
public class DescontoINSS {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i = 1;
		double d, s;
		do {
		
			System.out.print(" Digite o seu sal�rio");
			s = in.nextDouble();
		
			if (s < 2000) {
			d = s * 0.085;
			System.out.println(" O valor de desconto do INSS sobre o seu sal�rio �: " +d);
			
			}else {
			d = s * 0.11;
			System.out.println(" O valor de desconto do INSS sobre o seu sal�rio �: " +d);
			}
			i++;
		}while(i <= 4);
		in.close();
	}

}
