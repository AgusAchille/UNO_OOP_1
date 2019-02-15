package c_funciones;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		int dia_1, mes_1, year_1;
		int dia_2, mes_2, year_2;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese día 1: ");
		dia_1 = input.nextInt();

		System.out.println("Ingrese mes 1: ");
		mes_1 = input.nextInt();

		System.out.println("Ingrese año 1: ");
		year_1 = input.nextInt();

		System.out.println("Ingrese día 2: ");
		dia_2 = input.nextInt();

		System.out.println("Ingrese mes 2: ");
		mes_2 = input.nextInt();

		System.out.println("Ingrese año 2: ");
		year_2 = input.nextInt();

		calcularFechaPosterior(dia_1, mes_1, year_1, dia_2, mes_2, year_2);

	}

	static void calcularFechaPosterior(int dia_1, int mes_1, int year_1, int dia_2, int mes_2, int year_2) {

		int fecha_posterior = 0; // por defecto son iguales

		String fecha_1 = dia_1 + "/" + mes_1 + "/" + year_1;
		String fecha_2 = dia_2 + "/" + mes_2 + "/" + year_2;

		if (year_1 > year_2)
			fecha_posterior = 1;

		else if (year_2 > year_1)
			fecha_posterior = 2;

		else if (mes_1 > mes_2)
			fecha_posterior = 1;

		else if (mes_2 > mes_1)
			fecha_posterior = 2;

		else if (dia_1 > dia_2)
			fecha_posterior = 1;

		else if (dia_2 > dia_1)
			fecha_posterior = 2;
		
		switch(fecha_posterior) {
			case 0:
				System.out.println("Las fechas son iguales");
				break;
			case 1:
				System.out.println("La fecha " + fecha_1 + " es la posterior");
				break;
			case 2:
				System.out.println("La fecha " + fecha_2 + " es la posterior");
				break;
		}
		
		System.out.println("Fecha 1: " + fecha_1);
		System.out.println("Fecha 2: " + fecha_2);
	}

}