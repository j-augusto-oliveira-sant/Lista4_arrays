package exercicios_resolvidos;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos Valores: ");
		final int N = scan.nextInt();
		int[] vet = new int[N];
		for (int i=0;i<N;i++) {
			System.out.println("Valor para validacao: ");
			vet[i] = scan.nextInt();
		}
		for (int i=0;i<N;i++) {
			System.out.print(vet[i]+":");
			for (int j=1;j<=vet[i];j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
		scan.close();
	}

}
