package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import presentacion.DisenoRuta.BtnAnotacionActionListener;
import presentacion.DisenoRuta.BtnCargarMapaActionListener;
import presentacion.DisenoRuta.BtnFinalActionListener;
import presentacion.DisenoRuta.BtnRectanguloActionListener;
import presentacion.DisenoRuta.BtnInicioActionListener;
import presentacion.DisenoRuta.MiAreaDibujoMouseListener;
import presentacion.DisenoRuta.MiAreaDibujoMouseMotionListener;

public class DisenoRuta extends JPanel {

	private JFrame frame;
	private JToolBar toolBar;
	private JButton btnCargarMapa;
	private JButton btnInicio;
	private JButton btnFinal;
	private JButton btnMonumento;
	private JButton btnRestaurante;
	private JButton btnTienda;
	private JButton btnHotel;
	private JButton btnRectangulo;
	private JButton btnAnotacion;
	private JScrollPane scrollPane;

	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;

	// Variable que almacena el modo de dibujado seleccionado por el usuario
	int modo = -1;
	private final int INICIO = 1;
	private final int FINAL = 2;
	private final int RECTANGULO = 3;
	private final int TEXTO = 4;
	private final int MONUMENTO = 5;
	private final int RESTAURANTE = 6;
	private final int TIENDA = 7; 
	private final int HOTEL = 8;
	

	// Cursores e imagenes
	private Toolkit toolkit;
	private Image imagInicio;
	private Image imagFinal;
	private Image imagMonumento;
	private Image imagRestaurante;
	private Image imagTienda;
	private Image imagHotel;
	private Image imagRectangulo;
	private Image imagTexto;
	private Image imagCursorInicio;
	private Image imagCursorFinal;
	private Image imagCursorMonumento;
	private Image imagCursorRestaurante;
	private Image imagCursorTienda;
	private Image imagCursorHotel; 
	private Cursor cursorInicio;
	private Cursor cursorFinal;
	private Cursor cursorMonumento;
	private Cursor cursorRestaurante;
	private Cursor cursorTienda;
	private Cursor cursorHotel;
	private Cursor cursorRectangulo;
	private Cursor cursorTexto;

	private int x, y;

	// Componente de entrada de texto que permitira añadir anotaciones (dibujar
	// texto) sobre la imagen
	private JTextField txtTexto = new JTextField();


	/**
	/**
	 * Create the application.
	 */
	public DisenoRuta(JFrame frame) {
		this.frame= frame;
	//	frame = new JFrame();
	//	frame.getContentPane().setBounds(new Rectangle(0, 0, 700, 700));
		{
			setLayout(new BorderLayout(0, 0));
			toolBar = new JToolBar();
		//	frame.getContentPane().add(toolBar, BorderLayout.NORTH);
			add(toolBar,BorderLayout.NORTH );
			
			
			{
				btnCargarMapa = new JButton("");
				btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());
				btnCargarMapa.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/cargarMapa.png")));
				toolBar.add(btnCargarMapa);
			}
			{
				btnInicio = new JButton("");
				btnInicio.addActionListener(new BtnInicioActionListener());
				btnInicio.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/house.png")));
				toolBar.add(btnInicio);
			}
			{
				btnFinal = new JButton("");
				btnFinal.addActionListener(new BtnFinalActionListener());
				btnFinal.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/fin.png")));
				toolBar.add(btnFinal);
			}
			{
				btnRectangulo = new JButton("");
				btnRectangulo.addActionListener(new BtnRectanguloActionListener());
				{
					btnMonumento = new JButton("");
					btnMonumento.addActionListener(new BtnMonumentoActionListener());
					btnMonumento.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/museum.png")));
					toolBar.add(btnMonumento);
				}
				{
					btnRestaurante = new JButton("");
					btnRestaurante.addActionListener(new BtnRestauranteActionListener());
					btnRestaurante.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/restaurant.png")));
					toolBar.add(btnRestaurante);
				}
				{
					btnTienda = new JButton("");
					btnTienda.addActionListener(new BtnTiendaActionListener());
					btnTienda.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/shop.png")));
					toolBar.add(btnTienda);
				}
				{
					btnHotel = new JButton("");
					btnHotel.addActionListener(new BtnHotelActionListener());
					btnHotel.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/hotel.png")));
					toolBar.add(btnHotel);
				}
				btnRectangulo.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/rectangulo.png")));
				toolBar.add(btnRectangulo);
			}
			{
				btnAnotacion = new JButton("");
				btnAnotacion.addActionListener(new BtnAnotacionActionListener());
				btnAnotacion
						.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/aniadirAnotacion.png")));
				toolBar.add(btnAnotacion);
			}
		}

