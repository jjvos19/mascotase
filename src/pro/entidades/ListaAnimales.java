package pro.entidades;

import java.util.LinkedList;

public class ListaAnimales {

	private LinkedList<Animal> lista;
	
	public ListaAnimales(){
		lista = new LinkedList<>();
	}
	
	public void adicionar(Animal animal){
		lista.add(0, animal);
	}
	
	public LinkedList<Animal> obtenerTodos(){
		LinkedList<Animal> l = new LinkedList<Animal>(lista);
		return l;
	}
	
	public boolean isEmpty(){
		return lista.isEmpty();
	}
}
