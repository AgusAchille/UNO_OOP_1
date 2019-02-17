package z_collections;

import java.util.*;

public class Main_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> alumnos = new LinkedHashMap<Integer, String>();

		alumnos.put(22, "Nancy");
		alumnos.put(33, "Cecilia");
		alumnos.put(25, "Agustín");
		alumnos.put(34, "Angélica");
		alumnos.put(16, "Diego");
		
		System.out.println(alumnos);

		// ------------------------------------------------------------------------------
		// Obtenemos un set de Map.Entry<K,V> del HashMap
		Set<Map.Entry<Integer, String>> set_alumnos = alumnos.entrySet();

		// Recorrerlo con for each
		for (Map.Entry<Integer, String> for_alumno : set_alumnos) {
			System.out.println(for_alumno.getKey());
			System.out.println(for_alumno.getValue() + "\n");
		}

		System.out.println("-------------------------------------------------------------");
		// Recorrerlo con iterador para remover elemento
		Iterator<Map.Entry<Integer, String>> iterator = set_alumnos.iterator();

		Map.Entry<Integer, String> alumno;
		while (iterator.hasNext()) {
			alumno = iterator.next();
			System.out.println(alumno.getKey());
			System.out.println(alumno.getValue() + "\n");

			if (alumno.getValue().equals("Cecilia"))
				iterator.remove();
		}

		System.out.println("Set: " + set_alumnos);
		System.out.println("Map: " + alumnos);//tambien lo elimina del map
		// ----------------------------------------------------------------------------------
	}

}
