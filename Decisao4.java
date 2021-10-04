package JavaCondicionais;

import java.util.Scanner;

public class Decisao4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a;
		float b;
		
		System.out.print(" Digite um número: "); a = ler.nextInt();
		
		if (a % 2 == 0) {
			b = (float) Math.sqrt(a);
			System.out.printf("\n O número %d é PAR e sua raiz quadrada é %.2f",a,b);
		} else {
			b = (float) Math.pow(a,2);
			System.out.printf("\n O número %d é IMPAR, elevado ao quadrado é %.2f",a,b);
		}
	}
}
