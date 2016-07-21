package pro.entidades;

import java.util.LinkedList;

public class ListaAnimales {

	private LinkedList<Animal> lista;
	
	public ListaAnimales(){
		lista = new LinkedList<>();
	}
	
	public void adicionar(Animal animal){
		lista.add(animal);
	}
}
