package JavaCondicionais;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print(" Digite o n�mero A: "); a = ler.nextInt();
		System.out.print(" Digite o n�mero B: "); b = ler.nextInt();
		System.out.print(" Digite o n�mero C: "); c = ler.nextInt();
		
		if (a > b && a > c) {
			System.out.println("\n O n�mero A � maior");
		}
		if (b > a && b > c) {
			System.out.println("\n O n�mero B � maior");
		}
		if (c > b && c > a) {
			System.out.println("\n O n�mero C � maior");
		}
		if (a == b && a == c && b == c) {
			System.out.println("\n Os n�meros s�o iguais");
		}
	}
}
