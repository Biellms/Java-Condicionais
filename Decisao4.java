package JavaCondicionais;

import java.util.Scanner;

public class Decisao4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a;
		float b;
		
		System.out.print(" Digite um n�mero: "); a = ler.nextInt();
		
		if (a % 2 == 0) {
			b = (float) Math.sqrt(a);
			System.out.printf("\n O n�mero %d � PAR e sua raiz quadrada � %.2f",a,b);
		} else {
			b = (float) Math.pow(a,2);
			System.out.printf("\n O n�mero %d � IMPAR, elevado ao quadrado � %.2f",a,b);
		}
	}
}
