package exercicios_resolvidos;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe Palavras separadas por ;");
		String[] vet = scan.nextLine().split(";");
		
		for (int i =0;i<vet.length;i++) {
			System.out.println(vet[i]);
		}
		
		scan.close();
	}

}
