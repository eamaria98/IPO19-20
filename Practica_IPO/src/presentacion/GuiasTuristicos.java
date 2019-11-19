package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class GuiasTuristicos extends JPanel {
	private JPanel pnlLista;
	private JPanel pnlDatos;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnBorrar;
	private JButton btnEditar;
	private JButton btnAñadir;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblIdiomas;
	private JLabel lblRestricciones;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JLabel lblPrecio;
	private JLabel lblPuntuación;
	private JLabel lblHistorial;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textIdiomas;
	private JTextField textRestricciones;
	private JTextField textCorreo;
	private JTextField textPrecio;
	private JTextField textPuntuación;
	private JFormattedTextField ftextTelefono;
	private JLabel lblFoto;

	/**
	 * Create the panel.
	 */
	public GuiasTuristicos() {
		setLayout(new BorderLayout(0, 0));
		
		pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{37, 82, 87, 92, 10, 0};
		gbl_pnlLista.rowHeights = new int[]{25, 277, 10, 23, 30, 0};
		gbl_pnlLista.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlLista.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 3;
		pnlLista.add(btnBorrar, gbc_btnBorrar);
		
		btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 2;
		gbc_btnEditar.gridy = 3;
		pnlLista.add(btnEditar, gbc_btnEditar);
		
		btnAñadir = new JButton("A\u00F1adir");
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 3;
		gbc_btnAñadir.gridy = 3;
		pnlLista.add(btnAñadir, gbc_btnAñadir);
		
		pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[]{50, 0, 132, 105, 58, 53, 54, 58, 0, 0};
		gbl_pnlDatos.rowHeights = new int[]{60, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 0};
		gbl_pnlDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDatos.setLayout(gbl_pnlDatos);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnlDatos.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 1;
		pnlDatos.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 2;
		pnlDatos.add(lblApellidos, gbc_lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 2;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 2;
		gbc_textApellidos.gridy = 2;
		pnlDatos.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/prueba.png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 3;
		gbc_lblFoto.gridheight = 5;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 5;
		gbc_lblFoto.gridy = 2;
		pnlDatos.add(lblFoto, gbc_lblFoto);
		
		lblIdiomas = new JLabel("Idiomas");
		GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
		gbc_lblIdiomas.anchor = GridBagConstraints.WEST;
		gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdiomas.gridx = 1;
		gbc_lblIdiomas.gridy = 3;
		pnlDatos.add(lblIdiomas, gbc_lblIdiomas);
		
		textIdiomas = new JTextField();
		textIdiomas.setEditable(false);
		GridBagConstraints gbc_textIdiomas = new GridBagConstraints();
		gbc_textIdiomas.gridwidth = 2;
		gbc_textIdiomas.insets = new Insets(0, 0, 5, 5);
		gbc_textIdiomas.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIdiomas.gridx = 2;
		gbc_textIdiomas.gridy = 3;
		pnlDatos.add(textIdiomas, gbc_textIdiomas);
		textIdiomas.setColumns(10);
		
		lblRestricciones = new JLabel("Restricciones disponibilidad:");
		GridBagConstraints gbc_lblRestricciones = new GridBagConstraints();
		gbc_lblRestricciones.anchor = GridBagConstraints.WEST;
		gbc_lblRestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestricciones.gridx = 1;
		gbc_lblRestricciones.gridy = 4;
		pnlDatos.add(lblRestricciones, gbc_lblRestricciones);
		
		textRestricciones = new JTextField();
		textRestricciones.setEditable(false);
		GridBagConstraints gbc_textRestricciones = new GridBagConstraints();
		gbc_textRestricciones.gridwidth = 2;
		gbc_textRestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_textRestricciones.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRestricciones.gridx = 2;
		gbc_textRestricciones.gridy = 4;
		pnlDatos.add(textRestricciones, gbc_textRestricciones);
		textRestricciones.setColumns(10);
		
		lblTelefono = new JLabel("Tel\u00E9fono:");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 5;
		pnlDatos.add(lblTelefono, gbc_lblTelefono);
		
		ftextTelefono = new JFormattedTextField();
		ftextTelefono.setEditable(false);
		ftextTelefono.setText("(   )            ");
		GridBagConstraints gbc_ftextTelefono = new GridBagConstraints();
		gbc_ftextTelefono.gridwidth = 2;
		gbc_ftextTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftextTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftextTelefono.gridx = 2;
		gbc_ftextTelefono.gridy = 5;
		pnlDatos.add(ftextTelefono, gbc_ftextTelefono);
		
		lblCorreo = new JLabel("Correo electr\u00F3nico:");
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.WEST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 1;
		gbc_lblCorreo.gridy = 6;
		pnlDatos.add(lblCorreo, gbc_lblCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setEditable(false);
		GridBagConstraints gbc_textCorreo = new GridBagConstraints();
		gbc_textCorreo.gridwidth = 2;
		gbc_textCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_textCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCorreo.gridx = 2;
		gbc_textCorreo.gridy = 6;
		pnlDatos.add(textCorreo, gbc_textCorreo);
		textCorreo.setColumns(10);
		
		lblPrecio = new JLabel("Precio/hora:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 7;
		pnlDatos.add(lblPrecio, gbc_lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecio.gridx = 2;
		gbc_textPrecio.gridy = 7;
		pnlDatos.add(textPrecio, gbc_textPrecio);
		textPrecio.setColumns(10);
		
		lblPuntuación = new JLabel("Puntuaci\u00F3n:");
		GridBagConstraints gbc_lblPuntuación = new GridBagConstraints();
		gbc_lblPuntuación.anchor = GridBagConstraints.WEST;
		gbc_lblPuntuación.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntuación.gridx = 1;
		gbc_lblPuntuación.gridy = 8;
		pnlDatos.add(lblPuntuación, gbc_lblPuntuación);
		
		textPuntuación = new JTextField();
		textPuntuación.setEditable(false);
		GridBagConstraints gbc_textPuntuación = new GridBagConstraints();
		gbc_textPuntuación.insets = new Insets(0, 0, 5, 5);
		gbc_textPuntuación.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPuntuación.gridx = 2;
		gbc_textPuntuación.gridy = 8;
		pnlDatos.add(textPuntuación, gbc_textPuntuación);
		textPuntuación.setColumns(10);
		
		lblHistorial = new JLabel("Historial rutas: ");
		GridBagConstraints gbc_lblHistorial = new GridBagConstraints();
		gbc_lblHistorial.anchor = GridBagConstraints.WEST;
		gbc_lblHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistorial.gridx = 1;
		gbc_lblHistorial.gridy = 9;
		pnlDatos.add(lblHistorial, gbc_lblHistorial);

	}

}
