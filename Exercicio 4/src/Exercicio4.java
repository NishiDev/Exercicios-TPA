import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p, i;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite o preço de um veículo para saber o valor do seu IPVA");
		p= in.nextDouble();
		
		i=p*4/100;
		System.out.println(i);
		in.close();
	}

}
