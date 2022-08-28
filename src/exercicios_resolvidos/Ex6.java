package exercicios_resolvidos;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM = 10;
		double soma=0;
		double[] medias = new double[2];
		int maiores = 0;
		for (int i=0;i<TAM;i++) {
			System.out.println("ALUNO "+(i+1));
			for (int j=0;j<3;j++) {
				System.out.println("NOTA "+(j+1));
				soma += scan.nextFloat();
			}
			medias[i] = soma/TAM;
			if (medias[i]>7) {
				maiores += 1;
			}
		}
		System.out.println("Maiores: "+maiores);
		
		scan.close();
	}

}
