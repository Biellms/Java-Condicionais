package JavaCondicionais;

import java.util.Scanner;

public class Decisao3 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.print(" Digite a idade: "); idade = ler.nextInt();
		
		if (idade < 10) {
			System.out.println("\n Idade abaixo da categoria minima permitida!");
		}
		if (idade >= 10 && idade <= 14) {
			System.out.println("\n Categoria Infantil 10-14!!");
		}
		if (idade >= 15 && idade <= 17) {
			System.out.println("\n Categoria Juvenil 15-17!!");
		}
		if (idade >= 18 && idade <= 25) {
			System.out.println("\n Categoria Adulto 18-25!!");
		}
		if (idade > 25) {
			System.out.println("\n Categoria acima de Adulto +25!!");
		}
	}
}
