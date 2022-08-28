package exercicios_resolvidos;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM =5;
		int[] vet = new int[5];
		for (int i=0;i<TAM;i++) {
			vet[i] = scan.nextInt();
		}
		for (int i=0;i<TAM;i++) {
			System.out.println(vet[i]);
		}
		scan.close();
	}

}
