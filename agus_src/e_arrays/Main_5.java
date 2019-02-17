package e_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[100];
		int[] repeticiones = new int[100];
		
		int numero_ingresado;
		int indice_numero_nuevo = 0;
		int indice_numero_repetido = 0;
		boolean ya_se_ingreso;
		
		numero_ingresado = input.nextInt();
		
		while(numero_ingresado != 0) {
			indice_numero_repetido = Arrays.binarySearch(numeros, numero_ingresado);
			
			if(indice_numero_repetido < 0)
				ya_se_ingreso = false;
			else 
				ya_se_ingreso = true;
			
			System.out.println(indice_numero_repetido);
			
			numeros[0] = numero_ingresado;
			
			/*
			if(ya_se_ingreso)
				repeticiones[indice_numero_repetido]++;
			else {
				numeros[indice_numero_nuevo] = numero_ingresado;
				repeticiones[indice_numero_nuevo]++;
				indice_numero_nuevo++;
			}
			
			for(int i=0; i<10; i++) {
				System.out.println("Número: " + numeros[i] + ", Cantidad: " + repeticiones[i]);
			}
			*/
			numero_ingresado = input.nextInt();
		}
	}
}
