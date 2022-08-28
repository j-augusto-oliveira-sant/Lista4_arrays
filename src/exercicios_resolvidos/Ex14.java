package exercicios_resolvidos;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade;
		double altura,altura_soma=0;
		//0=idade,1=altura
		double[][] todos = new double[30][2];
		for (int i=0;i<todos.length;i++) {
			System.out.println("Idade: ");
			idade = scan.nextInt();
			System.out.println("Altura:");
			altura = scan.nextDouble();
			altura_soma += altura;
			todos[i][0] = idade;
			todos[i][1] = altura;
		}
		System.out.println("MEDIA ALTURA: "+(altura_soma/todos.length));
		System.out.println("ABAIXO DA MEDIA: ");
		for (int i=0;i<todos.length;i++) {
			if (todos[i][1] < (altura_soma/todos.length) && todos[i][0] > 13) {
				System.out.println("Aluno "+i+" Altura: "+todos[i][1]);
			}
		}
		
		scan.close();
	}

}
