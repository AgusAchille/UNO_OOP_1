package b_control;

import java.util.*;

public class Main_12 {
	public static void main(String[] args) {
		String matricula;
		int nota;
		String nombre;
		int cantidad_alumnos=0, suma_notas=0;
		int nota_mas_alta=0;
		String nombre_nota_mas_alta="";
		
		while(true) {
			matricula = inputMatricula();
			nota = inputNota();
			nombre = inputNombre();
			
			if(matricula.equals("0") && nota == 0 && nombre.equals("")) {
				break;
			}
			
			cantidad_alumnos++;
			suma_notas +=nota;
			
			if (nota > nota_mas_alta) {
				nota_mas_alta = nota;
				nombre_nota_mas_alta = nombre;
			}
		}
		
		System.out.println("Cantidad de alumnos: " + cantidad_alumnos);
		System.out.println("Nota promedio: " + (double) suma_notas/cantidad_alumnos);
		System.out.println("Nombre del almuno con mejor nota: " + nombre_nota_mas_alta);
		System.out.println("Mejor nota: " + nota_mas_alta);
		
	}
	
	static String inputNombre() {
		Scanner input = new Scanner (System.in);
		String nombre;
		boolean ok;
		
		do {
			System.out.println("Ingrese el nombre: ");
			ok=true;
			nombre = input.nextLine();
			
			if(nombre.length()>10) {
				System.out.println("El nombre no puede ser mayor a 10 caracteres");
				ok=false;				
			}
			
		} while(ok==false);
		
		return nombre;
	}
	
	static int inputNota() {
		Scanner input = new Scanner (System.in);
		int nota;
		boolean ok;
		
		do {
			System.out.println("Ingrese la nota: ");
			ok=true;
			nota = input.nextInt();
			
			if(nota<0 || nota>10) {
				System.out.println("La nota tiene que ser entre 1 y 10");
				ok=false;				
			}
			
		} while(ok==false);
		
		return nota;
	}
	
	
	static String inputMatricula() {
		Scanner input = new Scanner (System.in);
		String matricula;
		boolean ok;
		
		do {
			System.out.println("Ingrese la matrícula: ");
			ok=true;
			matricula = input.next();
			
			if(matricula.length()!=8 && matricula.equals("0")==false) {
				System.out.println("La matrícula tiene que ser de 8 dígitos");
				ok=false;				
			}
			
		} while(ok==false);
		
		return matricula;
	}
}
