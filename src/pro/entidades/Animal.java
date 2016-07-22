package pro.entidades;

import java.util.Date;

public class Animal {
	
	private String tipo;

	private Genero genero;

	private String nombre;

	private Date ingreso;

	public Animal(){
		setTipo("-");
		setGenero(Genero.M);
		setNombre("?");
		setIngreso(null);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
}
