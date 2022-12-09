package Iterador;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Persona;

public class EjemploIteradorObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona personaUno = new Persona("Itzel", "21", "itzeliwis");
		Persona personaDos = new Persona ("Sanchez", "22", "Itzelota");
		Persona personaTres = new Persona ("Munguia", "27", "Itzelo");
		
		ArrayList<Persona> listaPersona = new ArrayList<>();
		
		listaPersona.add(personaUno);
		listaPersona.add(personaDos);
		listaPersona.add(personaTres);
		
		for (Persona recorrerPersona : listaPersona) {
			System.out.println(recorrerPersona);
		}
		
		for (Persona recorrerPer : listaPersona) {
			System.out.println(recorrerPer.getEdad());
			System.out.println(recorrerPer.getIdentificacionUnica());
			System.out.println(recorrerPer.getNombre());
		}
		Iterator<Persona> iterador = listaPersona.iterator();
		
		while (iterador.hasNext()) {
			//imprime solo el nombre, no todos los parametros de los objetos
			System.out.println(iterador.next().getNombre());
			
			
		}
		
	}

}
