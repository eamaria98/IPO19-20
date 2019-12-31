package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.GuiasTuristicos;

public class Guias {
	
	private String nombre; 
	private String apellidos;
	private String idiomas; 
	private String restricciones; 
	private String telefono; 
	private String correo; 
	private String precio_hora;
	private String puntuacion; 
	//private String historial_rutas;
	private URL foto;
	public Guias(String nombre, String apellidos, String idiomas, String restricciones, String telefono, String correo,
			String precio_hora, String puntuacion, URL foto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idiomas = idiomas;
		this.restricciones = restricciones;
		this.telefono = telefono;
		this.correo = correo;
		this.precio_hora = precio_hora;
		this.puntuacion = puntuacion;
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
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public String getRestricciones() {
		return restricciones;
	}
	public void setRestricciones(String restricciones) {
		this.restricciones = restricciones;
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
	public String getPrecio_hora() {
		return precio_hora;
	}
	public void setPrecio_hora(String precio_hora) {
		this.precio_hora = precio_hora;
	}
	public String getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	
	public static ArrayList<Guias> generarGuias() {
		ArrayList<Guias> guias =new ArrayList<Guias>();
		guias.add(new Guias("Ricardo","Espinosa Vargas","Español, ingles y frances","Solo horario de mañana", "654321987","ricardotour@gmail.com","35 €", "4/5",GuiasTuristicos.class.getResource("/presentacion/fotos/hombre.jpeg")));
		
		return guias;
	}
	
	
	
	

}
