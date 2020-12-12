package prjPrimo;

public class prjPrimo {

	public static void main(String[] args) {
		int n, i, d=1;
		
		for (n=1;n<=200;n++) {
			d = 0;
			for (i=1;i<=n;i++) {
				if (n % i == 0) {
					d = d + 1;
				}
			}
			if (d == 2) {
				System.out.println(n+ " É um número primo");
			}else {
				System.out.println(n);
			}
		}

	}

}
