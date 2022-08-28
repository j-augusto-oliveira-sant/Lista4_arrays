package exercicios_resolvidos;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];
		
		for (int i=0;i<2;i++) {
			if (i==0) {
				System.out.println("VETOR 1");
			} else {
				System.out.println("VETOR 2");
			}
			for (int j=0;j<10;j++) {
				if (i==0) {
					vet1[j] = scan.nextInt();
				} else {
					vet2[j] = scan.nextInt();
				}
			}
		}
		System.out.println("---VETOR 3---");
		int pos1=0,pos2=0;
		for (int i=1;i<=20;i++) {
			if (i%2==0) {
				vet3[i-1] = vet1[pos1];
				pos1 += 1;
			} else {
				vet3[i-1] = vet2[pos2];
				pos2 += 1;
			}
			System.out.println(vet3[i-1]);
		}
		
		scan.close();
	}

}
