package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

import dominio.Circuito;

import javax.swing.event.ListSelectionEvent;

public class Circuitos extends JPanel {
	private static ArrayList<Circuito> listaCircuitos = Circuito.generarCircuitos();
	private JPanel panel;
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtRestaurante;
	private JTextField txtTienda;
	private JButton btnBorrar;
	private JButton btnModificar;
	private JButton btnReservar;
	private JButton btnFoto;
	private JLabel lblCiudad;
	private JLabel lblMonumento;
	private JLabel lblRestaurantes;
	private JLabel lblTiendas;
	private JScrollPane scrollPane;
	private JList list;
	private URL foto;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private int opcion;

	/**
	 * Create the panel.
	 */
	public Circuitos() {
		setLayout(new BorderLayout(0, 0));

		JPanel pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[] { 25, 0, 0, 0, 0, 0 };
		gbl_pnlLista.rowHeights = new int[] { 25, 44, 10, 0, 30, 0 };
		gbl_pnlLista.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLista.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlLista.setLayout(gbl_pnlLista);

		JScrollPane scrollPane = new JScrollPane();
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

		btnBorrar = new JButton(Messages.getString("Circuitos.0")); //$NON-NLS-1$
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar.setBackground(new Color(255, 102, 102));
		btnBorrar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/recycle-bin-filled-tool.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 3;
		pnlLista.add(btnBorrar, gbc_btnBorrar);

		btnModificar = new JButton(Messages.getString("Circuitos.2")); //$NON-NLS-1$
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setBackground(Color.GRAY);
		btnModificar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/refresh-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 3;
		pnlLista.add(btnModificar, gbc_btnModificar);

		btnReservar = new JButton(Messages.getString("Circuitos.4")); //$NON-NLS-1$
		btnReservar.addActionListener(new BtnReservarActionListener() {
		});
		btnReservar.setBackground(new Color(153, 255, 102));
		btnReservar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/plus.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 3;
		gbc_btnReservar.gridy = 3;
		pnlLista.add(btnReservar, gbc_btnReservar);

		JPanel pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[] { 140, 378, 150, 0, 100, 70, 50, 60, 0, 0, 0 };
		gbl_pnlDatos.rowHeights = new int[] { 40, 40, 40, 40, 40, 40, 40, 40, 0, 0, 0, 0 };
		gbl_pnlDatos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnlDatos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0,
				Double.MIN_VALUE };
		pnlDatos.setLayout(gbl_pnlDatos);

		btnFoto = new JButton(""); //$NON-NLS-1$
		btnFoto.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/dslr-camera.png")));
		btnFoto.addActionListener(new BtnFotoActionListener());
		GridBagConstraints gbc_btnFoto = new GridBagConstraints();
		gbc_btnFoto.fill = GridBagConstraints.BOTH;
		gbc_btnFoto.gridheight = 8;
		gbc_btnFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnFoto.gridx = 1;
		gbc_btnFoto.gridy = 1;
		pnlDatos.add(btnFoto, gbc_btnFoto);

		lblCiudad = new JLabel(Messages.getString("Circuitos.7")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 3;
		gbc_lblCiudad.gridy = 4;
		pnlDatos.add(lblCiudad, gbc_lblCiudad);

		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.gridwidth = 2;
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.gridx = 4;
		gbc_txtCiudad.gridy = 4;
		pnlDatos.add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);

		lblMonumento = new JLabel(Messages.getString("Circuitos.8")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMonumento = new GridBagConstraints();
		gbc_lblMonumento.anchor = GridBagConstraints.WEST;
		gbc_lblMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumento.gridx = 3;
		gbc_lblMonumento.gridy = 5;
		pnlDatos.add(lblMonumento, gbc_lblMonumento);

		txtMonumento = new JTextField();
		txtMonumento.setEditable(false);
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.gridwidth = 3;
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.gridx = 4;
		gbc_txtMonumento.gridy = 5;
		pnlDatos.add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);

		lblRestaurantes = new JLabel(Messages.getString("Circuitos.9")); //$NON-NLS-1$
		GridBagConstraints gbc_lblRestaurantes = new GridBagConstraints();
		gbc_lblRestaurantes.anchor = GridBagConstraints.WEST;
		gbc_lblRestaurantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestaurantes.gridx = 3;
		gbc_lblRestaurantes.gridy = 6;
		pnlDatos.add(lblRestaurantes, gbc_lblRestaurantes);

