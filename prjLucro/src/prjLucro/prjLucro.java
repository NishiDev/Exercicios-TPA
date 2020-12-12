package prjLucro;
import java.util.Scanner;
public class prjLucro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pv, pc, vl;
		String r;
		
		
		System.out.println("Este programa consegue calcular o lucro que você ira obter ao vender um produto");
		
		do {
			System.out.println("Digite o preço de venda do produto:");
			pv = in.nextDouble();
			
			System.out.println("Digite o preço de custo do produto:");
			pc = in.nextDouble();
			
			vl = pv - pc;
			
			System.out.println(vl);
			
			System.out.println("Você deseja calcular o lucro da venda de outro produto? (s/n)");
			r = in.next();
				
			if (r.equalsIgnoreCase("n")){
				break;
				}
					
			} while (r.equalsIgnoreCase("s")); 
			in.close();	
		}
		
		
		
		
	}


