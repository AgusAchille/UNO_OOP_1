package e_arrays;

import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {
		String[] oraciones = new String[5];
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<5; i++){
			System.out.println("Ingrese la linea " + (i+1) + ": ");
			oraciones[i] = input.nextLine();
		}
		
		for (int i=4; i>=0; i--) {
			System.out.print(oraciones[i]);
		}
		
	}
}