		txtRestaurante = new JTextField();
		txtRestaurante.setEditable(false);
		GridBagConstraints gbc_txtRestaurante = new GridBagConstraints();
		gbc_txtRestaurante.gridwidth = 3;
		gbc_txtRestaurante.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRestaurante.insets = new Insets(0, 0, 5, 5);
		gbc_txtRestaurante.gridx = 4;
		gbc_txtRestaurante.gridy = 6;
		pnlDatos.add(txtRestaurante, gbc_txtRestaurante);
		txtRestaurante.setColumns(10);

		lblTiendas = new JLabel(Messages.getString("Circuitos.10")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTiendas = new GridBagConstraints();
		gbc_lblTiendas.anchor = GridBagConstraints.WEST;
		gbc_lblTiendas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTiendas.gridx = 3;
		gbc_lblTiendas.gridy = 7;
		pnlDatos.add(lblTiendas, gbc_lblTiendas);

		txtTienda = new JTextField();
		txtTienda.setEditable(false);
		GridBagConstraints gbc_txtTienda = new GridBagConstraints();
		gbc_txtTienda.gridwidth = 2;
		gbc_txtTienda.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTienda.insets = new Insets(0, 0, 5, 5);
		gbc_txtTienda.gridx = 4;
		gbc_txtTienda.gridy = 7;
		pnlDatos.add(txtTienda, gbc_txtTienda);
		txtTienda.setColumns(10);

		btnCancelar = new JButton(Messages.getString("Circuitos.11")); //$NON-NLS-1$
		btnCancelar.setEnabled(false);
		btnCancelar.setVisible(false);
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/close.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 9;
		pnlDatos.add(btnCancelar, gbc_btnCancelar);

		btnGuardar = new JButton(Messages.getString("Circuitos.13")); //$NON-NLS-1$
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		btnGuardar.setBackground(new Color(51, 204, 0));
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/tick.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 5;
		gbc_btnGuardar.gridy = 9;
		pnlDatos.add(btnGuardar, gbc_btnGuardar);
		crearLista();

	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaReserva reserva = new VentanaReserva();
			reserva.setVisible(true);
		}
	}

	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				listaCircuitos.remove(list.getSelectedIndex());
				crearLista();
			} catch (ArrayIndexOutOfBoundsException ai) {

			}
		}
	}

	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(true);
			setOpcion(2);
		}
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(false);
			btnFoto.setText(""); //$NON-NLS-1$
			try {
				switch (getOpcion()) {
				case 2:
					Circuito cir = listaCircuitos.get(list.getSelectedIndex());
					cir.setCiudad(txtCiudad.getText());
					cir.setMonumento(txtMonumento.getText());
					cir.setRestaurante(txtRestaurante.getText());
					cir.setTienda(txtTienda.getText());
					cir.setFoto(getFoto());
					listaCircuitos.set(list.getSelectedIndex(), cir);
					break;
				}

				crearLista();
			} catch (Exception e2) {

			}

		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(false);
		}
	}

	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			cargarCircuitos(listaCircuitos.get(list.getSelectedIndex()));
		}
	}

	private class BtnFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtCiudad.isEditable()) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(panel);
				// Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					btnFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
					try {
						setFoto(file.toURI().toURL());
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

	private void cargarCircuitos(Circuito circuito) {
		txtCiudad.setText(circuito.getCiudad());
		txtMonumento.setText(circuito.getMonumento());
		txtRestaurante.setText(circuito.getRestaurante());
		txtTienda.setText(circuito.getTienda());
		btnFoto.setIcon(new ImageIcon(circuito.getFoto()));
	}

	void crearLista() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaCircuitos.size() - 1; i++) {
			modelo.addElement(listaCircuitos.get(i).getCiudad());
		}
		list.setModel(modelo);
	}

	private void habilitar(boolean opcion) {

		btnGuardar.setVisible(opcion);
		btnGuardar.setEnabled(opcion);
		btnCancelar.setVisible(opcion);
		btnCancelar.setEnabled(opcion);
		txtCiudad.setEditable(opcion);
		txtMonumento.setEditable(opcion);
		txtRestaurante.setEditable(opcion);
		txtTienda.setEditable(opcion);
		// btnFoto.setEnabled(opcion);
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

	public static ArrayList<Circuito> getListaCircuitos() {
		return listaCircuitos;
	}

}
