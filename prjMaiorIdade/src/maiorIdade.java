import java.util.Scanner;

public class maiorIdade {

	public static void main(String[] args) {
		int i, anoAt, anoNasc, id;
		Scanner in = new Scanner(System.in);
		i = 1;
			while (i <= 5) {
				System.out.println(" Digite o Ano Atual");
				anoAt = in.nextInt();
				
				System.out.println("Digite o Ano do seu Nascimento");
				anoNasc = in.nextInt();
				
				id = anoAt - anoNasc;
				System.out.println(id);
				
				if (id >= 18) {
					System.out.println("Você é maior de Idade");
				}else {
					System.out.println("Você é menor de Idade");
				}
				i++;
				
			}
			in.close();
	}

}
