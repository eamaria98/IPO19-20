package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class ProximosCircuitos {
	
	private String ciudad;
	private String fecha;
	
	public ProximosCircuitos(String ciudad, String fecha) {
		super();
		this.ciudad=ciudad;
		this.fecha=fecha;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public static ArrayList<ProximosCircuitos> generarProximosCircuitos() {
		ArrayList<ProximosCircuitos> circuitos=new ArrayList<ProximosCircuitos>();
		circuitos.add(new ProximosCircuitos("El Robledo","22/03/20"));
		circuitos.add(new ProximosCircuitos("Porzuna", "25/05/20"));
		return circuitos;
	}
}
