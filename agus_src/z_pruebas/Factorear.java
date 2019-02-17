package z_pruebas;

import java.util.*;

public class Factorear {

	public static void main(String[] args) {
		fact(3256);
	}

	public static void fact(int number) {
		int copy = number;
		ArrayList<Integer> factores = new ArrayList<Integer>();

		for (int i = 2; i < copy; i++) {
			while (copy % i == 0) {
				factores.add(i);
				copy /= i;
			}
		}
		
		if(copy>1)
			factores.add(copy);
		System.out.println(number+"=");
		System.out.println(factores);

	}

}
