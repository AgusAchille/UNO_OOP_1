package z_pruebas;

public class Main {

	public static void main(String[] args) {
		char letra;
		boolean result;
		
		// ES UNA LETRA?
		letra = 'n';
		result = Character.isLetter(letra);
		System.out.println(letra + " es una letra? " + result);
		
		// ES UNA NÚMERO?
		letra = '5';
		result = Character.isDigit(letra);
		System.out.println(letra + " es un número? " + result);

	}

}
