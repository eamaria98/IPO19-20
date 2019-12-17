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

	// Cursores e imagenes
	private Toolkit toolkit;
	private Image imagInicio;
	private Image imagFinal;
	private Image imagRectangulo;
	private Image imagTexto;
	private Image imagCursorInicio;
	private Image imagCursorFinal;
	private Cursor cursorInicio;
	private Cursor cursorFinal;
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
				btnInicio.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/home.png")));
				toolBar.add(btnInicio);
			}
			{
				btnFinal = new JButton("");
				btnFinal.addActionListener(new BtnFinalActionListener());
				btnFinal.setIcon(new ImageIcon(DisenoRuta.class.getResource("/presentacion/final.png")));
				toolBar.add(btnFinal);
			}
			{
				btnRectangulo = new JButton("");
				btnRectangulo.addActionListener(new BtnRectanguloActionListener());
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
		imagInicio = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/home.png"));
		imagFinal = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/final.png"));
		imagRectangulo = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/rectangulo.png"));
		imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/aniadirAnotacion.png"));
		imagCursorInicio = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/home.png"));
		imagCursorFinal = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/final.png"));
		// Creación de los cursores
		cursorRectangulo = toolkit.createCustomCursor(imagRectangulo, new Point(0, 0), "CURSOR_RECTANGULO");
		cursorTexto = toolkit.createCustomCursor(imagTexto, new Point(0, 0), "CURSOR_TEXTO");
		cursorInicio = toolkit.createCustomCursor(imagCursorInicio, new Point(0, 0), "CURSOR_INICIO");
		cursorFinal = toolkit.createCustomCursor(imagCursorFinal, new Point(0, 0), "CURSOR_FINAL");
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
