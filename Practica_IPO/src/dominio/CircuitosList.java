package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class CircuitosList {

	private String ciudad;
	private String participantes;
	private String entrada;
	private String incidencias;
	private String opiniones;
	private URL foto;
	
	public CircuitosList(String ciudad, String participantes, String entrada, String incidencias, String opiniones, URL foto) {
		super();
		this.ciudad = ciudad;
		this.participantes = participantes;
		this.entrada = entrada;
		this.incidencias = incidencias;
		this.opiniones = opiniones;
		this.foto = foto;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getParticipantes() {
		return participantes;
	}
	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}
	public String getIncidencias() {
		return incidencias;
	}
	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}
	public String getOpiniones() {
		return opiniones;
	}
	public void setOpiniones(String opiniones) {
		this.opiniones = opiniones;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	
	public static ArrayList<CircuitosList> generarCircuito() {
		ArrayList<CircuitosList> circuitosList =new ArrayList<CircuitosList>();
		circuitosList.add(new CircuitosList("Almodovar del Campo","74","2.5 €","Sin Incidencias","*<Andres>El guia muy amable, se comporto muy bien con nosotros\n*<Maria>Un lugar maravilloso estoy muy contenta de haber hecho este recorrido",Circuitos.class.getResource("/presentacion/museo_palmero.jpg")));
		circuitosList.add(new CircuitosList("Almagro", "105", "Gratuita","Sin incidencias","*<Sun>Sin duda lo mejor ha sido hacerlo durante la feria del teatro\n*<Sussana>Almagro es un lugar precioso y el museo por dentro aun mas\n*<David>El guia fue muy amable con nosotros y nos explico todas las dudas que surgian", Circuitos.class.getResource("/presentacion/museo_almagro.jpg")));
		circuitosList.add(new CircuitosList("Campo de Criptana", "33", "Gratuita","Sin incidencias","*<Mario>Los molinos son preciosos, te sientes como en un libro", Circuitos.class.getResource("/presentacion/molinos.jpg")));
		circuitosList.add(new CircuitosList("Ciudad Real", "42", "De 3 € hasta 5 €","Rotura de tobillo de un turista","*<Sergio>Uno de los yacimientos arqueologicos mejor conservados de la provincia\n*<Carlota>Fuimos con la facultad y sin duda una de las mejores experiencias", Circuitos.class.getResource("/presentacion/alarcos.jpg")));
		circuitosList.add(new CircuitosList("Miguelturra", "53","Gratuita","Sin incidencias","*<Laura>A mi madre le encanta venir todos los años", Circuitos.class.getResource("/presentacion/ermita_miguelturra.jpg")));
		circuitosList.add(new CircuitosList("Ruidera", "34", "Gratuita","Sin incidencias","*<Victoria>Unos de los parques naturales mas bonitos que tenemos, es una pena que este tan bajo de agua\n*<Daniel>Es precioso ver como las grullas alzan el vuelo", Circuitos.class.getResource("/presentacion/lagunas_ruidera.jpg")));
		circuitosList.add(new CircuitosList("Almaden", "15", "De 10 € hasta 14 €","Uno de los niños se perdio de vista durante unos momentos","*<Alicia>Llevamos a los niños del colegio y les encanto", Circuitos.class.getResource("/presentacion/parque_minero.jpg"))); 
		return circuitosList;
	}
}
