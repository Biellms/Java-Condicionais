package JavaCondicionais;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print(" Digite o número A: "); a = ler.nextInt();
		System.out.print(" Digite o número B: "); b = ler.nextInt();
		System.out.print(" Digite o número C: "); c = ler.nextInt();
		
		if (a > b && b > c) {
			System.out.println("\n Ordem crescente: "+c+", "+b+", "+a);
		}
		if (b > a && a > c) {
			System.out.println("\n Ordem crescente: "+c+", "+a+", "+b);
		}
		if (c > a && a > b) {
			System.out.println("\n Ordem crescente: "+b+", "+a+", "+c);
		}
		if (c > b && b > a) {
			System.out.println("\n Ordem crescente: "+a+", "+b+", "+c);
		}
		if (b > c && c > a) {
			System.out.println("\n Ordem crescente: "+a+", "+c+", "+b);
		}
		if (a > c && c > b) {
			System.out.println("\n Ordem crescente: "+b+", "+c+", "+a);
		}
		if (a == b && b == c) {
			System.out.println("\n Ordem crescente: "+a+", "+b+", "+c);
		}
		if (a == b && a > c) {
			System.out.println("\n Ordem crescente: "+c+", "+a+", "+b);
		}
		if (a == c && a > b) {
			System.out.println("\n Ordem crescente: "+b+", "+a+", "+c);
		}
		if (c == b && c > a) {
			System.out.println("\n Ordem crescente: "+a+", "+b+", "+c);
		}
	}
}
