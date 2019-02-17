package z_collections;

import java.util.Objects;

public class Carta implements Comparable<Carta>{
	private int numero;
	private int palo;
	public static final int ORO = 1;
	public static final int BASTO = 2;
	public static final int ESPADA = 3;
	public static final int COPA = 4;
	
	public Carta(int numero, int palo) {
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Carta))
			return false;
		Carta other = (Carta) obj;
		return (numero == other.numero) && (palo == other.palo);
	}

	@Override
	public int compareTo(Carta other) {
		int comparacion  = Integer.compare(this.numero, other.numero);
		return comparacion;
	}

	@Override
	public String toString() {
		String palo_string="";
		switch(palo) {
			case 1:
				palo_string = "Oro";
				break;
			case 2:
				palo_string = "Basto";
				break;
			case 3:
				palo_string = "Espada";
				break;
			case 4:
				palo_string = "Copa";
				break;
		}
		return numero + " de " + palo_string + " ";
	}
	
	
}
