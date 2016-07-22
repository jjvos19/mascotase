package pro.componentes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Predicate;

import pro.entidades.Animal;
import pro.entidades.Genero;
import pro.entidades.ListaAnimales;

public class ManejadorAnimal {

	private static final int PARTE_TIPO = 0;
	private static final int PARTE_NOMBRE = 1;
	private static final int PARTE_GENERO = 2;
	private static final int PARTE_INGRESO = 3;

	public static final String SEPARADOR = ",";
	public static final String FORMATO_FECHA = "yyyyMMdd-HHmmss";

	public static Animal parse(String datos){
		String[] partes = datos.split(SEPARADOR);
		// 0: TIPO
		// 1: GENERO
		// 2: NOMBRE
		// 3: INGRESO
		Animal animal;
		try {
			animal = new Animal();
			animal.setTipo(partes[PARTE_TIPO]);
			Genero g = Genero.valueOf(partes[PARTE_GENERO]);
			animal.setGenero(g);
			animal.setNombre(partes[PARTE_NOMBRE]);
			DateFormat df = new SimpleDateFormat(FORMATO_FECHA);
			try {
				Date fecha = df.parse(partes[PARTE_INGRESO]);
				animal.setIngreso(fecha);
			} catch (ParseException e) {
				e.printStackTrace();
				animal = null;
			}
		} catch(Exception ex){
			ex.printStackTrace();
			animal = null;
		}

		return animal;
	}

	/**
	 * Convierte una clase {@link Animal} en una cadena.
	 * @param animal Objeto animal.
	 * @return Devuelve una cadena que representa al animal, si el parametro es null devuelve una cadena vacia.
	 */
	public static String toString(Animal animal) {
		if (animal == null){
			return "";
		}
		DateFormat df = new SimpleDateFormat(FORMATO_FECHA);
		String cuerpo = animal.getTipo()+ SEPARADOR + animal.getNombre() + SEPARADOR +
				animal.getGenero().toString()+SEPARADOR + df.format(animal.getIngreso());
		return cuerpo;
	}
	
	private ListaAnimales lista;
	
	public ManejadorAnimal(){
		lista = new ListaAnimales();
	}
	
	public ListaAnimales getLista(){
		return lista;
	}
}
