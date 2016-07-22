package pro.entidades;

import static org.junit.Assert.*;

// import org.hamcrest.core.IsNot;
import org.junit.Test;

public class AnimalTest {

	@Test
	public void testAnimal() {
		Animal animal = new Animal();
		assertNotNull("No debe ser null", animal);
		assertEquals("Debe ser M", Genero.M, animal.getGenero());
	}
}
