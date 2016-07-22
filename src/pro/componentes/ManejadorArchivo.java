package pro.componentes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

import pro.entidades.Animal;

public class ManejadorArchivo /*extends Manejador*/ {

	private static final String CARACTER_COMENTARIO = "#";
	private String archivo;
	private File archivoFile;
	private ManejadorAnimal manejadorAnimal;

	public ManejadorArchivo(String archivo){
		this.archivo = archivo;
		manejadorAnimal = new ManejadorAnimal();
		inicializar();
	}

	public void inicializar(){
		archivoFile = new File(this.archivo);
		if (archivoFile.isDirectory()){
			System.err.printf("Error, el archivo es un directorio: '%s'\n", this.archivo);
			System.exit(1);
			return;
		}
		if (archivoFile.isFile()){
			cargarDatos();
		}
	}

	public boolean guardar(){
		boolean bandera;
		try{
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFile))){
				LinkedList<Animal> li = manejadorAnimal.getLista().obtenerTodos();
				while(!li.isEmpty()){
					Animal animal = li.poll();
					bw.write(ManejadorAnimal.toString(animal));
				}
			}
			bandera = true;
		} catch(Exception ex){
			bandera = false;
		}

		return bandera;
	}

	private void cargarDatos(){
		String linea;
		Animal animal;
		try{
			try(BufferedReader br = new BufferedReader(new FileReader(archivoFile))){
				while((linea = br.readLine()) != null){
					if (!linea.startsWith(CARACTER_COMENTARIO)){
						animal = ManejadorAnimal.parse(linea);
						if (animal != null) {
							manejadorAnimal.getLista().adicionar(animal);
						}
					}
				}
			}
		} catch(Exception ex){
			System.err.printf("Error: '%s'", ex.getMessage());
		}
	}
}
