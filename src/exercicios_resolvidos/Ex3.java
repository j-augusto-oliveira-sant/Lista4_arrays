package exercicios_resolvidos;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM =4;
		float[] vet = new float[4];
		
		for (int i=0;i<TAM;i++) {
			vet[i] = scan.nextFloat();
		}
		
		int soma=0;
		double media=0;
		
		for (int i=0;i<TAM;i++) {
			System.out.println(vet[i]);
			soma += vet[i];
			
		}
		media = ((double)soma)/TAM;
		System.out.println("MEDIA: "+media);
		scan.close();
	}

}
