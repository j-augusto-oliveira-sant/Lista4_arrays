package exercicios_resolvidos;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM =10;
		char[] vogais = {'a','e','i','o','u'};
		char[] vet = new char[TAM];
		
		for (int i=0;i<TAM;i++) {
			vet[i] = scan.nextLine().charAt(0);
		}
		
		int consoante = 0;
		boolean is_consoante;
		
		for (int i=0;i<TAM;i++) {
			is_consoante = true;
			System.out.println(vet[i]);
			for (int j=0; j<vogais.length;j++) {
				if (vogais[j] == vet[i]) {
					is_consoante = false;
					break;
				}
			}
			if (is_consoante == true) {
				consoante += 1;
			}
		}
		System.out.println("CONSOANTES: "+consoante);
		scan.close();
	}

}
