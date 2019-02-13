package b_control;

import java.util.ArrayList;
import java.util.Collections;

public class Main_11 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(99);
		list.add(72);
		list.add(3);
		list.add(72);
		list.add(1);
		list.add(45);
		
		int min = Collections.min(list);
		int min_index = list.indexOf(min);
		
		
		System.out.println("El mínimo es: " + min);
		System.out.println("Su índice es: " + min_index);
		
		

	}

}
