package exercicios_resolvidos;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM = 5;
		int soma=0,multi=1;
		int[] nums = new int[TAM];
		
		for (int i=0;i<TAM;i++) {
			nums[i] = scan.nextInt();
			multi *= nums[i];
			soma += nums[i];
		}
		
		for (int i=0;i<TAM;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("MULTIPLICAO: "+multi);
		System.out.println("SOMA: "+soma);
		
		
		scan.close();
	}

}
