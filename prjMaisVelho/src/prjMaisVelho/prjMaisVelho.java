package prjMaisVelho;
import java.util.Scanner;
public class prjMaisVelho {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int id, mv, mn, aa, an;
		
		System.out.print("Digite o Ano Atual:");
		aa = in.nextInt();
		
		System.out.print("Digite o seu Ano de Nascimento:");
		an = in.nextInt();
		
		id = aa - an;
		
		System.out.println("Esta é a sua idade:" +id);
		
		mv = id;
		
		mn = id;
		
		for (int i=1;i<=9;i++) {
			System.out.print("Digite o seu Ano de Nascimento:");
			an = in.nextInt();
			
			id = aa - an;
			
			System.out.println("Esta é a sua idade:" +id);
			
			if (id > mv) {
				mv = id;
			}
			if (id < mv) {
				
			}
			System.out.println("Essa é a idade do usuário mais velho: " +mv);
			System.out.println("Essa é a idade do usuário mais novo: " +mn);
		}
		
		in.close();
	}

}
