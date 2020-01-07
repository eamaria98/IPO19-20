package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.GuiasTuristicos;

public class Turistas {

	private String nombre;
	private String apellidos;
	private String FechaNacimiento;
	private String telefono;
	private String correo;
	private URL foto;

	public Turistas(String nombre, String apellidos, String FechaNacimiento, String telefono, String correo, URL foto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.FechaNacimiento = FechaNacimiento;
		this.telefono = telefono;
		this.correo = correo;
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(String FechaNacimiento) {
		this.FechaNacimiento = FechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public URL getFoto() {
		return foto;
	}

	public void setFoto(URL foto) {
		this.foto = foto;
	}

	public static ArrayList<Turistas> generarTuristas() {
		ArrayList<Turistas> turistas = new ArrayList<Turistas>();
		return turistas;
	}

}
