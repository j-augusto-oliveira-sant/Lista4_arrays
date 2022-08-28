package exercicios_resolvidos;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM =10;
		int[] vet = new int[TAM];
		int[] pares = new int[TAM];
		int[] impares = new int[TAM];
		int[][] todas_listas = {vet,pares,impares};
		for (int i=0;i<TAM;i++) {
			vet[i] = scan.nextInt();
			if (vet[i]%2==0) {
				pares[i] = vet[i];
			} else {
				impares[i] = vet[i];
			}
		}
		
		for (int i=0;i<3;i++) {
			if (i==0) {
				System.out.println("TODOS--");
			} else if (i==1) {
				System.out.println("PARES--");
			} else {
				System.out.println("IMPARES--");
			}
			for (int j=0;j<TAM;j++) {
				if (todas_listas[i][j]!=0) {
					System.out.println(todas_listas[i][j]);
				}
			}
		}
		
		
		
		scan.close();
	}

}
