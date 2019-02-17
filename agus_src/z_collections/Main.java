package z_collections;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Carta uno_oro = new Carta(1, Carta.ORO);
		Carta dos_oro = new Carta(2, Carta.ORO);	
		Carta tres_oro = new Carta(3, Carta.ORO);
		Carta cuatro_oro = new Carta(4, Carta.ORO);
		
		System.out.println(uno_oro.hashCode());
		System.out.println(dos_oro.hashCode());
		
		System.out.println(uno_oro.equals(dos_oro));
		
		TreeSet<Carta> cartas = new TreeSet<Carta>();
		
		cartas.add(tres_oro);
		cartas.add(uno_oro);
		cartas.add(cuatro_oro);
		cartas.add(dos_oro);
		
		System.out.println(cartas);
		
	}

}
