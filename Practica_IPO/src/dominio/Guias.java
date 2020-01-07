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
	private String historial_rutas;
	private URL foto;

	public Guias(String nombre, String apellidos, String idiomas, String restricciones, String telefono, String correo,
			String precio_hora, String puntuacion, String historial_rutas, URL foto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idiomas = idiomas;
		this.restricciones = restricciones;
		this.telefono = telefono;
		this.correo = correo;
		this.precio_hora = precio_hora;
		this.puntuacion = puntuacion;
		this.historial_rutas = historial_rutas;
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

	public String getHistorial_rutas() {
		return historial_rutas;
	}

	public void setHistorial_rutas(String historial_rutas) {
		this.historial_rutas = historial_rutas;
	}

	public URL getFoto() {
		return foto;
	}

	public void setFoto(URL foto) {
		this.foto = foto;
	}

	public static ArrayList<Guias> generarGuias() {
		ArrayList<Guias> guias = new ArrayList<Guias>();
		guias.add(new Guias("Ricardo", "Espinosa Vargas", "Español, ingles y frances", "Solo horario de mañana",
				"034654321987", "ricardotour@gmail.com", "25 €", "4/5", "Almodovar del Campo, Puertollano, Argamasilla, Brazatortas",
				GuiasTuristicos.class.getResource("/presentacion/hombre1.jpg")));
		guias.add(new Guias("Ana", "Jimeno Ruiz", "Español e ingles", "Solo horario de tarde", "034664586473",
				"anatour@gmail.com", "30 €", "5/5", "Los Cortijos, El Robledo, Porzuna, Malagon", GuiasTuristicos.class.getResource("/presentacion/mujer1.jpg")));
		guias.add(new Guias("Jose Manuel", "Bastante Rodriguez", "Español e ingles", "Solo horario de tarde",
				"034652146732", "carlostour@gmail.com", "30 €", "4/5", "Almaden, Saceruela, Puebla de Don Rodrigo",
				GuiasTuristicos.class.getResource("/presentacion/hombre2.jpg")));
		guias.add(new Guias("Marta", "Lopez Bejarano", "Español, ingles y frances", "Horario de mañana y tarde",
				"034647529861", "martatour@gmail.com", "25 €", "4/5", "Miguelturra, Ciudad Real, Daimiel, Manzanares, Membrilla",
				GuiasTuristicos.class.getResource("/presentacion/mujer2.jpg")));
		guias.add(new Guias("Elena", "Vozmediano Toledano", "Español e ingles", "Solo horario de mañana", "034677854167",
				"elenatour@gmail.com", "25 €", "4/5", "La Solana, Ruidera, Alhambra, San Carlos del Valle", GuiasTuristicos.class.getResource("/presentacion/mujer3.jpg")));
		guias.add(new Guias("Oscar", "Dominguez Ocaña", "Español e ingles", "Solo horario de tarde", "034637335121",
				"oscartour@gmail.com", "30 €", "5/5", "Montiel, Aldabejo, Villamanrique, Torre de Juan Abad", GuiasTuristicos.class.getResource("/presentacion/hombre3.jpg")));
		return guias;
	}

}
