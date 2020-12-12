package prjMargemLucro;
import java.util.Scanner;
public class MargemLucro {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double p, ml, v;
		String r;
		do {
			System.out.println(" Esse programa ira calcular a margem de lucro de um produto e mostrar qual o seu preço de venda para obter o lucro desejado");
			
			System.out.println(" Digite o preço preço de um produto");
			p = in.nextDouble();
			
			System.out.println(" Digite a margem de lucro que deseja obter de um produto");
			ml = in.nextDouble();
			
			v = (p * 2) * (ml/100);
			System.out.println("O preço de venda sera:" +v);
			
			System.out.print(" Você Deseja Continuar Executando Este Programa? (S/N)");
			r = in.next();
		}while (r.equalsIgnoreCase("s"));
		in.close();
	}

}
