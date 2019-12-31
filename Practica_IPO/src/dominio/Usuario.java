package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class Usuario {
	private String user;
	private String passwd;
	private String Conexion;
	private URL foto; //ruta con la foto, imporar antes
	public Usuario(String user, String passwd, String conexion, URL foto) {
		super();
		this.user = user;
		this.passwd = passwd;
		Conexion = conexion;
		this.foto = foto;
	}
	public String getUsuario() {
		return user;
	}
	public void setUsuario(String usuario) {
		this.user = user;
	}
	public String getPass() {
		return passwd;
	}
	public void setPass(String pass) {
		this.passwd = passwd;
	}
	public String getConexion() {
		return Conexion;
	}
	public void setConexion(String conexion) {
		Conexion = conexion;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	public static ArrayList<Usuario> generarUsuario() {
		ArrayList<Usuario> usuarios =new ArrayList<Usuario>();
		usuarios.add(new Usuario("Andres Gutierrez","agc1995","04/01/20 10:02",Circuitos.class.getResource("/presentacion/user_andres.jpg")));
		usuarios.add(new Usuario("Maria Espinosa","mea1998","09/01/20 19:45",Circuitos.class.getResource("/presentacion/user_maria.jpg")));
		return usuarios;
	}
	
}
