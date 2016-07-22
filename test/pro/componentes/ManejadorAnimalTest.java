package pro.componentes;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import pro.entidades.*;

import org.junit.Test;

public class ManejadorAnimalTest {

	private String fecha = "20131231-145934";
	private String cadenaAnimal = "GATO,Perla,F,"+fecha; 
	
	@Test
	public void testParse() {
		DateFormat df = new SimpleDateFormat(ManejadorAnimal.FORMATO_FECHA);
		Animal animal = new Animal();
		animal.setGenero(Genero.F);
		animal.setNombre("Perla");
		animal.setTipo("GATO");
		Date date = null;
		try{
			date = df.parse(fecha);
		} catch(Exception ex){
			date = new Date();
		}
		
		animal.setIngreso(date);
		
		Animal animalGenerado = ManejadorAnimal.parse(cadenaAnimal);
		assertNotNull("No debe ser null", animalGenerado);
		assertEquals("Debe ser tipo GATO",  animal.getTipo(), animalGenerado.getTipo());
		assertEquals("Se llama Perla", animal.getNombre(), animalGenerado.getNombre());
		assertEquals("Debe ser Femenino (F)", "F", animalGenerado.getGenero().toString());
		assertEquals("Debe ser Femenino (F)*", animal.getGenero(), animalGenerado.getGenero());
		assertEquals("Debe tener la fecha del 2013", df.format(animal.getIngreso()), df.format(animalGenerado.getIngreso()));
	}

	@Test
	public void testToStringAnimal() {
		DateFormat df = new SimpleDateFormat(ManejadorAnimal.FORMATO_FECHA);
		Animal animal = new Animal();
		animal.setGenero(Genero.F);
		animal.setNombre("Perla");
		animal.setTipo("GATO");
		Date date = null;
		try{
			date = df.parse(fecha);
		} catch(Exception ex){
			date = new Date();
		}
		
		animal.setIngreso(date);
		
		String animalACadena = ManejadorAnimal.toString(animal);
		assertEquals("Deben tener el mismo formato", animalACadena, cadenaAnimal);
	}

}
