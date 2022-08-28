package exercicios_resolvidos;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM =10;
		float[] vet = new float[10];
		for (int i=0;i<TAM;i++) {
			vet[i] = scan.nextFloat();
		}
		for (int i=TAM-1;i>=0;i--) {
			System.out.println(vet[i]);
		}
		scan.close();
	}

}
