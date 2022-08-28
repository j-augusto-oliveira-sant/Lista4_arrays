package exercicios_resolvidos;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade;
		double altura,altura_soma=0,idade_soma=0;
		//0=idade,1=altura
		double[] mais_novo = new double[2];
		double[] mais_velho = new double[2];
		double[] mais_alto = new double[2];
		double[] mais_baixo = new double[2];
		double[][] todos = new double[5][2];
		for (int i=0;i<todos.length;i++) {
			System.out.println("Idade: ");
			idade = scan.nextInt();
			idade_soma += idade;
			System.out.println("Altura:");
			altura = scan.nextDouble();
			altura_soma += altura;
			todos[i][0] = idade;
			todos[i][1] = altura;
			//mais alto
			if (altura > mais_alto[1]) {
				mais_alto[0] = idade;
				mais_alto[1] = altura;
			}
			//mais baixo
			if (altura < mais_baixo[1] || i==0) {
				mais_baixo[0] = idade;
				mais_baixo[1] = altura;
			}
			//mais novo
			if (altura < mais_novo[0] || i==0) {
				mais_novo[0] = idade;
				mais_novo[1] = altura;
			}
			//mais velho
			if (idade > mais_velho[0]) {
				mais_velho[0] = idade;
				mais_velho[1] = altura;
			}
		}
		System.out.println("MEDIA ALTURA: "+(altura_soma/5));
		System.out.println("MEDIA IDADE: "+(idade_soma/5));
		System.out.println("ABAIXO DA MEDIA: ");
		for (int i=0;i<todos.length;i++) {
			if (todos[i][0] < (idade_soma/5)) {
				System.out.println("Pessoa "+i+" Idade: "+todos[i][0]);
			}
			if (todos[i][1] < (altura_soma/5)) {
				System.out.println("Pessoa "+i+" Altura: "+todos[i][1]);
			}
		}
		System.out.println("---------");
		System.out.println("Dados do Mais Baixo: ");
		System.out.printf("Idade: %d, Altura: %fm \n",(int)mais_baixo[0],mais_baixo[1]);
		System.out.println("---------");
		System.out.println("Dados do Mais Alto: ");
		System.out.printf("Idade: %d, Altura: %fm \n",(int)mais_alto[0],mais_alto[1]);
		System.out.println("---------");
		System.out.println("Dados do Mais Novo: ");
		System.out.printf("Idade: %d, Altura: %fm \n",(int)mais_novo[0],mais_novo[1]);
		System.out.println("---------");
		System.out.println("Dados do Mais Velho: ");
		System.out.printf("Idade: %d, Altura: %fm \n",(int)mais_velho[0],mais_velho[1]);
		
		scan.close();
	}

}
