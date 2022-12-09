package Iterador;

import java.util.Iterator;
import java.util.TreeSet;

public class EjemploIterador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//el treeSet ordena alfabeticamente o numericamente y no permite que ningun valor se repita
		TreeSet<String> listaNombres = new TreeSet<>();
		listaNombres.add("Itzel");
		listaNombres.add("Guadalupe");
		listaNombres.add("Sanchez");
		listaNombres.add("Munguia");
		listaNombres.add("Itzel");
		
		System.out.println(listaNombres);
		
		//for mejorado
		for(String nombres: listaNombres) {
			System.out.println(nombres);
		}
		
		//declaramos una clase de tipo iterator para recorrer los nombres
		Iterator <String> iterador = listaNombres.iterator();
		
		//dentro de while va una expresion logica: falso o verdadero
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
			
		}
		
		
		
	}

}
