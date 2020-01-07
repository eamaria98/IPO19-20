package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class CircuitoAmp {

	private String ciudad;
	private String monumento;
	private String entrada;
	private String horario;
	private String duracion;
	private String tipologia;
	private String descripcion;
	private URL foto;
	
	public CircuitoAmp(String ciudad, String monumento, String entrada, String horario, String duracion, String tipologia,
			String descripcion, URL foto) {
		super();
		this.ciudad = ciudad;
		this.monumento = monumento;
		this.entrada = entrada;
		this.horario = horario;
		this.duracion = duracion;
		this.tipologia = tipologia;
		this.descripcion = descripcion;
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
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	
	public static ArrayList<CircuitoAmp> generarCircuito() {
		ArrayList<CircuitoAmp> circuitosAmp =new ArrayList<CircuitoAmp>();
		circuitosAmp.add(new CircuitoAmp("Almodovar del Campo","Museo Palmero","2.5 €","De 9:00-14:00 y 17:00-19:00","1 hora y 30 min aprox","Museo","Alfredo Palmero de Gregorio nació en Almodóvar del Campo en 1901, precisamente en el caserón que desde la década de 1960 alberga el citado museo. Se convirtió en uno de los pintores españoles más conocidos en el siglo XX. Tras su formación en la Real Academia de Bellas Artes de San Fernando de Madrid y posterior etapa de profesor, el “Maestro Palmero” cosechó grandes éxitos con sus exposiciones",Circuitos.class.getResource("/presentacion/museo_palmero.jpg")));
		circuitosAmp.add(new CircuitoAmp("Almagro", "Museo Nacional del Teatro", "Gratuita","De 10:00-14:00 y 16:00-18:00","2/3 horas aprox","Museo","El Museo Nacional del Teatro es una institución española dedicada a la promoción y salvaguardia del teatro español, que forma parte de la red de Museos Nacionales, y que está localizado en la localidad castellano-manchega de Almagro (Ciudad Real). La nueva sede fue inaugurada el 4 de febrero de 2004 por los Reyes de España. En la actualidad su gestión está transferida al Instituto Nacional de las Artes Escénicas y de la Música (INAEM), dependiente del Ministerio de Cultura y Deporte.", Circuitos.class.getResource("/presentacion/museo_almagro.jpg")));
		circuitosAmp.add(new CircuitoAmp("Campo de Criptana", "Molino Burleta", "Gratuita","De 10:00-14:00 y 16:00-18:30","2 horas aprox","Molinos de viento","También conocido como Burlapobres, la denominación hace alusión, probablemente, a la sospecha de prácticas fraudulentas por parte del molinero. Conserva la estructura y mecanismo originales del siglo XVI", Circuitos.class.getResource("/presentacion/molinos.jpg")));
		circuitosAmp.add(new CircuitoAmp("Ciudad Real", "Alarcos", "De 3 € hasta 5 €","De 10:00-18:00","45 min/1 hora aprox","Yacimiento arqueologico","Parque arqueológico muy importante de la historia de la Reconquista castellana y a una aldea próxima llamada Pozo Seco de Don Gil que se refundó como nueva capital por orden de Alfonso X el Sabio y la nombró Villa Real, más tarde se le otorgó el título de ciudad pasando a ser Ciudad Real. Los hallazgos arqueológicos demuestran la ocupación humana del cerro desde la Edad del Bronce hasta la Plena Edad Media, con un largo periodo intermedio de despoblación en la época romana y visigoda. Los trabajos de excavación y restauración que se vienen realizando en el yacimiento desde 1984 han permitido recuperar un sector de la trama urbana de la ciudad íbera, así como buena parte de la muralla y del castillo medievales.", Circuitos.class.getResource("/presentacion/alarcos.jpg")));
		circuitosAmp.add(new CircuitoAmp("Miguelturra", "Ermita del Santisimo Cristo","Gratuita","De 10:00-20:00","30/45 min aprox","Iglesia Catolica","Edificio religioso que se levanta en la localidad de Miguelturra (Ciudad Real), se la conoce popularmente como la torre gorda. Se trata de una construcción cilíndrica acabada a principios del siglo XIX. Está coronada por una cúpula y rematada con cimborrio y linterna. Dentro se venera a la imagen del Santísimo Cristo de la Misericordia, patrón de la localidad. Está declarada Monumento Histórico Artístico, siendo la última obra de renacentista de la región.", Circuitos.class.getResource("/presentacion/ermita_miguelturra.jpg")));
		circuitosAmp.add(new CircuitoAmp("Ruidera", "Lagunas de Ruidera", "Gratuita","Abierto las 24 horas","5/6 horas aprox","Parque natural","Espacio natural protegido y una de los grandes humedales de importancia situado en la comunidad autónoma española de Castilla-La Mancha. Forman el parque natural un conjunto de dieciséis remansos o lagunas fluviales a lo largo del valle del Guadiana Viejo, como continuación del río Pinilla por su afluencia sureste, y por su afluencia noreste a lo largo del Arroyo Alarconcillo; separados y conectados entre sí por barreras de formación tobácea o travertino.", Circuitos.class.getResource("/presentacion/lagunas_ruidera.jpg")));
		circuitosAmp.add(new CircuitoAmp("Almaden", "Parque minero", "De 10 € hasta 14 €","De 10:30-14:00 y 15:30-19:00","3 horas aprox","Museo","Es herencia viva de los dos mil años de la explotación de Almadén. Tras el cierre de la actividad minera en 2003, las minas más antiguas del mundo cuya actividad se ha mantenido hasta nuestros días, muestran sus secretos. El Parque Minero de Almadén empezó a recibir visitantes en septiembre de 2006, aunque fue inaugurado en enero de 2008.\r\n" + 
				"\r\n" + 
				"El mercurio, la plata viva de los romanos, se muestra en el Parque en todos sus aspectos, la extracción de su mineral, el cinabrio, sulfuro de mercurio, su transformación en los hornos metalúrgicos, sus propiedades físicas y químicas, sus usos y, como no, su eterna historia.", Circuitos.class.getResource("/presentacion/parque_minero.jpg"))); 
		return circuitosAmp;
	}

	public String getMonumento() {
		return monumento;
	}

	public void setMonumento(String monumento) {
		this.monumento = monumento;
	}
	
}
