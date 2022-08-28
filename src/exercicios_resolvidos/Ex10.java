package exercicios_resolvidos;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe data: dd/mm/aaaa: ");
		String data = scan.nextLine();
		if (data.length() == 10) {
			String[] array_data = new String[3];
			array_data = data.split("/");
			boolean is_valid_date = true;
			int dia = Integer.parseInt(array_data[0]);
			int mes = Integer.parseInt(array_data[1]);
			int ano = Integer.parseInt(array_data[2]);
			System.out.println("Dia: "+dia);
			System.out.println("Mes: "+mes);
			System.out.println("Ano: "+ano);
			//campo dia
			if (dia > 31) {
				is_valid_date = false;
			}
			//campo mes
			if (mes > 12 || mes <= 0) {
				is_valid_date = false;
			}
			//campo ano
			if (ano > 9999 || ano <= 0) {
				is_valid_date = false;
			}
			
			//mensagem
			if (is_valid_date == true) {
				System.out.println("VALIDA");
			} else {
				System.out.println("INVALIDA");
			}
			
		} else {
			System.out.println("DATA INVALIDA");
		}
		
		scan.close();
	}

}