		// Creación de imágenes y cursores
		toolkit = Toolkit.getDefaultToolkit();
		imagInicio = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/house.png"));
		imagFinal = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/fin.png"));
		imagMonumento = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/museum.png"));
		imagRestaurante = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/restaurant.png"));
		imagTienda = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/shop.png"));
		imagHotel = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/hotel.png"));
		imagRectangulo = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/rectangulo.png"));
		imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/aniadirAnotacion.png"));
		imagCursorInicio = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/house.png"));
		imagCursorFinal = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/fin.png"));
		imagCursorMonumento = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/museum.png"));
		imagCursorRestaurante = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/restaurant.png"));
		imagCursorTienda = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/shop.png"));
		imagCursorHotel = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/hotel.png"));
		// Creación de los cursores
		cursorRectangulo = toolkit.createCustomCursor(imagRectangulo, new Point(0, 0), "CURSOR_RECTANGULO");
		cursorTexto = toolkit.createCustomCursor(imagTexto, new Point(0, 0), "CURSOR_TEXTO");
		cursorInicio = toolkit.createCustomCursor(imagCursorInicio, new Point(0, 0), "CURSOR_INICIO");
		cursorFinal = toolkit.createCustomCursor(imagCursorFinal, new Point(0, 0), "CURSOR_FINAL");
		cursorMonumento = toolkit.createCustomCursor(imagCursorMonumento, new Point(0, 0), "CURSOR_MONUMENTO");
		cursorRestaurante = toolkit.createCustomCursor(imagCursorRestaurante, new Point(0, 0), "CURSOR_RESTAURANTE");
		cursorTienda = toolkit.createCustomCursor(imagCursorTienda, new Point(0, 0), "CURSOR_TIENDA");
		cursorHotel = toolkit.createCustomCursor(imagCursorHotel, new Point(0, 0), "CURSOR_HOTEL");
		{
			scrollPane = new JScrollPane();
			//frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
			add(scrollPane, BorderLayout.CENTER);
		}

		// Creación del área de dibujo personalizada
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.setIcon(null);
		scrollPane.setViewportView(miAreaDibujo);

	//	frame.setBounds(0, 0, 700, 700);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(imagen);
			}
		}
	}

	public class BtnInicioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			/* Digo en que modo estoy y cambio el cursor */
			modo = INICIO;
			frame.setCursor(cursorInicio);
		}
	}

	public class BtnFinalActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FINAL;
			frame.setCursor(cursorFinal);
		}
	}
	
	public class BtnMonumentoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = MONUMENTO;
			frame.setCursor(cursorMonumento);
		}
	}
	
	public class BtnRestauranteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RESTAURANTE;
			frame.setCursor(cursorRestaurante);
		}
	}
	
	public class BtnTiendaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TIENDA;
			frame.setCursor(cursorTienda);
		}
	}
	
	public class BtnHotelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = HOTEL;
			frame.setCursor(cursorHotel);
		}
	}

	public class BtnRectanguloActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RECTANGULO;
			frame.setCursor(cursorRectangulo);
		}
	}

	public class BtnAnotacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			frame.setCursor(cursorTexto);
		}
	}

	public class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {
			x = arg0.getX();
			y = arg0.getY();
			if (imagen != null) {
				switch (modo) {
				case INICIO:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagInicio));
					miAreaDibujo.repaint();
					break;
				case FINAL:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagFinal));
					miAreaDibujo.repaint();
					break;
				case RECTANGULO:
					miAreaDibujo.addObjetoGrafico(new RectanguloGrafico(x, y, x, y, Color.RED));
					break;
				case TEXTO:
					txtTexto.setBounds(x, y, 200, 30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg) {
							if (!txtTexto.getText().equals(""))
								miAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
							txtTexto.setText("");
							txtTexto.setVisible(false);
							miAreaDibujo.repaint();
						}
					});
					miAreaDibujo.add(txtTexto);
				case MONUMENTO:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagMonumento));
					miAreaDibujo.repaint();
					break;
				case RESTAURANTE:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagRestaurante));
					miAreaDibujo.repaint();
					break;
				case TIENDA:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagTienda));
					miAreaDibujo.repaint();
					break;
				case HOTEL:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagHotel));
					miAreaDibujo.repaint();
					break;
				}
			}
		}
	}

	public class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == RECTANGULO && imagen != null) {
				((RectanguloGrafico) miAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
				((RectanguloGrafico) miAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
				miAreaDibujo.repaint();
			}
		}
	}

}
