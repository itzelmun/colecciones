package ejemplo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class EjemploHashSetAgregar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//uso de un HasSet 
		//un Set no repite elementos repetidos
		HashSet <String> hashSet = new HashSet <>();
		
		hashSet.add("uno");
		hashSet.add("dos");
		hashSet.add("tres");
		hashSet.add("dos");
		
		System.out.println(hashSet);
		
		//
		ArrayList <String> lista = new ArrayList<>();
		lista.add("uno");
		lista.add("Dos");
		lista.add("Tes");
		//collection es el padre set y de list
		//sort es método para ordenar elementos dentro de una coleccion, pero los ordena por alfabeto si es string
		Collections.sort(lista);
		System.out.println(lista);
		
		//en coleccion numerica el sort los ordena alfabeticamente
		ArrayList <Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(2);
		
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		
		
		//el .get el para acceder a la posicion predeterminada del parámetro
		//uso de equals, que compara si un objeto es igual a otro
		//compara las posiciones 0 y 1 del array lista y dice si son iguales o no
		String valor = lista.get(0);
		String valor2= lista.get(1);
		
		if(valor.equals(valor2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("son diferentes");
		}
		
		
	}

}
