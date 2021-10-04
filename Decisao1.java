package JavaCondicionais;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print(" Digite o número A: "); a = ler.nextInt();
		System.out.print(" Digite o número B: "); b = ler.nextInt();
		System.out.print(" Digite o número C: "); c = ler.nextInt();
		
		if (a > b && a > c) {
			System.out.println("\n O número A é maior");
		}
		if (b > a && b > c) {
			System.out.println("\n O número B é maior");
		}
		if (c > b && c > a) {
			System.out.println("\n O número C é maior");
		}
		if (a == b && a == c && b == c) {
			System.out.println("\n Os números são iguais");
		}
	}
}
