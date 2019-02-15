package b_control;

import java.util.Scanner;

public class Main_13 {

	public static void main(String[] args) {
		int cont_100=0;
		int cont_50=0;
		int cont_20=0;
		int cont_10=0;
		int cont_5=0;
		int cont_2=0;
		int cont_1=0;
		int cantidad;
		
		cantidad = new Scanner(System.in).nextInt();
		
			cont_100 = cantidad / 100;
			cantidad %= 100;
			
			cont_50 = cantidad / 50;
			cantidad %= 50;
			
			cont_20 = cantidad / 20;
			cantidad %= 20;
			
			cont_10 = cantidad / 10;
			cantidad %= 10;
			
			cont_5 = cantidad / 5;
			cantidad %= 5;
			
			cont_2 = cantidad / 2;
			cantidad %= 2;
			
			cont_1 = cantidad / 1;
		
		if(cont_100!=0)
			System.out.println("Billetes de 100: " + cont_100);
		
		if(cont_50!=0)
			System.out.println("Billetes de 50: " + cont_50);
		
		if(cont_20!=0)
			System.out.println("Billetes de 20: " + cont_20);
		
		if(cont_10!=0)
			System.out.println("Billetes de 10: " + cont_10);
		
		if(cont_5!=0)
			System.out.println("Billetes de 5: " + cont_5);
		
		if(cont_2!=0)
			System.out.println("Billetes de 2: " + cont_2);
		
		if(cont_1!=0)
			System.out.println("Billetes de 1: " + cont_1);
		
	}

}

