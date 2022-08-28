package exercicios_resolvidos;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
				"r","s","t","u","v","w","x","y","z"};
		String senha = "";
		int posicao = 1;
		int tam_senha=100;
		
		while (tam_senha > alfabeto.length-1) {
			tam_senha = scan.nextInt();
		}
		
		for (int i=0;i<=tam_senha;i++) {
			System.out.println(senha);
			if (posicao%2==0) {
				int j = i;
				while (alfabeto[j] != "a" && alfabeto[j] != "e" && alfabeto[j] != "i" 
						&& alfabeto[j] != "o" && alfabeto[j] != "u") {
					j += 1;
				}
				senha += alfabeto[j];
			} else {
				int j = i;
				while (!(alfabeto[j] != "a" && alfabeto[j] != "e" && alfabeto[j] != "i" 
						&& alfabeto[j] != "o" && alfabeto[j] != "u")) {
					j += 1;
				}
				senha += alfabeto[j];
			}
			posicao += 1;
		}
		
		scan.close();
	}

}
