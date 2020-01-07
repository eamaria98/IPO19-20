package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

import dominio.Guias;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.MaskFormatter;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

import javax.swing.event.ListSelectionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.Color;

public class GuiasTuristicos extends JPanel {
	private static ArrayList<Guias> listaGuias = Guias.generarGuias();
	private JPanel panel;
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
	private JTextField textPuntuacion;
	private JFormattedTextField ftextTelefono;
	private JTextField textHistorial;
	private JButton btnFoto;
	private URL foto;
	private int opcion; // añadir o modificar guia
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Create the panel.
	 */
	public GuiasTuristicos() {
		setLayout(new BorderLayout(0, 0));

		pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[] { 37, 82, 87, 92, 10, 0 };
		gbl_pnlLista.rowHeights = new int[] { 25, 277, 10, 23, 30, 0 };
		gbl_pnlLista.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLista.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		list.addListSelectionListener(new ListListSelectionListener());
		scrollPane.setViewportView(list);

		btnBorrar = new JButton(Messages.getString("GuiasTuristicos.0")); //$NON-NLS-1$
		btnBorrar.setBackground(new Color(255, 102, 102));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar
				.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/recycle-bin-filled-tool.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 3;
		pnlLista.add(btnBorrar, gbc_btnBorrar);

		btnEditar = new JButton(Messages.getString("GuiasTuristicos.2")); //$NON-NLS-1$
		btnEditar.setBackground(Color.GRAY);
		btnEditar.addActionListener(new BtnEditarActionListener());
		btnEditar.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/refresh-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 2;
		gbc_btnEditar.gridy = 3;
		pnlLista.add(btnEditar, gbc_btnEditar);

		btnAñadir = new JButton(Messages.getString("GuiasTuristicos.4")); //$NON-NLS-1$
		btnAñadir.setBackground(new Color(153, 255, 102));
		btnAñadir.addActionListener(new BtnAñadirActionListener());
		btnAñadir.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/plus.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 3;
		gbc_btnAñadir.gridy = 3;
		pnlLista.add(btnAñadir, gbc_btnAñadir);

		pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[] { 50, 0, 60, 55, 55, 60, 50, 200, 40, 40, 0, 0 };
		gbl_pnlDatos.rowHeights = new int[] { 60, 40, 40, 40, 40, 40, 40, 40, 40, 40, 10, 0, 0, 0, 0, 0 };
		gbl_pnlDatos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnlDatos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		pnlDatos.setLayout(gbl_pnlDatos);

		lblNombre = new JLabel(Messages.getString("GuiasTuristicos.6")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnlDatos.add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
		textNombre.setEditable(false);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 1;
		pnlDatos.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		lblApellidos = new JLabel(Messages.getString("GuiasTuristicos.7")); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 2;
		pnlDatos.add(lblApellidos, gbc_lblApellidos);

		textApellidos = new JTextField();
		textApellidos.setEditable(false);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 3;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 2;
		gbc_textApellidos.gridy = 2;
		pnlDatos.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);

		lblIdiomas = new JLabel(Messages.getString("GuiasTuristicos.8")); //$NON-NLS-1$
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

		btnFoto = new JButton(""); //$NON-NLS-1$
		btnFoto.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/dslr-camera.png")));
		btnFoto.addActionListener(new BtnFotoActionListener());
		GridBagConstraints gbc_btnFoto = new GridBagConstraints();
		gbc_btnFoto.fill = GridBagConstraints.BOTH;
		gbc_btnFoto.gridwidth = 2;
		gbc_btnFoto.gridheight = 6;
		gbc_btnFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnFoto.gridx = 8;
		gbc_btnFoto.gridy = 1;
		pnlDatos.add(btnFoto, gbc_btnFoto);

		lblRestricciones = new JLabel(Messages.getString("GuiasTuristicos.10")); //$NON-NLS-1$
		GridBagConstraints gbc_lblRestricciones = new GridBagConstraints();
		gbc_lblRestricciones.anchor = GridBagConstraints.WEST;
		gbc_lblRestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestricciones.gridx = 1;
		gbc_lblRestricciones.gridy = 4;
		pnlDatos.add(lblRestricciones, gbc_lblRestricciones);

		textRestricciones = new JTextField();
		textRestricciones.setEditable(false);
		GridBagConstraints gbc_textRestricciones = new GridBagConstraints();
		gbc_textRestricciones.gridwidth = 3;
		gbc_textRestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_textRestricciones.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRestricciones.gridx = 2;
		gbc_textRestricciones.gridy = 4;
		pnlDatos.add(textRestricciones, gbc_textRestricciones);
		textRestricciones.setColumns(10);

		lblTelefono = new JLabel(Messages.getString("GuiasTuristicos.11")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 5;
		pnlDatos.add(lblTelefono, gbc_lblTelefono);

		MaskFormatter formatTlf;
		try {
			formatTlf = new MaskFormatter("'(###')' ###' ###' ###"); //$NON-NLS-1$
			formatTlf.setPlaceholderCharacter('*');
			ftextTelefono = new JFormattedTextField(formatTlf);
			ftextTelefono.setEditable(false);
		} catch (Exception p) {
			p.printStackTrace();
		}
		
		
		
		GridBagConstraints gbc_ftextTelefono = new GridBagConstraints();
		gbc_ftextTelefono.gridwidth = 2;
		gbc_ftextTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftextTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftextTelefono.gridx = 2;
		gbc_ftextTelefono.gridy = 5;
		pnlDatos.add(ftextTelefono, gbc_ftextTelefono);

		lblCorreo = new JLabel(Messages.getString("GuiasTuristicos.13")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.WEST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 1;
		gbc_lblCorreo.gridy = 6;
		pnlDatos.add(lblCorreo, gbc_lblCorreo);

		textCorreo = new JTextField();
		textCorreo.setEditable(false);
		GridBagConstraints gbc_textCorreo = new GridBagConstraints();
		gbc_textCorreo.gridwidth = 3;
		gbc_textCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_textCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCorreo.gridx = 2;
		gbc_textCorreo.gridy = 6;
		pnlDatos.add(textCorreo, gbc_textCorreo);
		textCorreo.setColumns(10);

		lblPrecio = new JLabel(Messages.getString("GuiasTuristicos.14")); //$NON-NLS-1$
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

		lblPuntuación = new JLabel(Messages.getString("GuiasTuristicos.15")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPuntuación = new GridBagConstraints();
		gbc_lblPuntuación.anchor = GridBagConstraints.WEST;
		gbc_lblPuntuación.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntuación.gridx = 1;
		gbc_lblPuntuación.gridy = 8;
		pnlDatos.add(lblPuntuación, gbc_lblPuntuación);

		textPuntuacion = new JTextField();
		textPuntuacion.setEditable(false);
		GridBagConstraints gbc_textPuntuacion = new GridBagConstraints();
		gbc_textPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_textPuntuacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPuntuacion.gridx = 2;
		gbc_textPuntuacion.gridy = 8;
		pnlDatos.add(textPuntuacion, gbc_textPuntuacion);
		textPuntuacion.setColumns(10);

		lblHistorial = new JLabel(Messages.getString("GuiasTuristicos.16")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHistorial = new GridBagConstraints();
		gbc_lblHistorial.fill = GridBagConstraints.VERTICAL;
		gbc_lblHistorial.anchor = GridBagConstraints.WEST;
		gbc_lblHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistorial.gridx = 1;
		gbc_lblHistorial.gridy = 9;
		pnlDatos.add(lblHistorial, gbc_lblHistorial);

		textHistorial = new JTextField();
		textHistorial.setEditable(false);
		GridBagConstraints gbc_textHistorial = new GridBagConstraints();
		gbc_textHistorial.gridheight = 4;
		gbc_textHistorial.gridwidth = 5;
		gbc_textHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_textHistorial.fill = GridBagConstraints.BOTH;
		gbc_textHistorial.gridx = 2;
		gbc_textHistorial.gridy = 9;
		pnlDatos.add(textHistorial, gbc_textHistorial);
		textHistorial.setColumns(10);

		btnCancelar = new JButton(Messages.getString("GuiasTuristicos.17")); //$NON-NLS-1$
		btnCancelar.setBackground(new Color(255, 0, 51));
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/close.png"))); //$NON-NLS-1$
		btnCancelar.setEnabled(false);
		btnCancelar.setVisible(false);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 8;
		gbc_btnCancelar.gridy = 14;
		pnlDatos.add(btnCancelar, gbc_btnCancelar);

		btnGuardar = new JButton(Messages.getString("GuiasTuristicos.19")); //$NON-NLS-1$
		btnGuardar.setEnabled(false);
		btnGuardar.setBackground(new Color(51, 204, 51));
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setIcon(new ImageIcon(GuiasTuristicos.class.getResource("/presentacion/tick.png"))); //$NON-NLS-1$
		btnGuardar.setVisible(false);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 9;
		gbc_btnGuardar.gridy = 14;
		pnlDatos.add(btnGuardar, gbc_btnGuardar);
		crearLista();
	}

	private class BtnFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (textNombre.isEditable()) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(panel);
				// Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					btnFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
					try {
						setFoto(file.toURI().toURL());
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			
			cargarGuias(listaGuias.get(list.getSelectedIndex()));
		}
	}

	private class BtnAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			habilitar(true);
			textNombre.setText(""); //$NON-NLS-1$
			textApellidos.setText(""); //$NON-NLS-1$
			textIdiomas.setText(""); //$NON-NLS-1$
			textRestricciones.setText(""); //$NON-NLS-1$
			ftextTelefono.setText(""); //$NON-NLS-1$
			textCorreo.setText(""); //$NON-NLS-1$
			textPrecio.setText(""); //$NON-NLS-1$
			textPuntuacion.setText(""); //$NON-NLS-1$
			textHistorial.setText(""); //$NON-NLS-1$
			btnFoto.setIcon(null);
			setOpcion(1);
		}
	}

	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(true);
			setOpcion(2);
		}
	}

	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				listaGuias.remove(list.getSelectedIndex());
				crearLista();
			}catch(ArrayIndexOutOfBoundsException ai) {
				
			}
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(false);
		}
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(false);
			//btnFoto.setText("");
			try {
				switch (getOpcion()) {
				case 1:
					listaGuias.add(new Guias(textNombre.getText(), textApellidos.getText(), textIdiomas.getText(), textRestricciones.getText(), ftextTelefono.getText(), textCorreo.getText(), textPrecio.getText(), textPuntuacion.getText(), textHistorial.getText(), getFoto()));
					break;
				case 2:
					Guias gui = listaGuias.get(list.getSelectedIndex());
					gui.setNombre(textNombre.getText());
					gui.setApellidos(textApellidos.getText());
					gui.setIdiomas(textIdiomas.getText());
					gui.setRestricciones(textRestricciones.getText());
					gui.setTelefono(ftextTelefono.getText());
					gui.setCorreo(textCorreo.getText());
					gui.setPrecio_hora(textPrecio.getText());
					gui.setPuntuacion(textPuntuacion.getText());
					gui.setHistorial_rutas(textHistorial.getText());
					gui.setFoto(getFoto());
					listaGuias.set(list.getSelectedIndex(), gui);
					break;
				}

				crearLista();
			} catch (Exception e2) {
				
			}

		}
	}

	private void cargarGuias(Guias guia) {
		textNombre.setText(guia.getNombre());
		textApellidos.setText(guia.getApellidos());
		textIdiomas.setText(guia.getIdiomas());
		textRestricciones.setText(guia.getRestricciones());
		ftextTelefono.setText(guia.getTelefono());
		textCorreo.setText(guia.getCorreo());
		textPrecio.setText(guia.getPrecio_hora());
		textPuntuacion.setText(guia.getPuntuacion());
		textHistorial.setText(guia.getHistorial_rutas());
		btnFoto.setIcon(new ImageIcon(guia.getFoto()));
	}

	void crearLista() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaGuias.size() - 1 ; i++) {
			modelo.addElement(listaGuias.get(i).getNombre());
		}
		list.setModel(modelo);
	}

	private void habilitar(boolean opcion) {

		btnGuardar.setVisible(opcion);
		btnGuardar.setEnabled(opcion);
		btnCancelar.setVisible(opcion);
		btnCancelar.setEnabled(opcion);
		textNombre.setEditable(opcion);
		textApellidos.setEditable(opcion);
		textIdiomas.setEditable(opcion);
		textRestricciones.setEditable(opcion);
		ftextTelefono.setEditable(opcion);
		textCorreo.setEditable(opcion);
		textPrecio.setEditable(opcion);
		textPuntuacion.setEditable(opcion);
		textHistorial.setEditable(opcion);
		//btnFoto.setEnabled(opcion);
	}

	private URL getFoto() {
		return foto;
	}

	private void setFoto(URL foto) {
		this.foto = foto;
	}

	private int getOpcion() {
		return opcion;
	}

	private void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public static ArrayList<Guias> getListaGuias() {
		return listaGuias;
	}

}
