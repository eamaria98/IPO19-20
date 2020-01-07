package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class Circuito {
	
	private String ciudad;
	private String monumento;
	private String restaurante;
	private String tienda;
	private URL foto;
	
	public Circuito(String ciudad, String monumento, String restaurante, String tienda, URL foto) {
		super();
		this.ciudad=ciudad;
		this.monumento=monumento;
		this.restaurante=restaurante;
		this.tienda=tienda;
		this.foto=foto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getMonumento() {
		return monumento;
	}

	public void setMonumento(String monumento) {
		this.monumento = monumento;
	}

	public String getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public URL getFoto() {
		return foto;
	}

	public void setFoto(URL foto) {
		this.foto = foto;
	}
	
	public static ArrayList<Circuito> generarCircuitos() {
		ArrayList<Circuito> circuitos=new ArrayList<Circuito>();
		circuitos.add(new Circuito("Almodovar del Campo","Museo Palmero"," Bar Restaurante La Era","Antonio Ñacle",Circuitos.class.getResource("/presentacion/museo_palmero.jpg")));
		circuitos.add(new Circuito("Almagro", "Museo Nacional del Teatro", "Restaurante La Muralla", "La Boutique del Sabor", Circuitos.class.getResource("/presentacion/museo_almagro.jpg")));
		circuitos.add(new Circuito("Campo de Criptana", "Molino Burleta", "Restaurante Las Musas", "Zahara", Circuitos.class.getResource("/presentacion/molinos.jpg")));
		circuitos.add(new Circuito("Ciudad Real", "Alarcos", "Orosia", "Pilar Prieto", Circuitos.class.getResource("/presentacion/alarcos.jpg")));
		circuitos.add(new Circuito("Miguelturra", "Ermita del Santisimo Cristo", "Restaurante Las Tejas", "Mundo Etnico", Circuitos.class.getResource("/presentacion/ermita_miguelturra.jpg")));
		circuitos.add(new Circuito("Ruidera", "Lagunas de Ruidera", "Restaurante Victoria", "El Rincon de la Mancha", Circuitos.class.getResource("/presentacion/lagunas_ruidera.jpg")));
		circuitos.add(new Circuito("Almaden", "Parque minero", "Restaurante Asador La Taberna", "Novedades Hebe", Circuitos.class.getResource("/presentacion/parque_minero.jpg"))); 
		return circuitos;
	}
}
