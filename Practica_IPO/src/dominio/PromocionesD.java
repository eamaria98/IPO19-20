package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class PromocionesD {

	private String ciudad;
	private String circuito;
	private String descuento;
	private String validez;
	private URL foto;
	
	public PromocionesD(String ciudad, String circuito, String descuento, String validez, URL foto) {
		super();
		this.ciudad = ciudad;
		this.circuito = circuito;
		this.descuento = descuento;
		this.validez = validez;
		this.foto = foto;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public String getValidez() {
		return validez;
	}
	public void setValidez(String validez) {
		this.validez = validez;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	
	public static ArrayList<PromocionesD> generarPromocion() {
		ArrayList<PromocionesD> promociones =new ArrayList<PromocionesD>();
		promociones.add(new PromocionesD("Almodovar del Campo","Museo Palmero","50% en grupos mayores a 10 personas","09/01/20-09/02/20", Circuitos.class.getResource("/presentacion/museo_palmero_S.jpg")));
		promociones.add(new PromocionesD("Almagro", "Museo Nacional del Teatro", "Niños gratis si son menores de 12 años","11/01/20-22/02/20", Circuitos.class.getResource("/presentacion/museo_almagro_S.jpg")));
		promociones.add(new PromocionesD("Almaden", "Parque minero", "25% para colegios","08/01/20-22/06/20", Circuitos.class.getResource("/presentacion/parque_minero_S.jpg"))); 
		return promociones;
	}
}
