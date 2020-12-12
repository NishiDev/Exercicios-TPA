import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p, d, r;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite o preço de um produto e o desconto pela compra a vista para saber o valor final");
		p= in.nextDouble();
		d= in.nextDouble();
		
		r=p*d/100;
		System.out.println(r);
		in.close();
	}

}
