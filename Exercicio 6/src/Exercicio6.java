import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e, t, p, v;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Digite o valor do seu emprestimo e o tempo que você levara para pagar, para descobrir o valor da prestação mensal e o valor total para ser pago");
		e= in.nextDouble();
		t= in.nextDouble();
		
		p=e/t+2.5/100;
		System.out.println(p);
		v=p*t;
		System.out.println(v);
		in.close();
	}

}
