package exercicios_resolvidos;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		String[] lista = texto.split("");
		
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		scan.close();
	}

}
