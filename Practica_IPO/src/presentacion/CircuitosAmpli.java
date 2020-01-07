package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dominio.CircuitoAmp;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class CircuitosAmpli extends JPanel {
	private static ArrayList<CircuitoAmp> listaCircuitosAmp = CircuitoAmp.generarCircuito();
	private JPanel panel;
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtEntrada;
	private JTextField txtHorarioVisita;
	private JTextField txtDuracion;
	private JTextField txtTipologia;
	private JLabel lblCiudad;
	private JLabel lblMonumento; 
	private JLabel lblEntrada;
	private JLabel lblHorarioVisita;
	private JLabel lblDuracionVisita;
	private JLabel lblTipologia; 
	private JLabel lblDescripcion; 
	private JButton btnBorrar;
	private JButton btnModificar;
	private JButton btnReservar;
	private JButton btnFoto;
	private JList list;
	private URL foto;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private int opcion;
	private JTextPane textPaneDescripcion;

	/**
	 * Create the panel.
	 */
	public CircuitosAmpli() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{25, 85, 85, 85, 0, 0};
		gbl_pnlLista.rowHeights = new int[]{25, 275, 10, 23, 30, 0};
		gbl_pnlLista.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlLista.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		list.addListSelectionListener(new ListListSelectionListener());
		scrollPane.setViewportView(list);
		
		btnBorrar = new JButton(Messages.getString("CircuitosAmpli.0")); //$NON-NLS-1$
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar.setBackground(new Color(255, 102, 102));
		btnBorrar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/recycle-bin-filled-tool.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 3;
		pnlLista.add(btnBorrar, gbc_btnBorrar);
		
		btnModificar = new JButton(Messages.getString("CircuitosAmpli.2")); //$NON-NLS-1$
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setBackground(Color.GRAY);
		btnModificar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/refresh-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 3;
		pnlLista.add(btnModificar, gbc_btnModificar);
		
		btnReservar = new JButton(Messages.getString("CircuitosAmpli.4")); //$NON-NLS-1$
		btnReservar.addActionListener(new BtnReservarActionListener());
		btnReservar.setBackground(new Color(153, 255, 102));
		btnReservar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/plus.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 3;
		gbc_btnReservar.gridy = 3;
		pnlLista.add(btnReservar, gbc_btnReservar);
		
		JPanel pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[]{50, 0, 100, 100, 0, 40, 0, 0, 30, 0, 0};
		gbl_pnlDatos.rowHeights = new int[]{45, 40, 40, 40, 40, 40, 40, 40, 150, 35, 25, 30, 0};
		gbl_pnlDatos.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDatos.setLayout(gbl_pnlDatos);
		
		lblCiudad = new JLabel(Messages.getString("CircuitosAmpli.6")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 1;
		pnlDatos.add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.gridwidth = 2;
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.gridx = 2;
		gbc_txtCiudad.gridy = 1;
		pnlDatos.add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		btnFoto = new JButton(""); //$NON-NLS-1$
		btnFoto.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/dslr-camera.png")));
		btnFoto.addActionListener(new BtnFotoActionListener());
		GridBagConstraints gbc_btnFoto = new GridBagConstraints();
		gbc_btnFoto.fill = GridBagConstraints.BOTH;
		gbc_btnFoto.gridwidth = 3;
		gbc_btnFoto.gridheight = 8;
		gbc_btnFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnFoto.gridx = 6;
		gbc_btnFoto.gridy = 1;
		pnlDatos.add(btnFoto, gbc_btnFoto);
		
		lblMonumento = new JLabel(Messages.getString("CircuitosAmpli.8")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMonumento = new GridBagConstraints();
		gbc_lblMonumento.anchor = GridBagConstraints.WEST;
		gbc_lblMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumento.gridx = 1;
		gbc_lblMonumento.gridy = 2;
		pnlDatos.add(lblMonumento, gbc_lblMonumento);
		
		txtMonumento = new JTextField();
		txtMonumento.setEditable(false);
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.gridwidth = 2;
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.gridx = 2;
		gbc_txtMonumento.gridy = 2;
		pnlDatos.add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);
		
		lblEntrada = new JLabel(Messages.getString("CircuitosAmpli.9")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEntrada = new GridBagConstraints();
		gbc_lblEntrada.anchor = GridBagConstraints.WEST;
		gbc_lblEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblEntrada.gridx = 1;
		gbc_lblEntrada.gridy = 3;
		pnlDatos.add(lblEntrada, gbc_lblEntrada);
		
		txtEntrada = new JTextField();
		txtEntrada.setEditable(false);
		GridBagConstraints gbc_txtEntrada = new GridBagConstraints();
		gbc_txtEntrada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_txtEntrada.gridx = 2;
		gbc_txtEntrada.gridy = 3;
		pnlDatos.add(txtEntrada, gbc_txtEntrada);
		txtEntrada.setColumns(10);
		
		lblHorarioVisita = new JLabel(Messages.getString("CircuitosAmpli.10")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHorarioVisita = new GridBagConstraints();
		gbc_lblHorarioVisita.anchor = GridBagConstraints.WEST;
		gbc_lblHorarioVisita.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorarioVisita.gridx = 1;
		gbc_lblHorarioVisita.gridy = 4;
		pnlDatos.add(lblHorarioVisita, gbc_lblHorarioVisita);
		
		txtHorarioVisita = new JTextField();
		txtHorarioVisita.setEditable(false);
		GridBagConstraints gbc_txtHorarioVisita = new GridBagConstraints();
		gbc_txtHorarioVisita.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHorarioVisita.gridwidth = 2;
		gbc_txtHorarioVisita.insets = new Insets(0, 0, 5, 5);
		gbc_txtHorarioVisita.gridx = 2;
		gbc_txtHorarioVisita.gridy = 4;
		pnlDatos.add(txtHorarioVisita, gbc_txtHorarioVisita);
		txtHorarioVisita.setColumns(10);
		
		lblDuracionVisita = new JLabel(Messages.getString("CircuitosAmpli.11")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDuracionVisita = new GridBagConstraints();
		gbc_lblDuracionVisita.anchor = GridBagConstraints.WEST;
		gbc_lblDuracionVisita.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracionVisita.gridx = 1;
		gbc_lblDuracionVisita.gridy = 5;
		pnlDatos.add(lblDuracionVisita, gbc_lblDuracionVisita);
		
		txtDuracion = new JTextField();
		txtDuracion.setEditable(false);
		GridBagConstraints gbc_txtDuracion = new GridBagConstraints();
		gbc_txtDuracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDuracion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDuracion.gridx = 2;
		gbc_txtDuracion.gridy = 5;
		pnlDatos.add(txtDuracion, gbc_txtDuracion);
		txtDuracion.setColumns(10);
		
		lblTipologia = new JLabel(Messages.getString("CircuitosAmpli.12")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.WEST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 1;
		gbc_lblTipologia.gridy = 6;
		pnlDatos.add(lblTipologia, gbc_lblTipologia);
		
		txtTipologia = new JTextField();
		txtTipologia.setEditable(false);
		GridBagConstraints gbc_txtTipologia = new GridBagConstraints();
		gbc_txtTipologia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipologia.gridx = 2;
		gbc_txtTipologia.gridy = 6;
		pnlDatos.add(txtTipologia, gbc_txtTipologia);
		txtTipologia.setColumns(10);
		
		lblDescripcion = new JLabel(Messages.getString("CircuitosAmpli.13")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 7;
		pnlDatos.add(lblDescripcion, gbc_lblDescripcion);
		
		btnCancelar = new JButton(Messages.getString("CircuitosAmpli.14")); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setEnabled(false);
		btnCancelar.setVisible(false);
		btnCancelar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/close.png"))); //$NON-NLS-1$
		btnCancelar.setBackground(new Color(255, 0, 0));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 6;
		gbc_btnCancelar.gridy = 10;
		pnlDatos.add(btnCancelar, gbc_btnCancelar);
		
		btnGuardar = new JButton(Messages.getString("CircuitosAmpli.16")); //$NON-NLS-1$
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		btnGuardar.setBackground(new Color(51, 204, 0));
		btnGuardar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/tick.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 7;
		gbc_btnGuardar.gridy = 10;
		pnlDatos.add(btnGuardar, gbc_btnGuardar);
		
		textPaneDescripcion = new JTextPane();
		textPaneDescripcion.setEditable(false);
		GridBagConstraints gbc_textPaneDescripcion = new GridBagConstraints();
		gbc_textPaneDescripcion.gridwidth = 2;
		gbc_textPaneDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneDescripcion.fill = GridBagConstraints.BOTH;
		gbc_textPaneDescripcion.gridx = 2;
		gbc_textPaneDescripcion.gridy = 8;
		pnlDatos.add(textPaneDescripcion, gbc_textPaneDescripcion);
		
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
				listaCircuitosAmp.remove(list.getSelectedIndex());
				crearLista();
			}catch(ArrayIndexOutOfBoundsException ai) {
				
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
					CircuitoAmp cir = listaCircuitosAmp.get(list.getSelectedIndex());
					cir.setCiudad(txtCiudad.getText());
					cir.setMonumento(txtMonumento.getText());
					cir.setEntrada(txtEntrada.getText());
					cir.setHorario(txtHorarioVisita.getText());
					cir.setDuracion(txtDuracion.getText());
					cir.setTipologia(txtTipologia.getText());
					cir.setDescripcion(textPaneDescripcion.getText());
					cir.setFoto(getFoto());
					listaCircuitosAmp.set(list.getSelectedIndex(), cir);
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
			cargarCircuitosAmp(listaCircuitosAmp.get(list.getSelectedIndex()));
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

	private void cargarCircuitosAmp(CircuitoAmp circuitoAmp) {
		txtCiudad.setText(circuitoAmp.getCiudad());
		txtMonumento.setText(circuitoAmp.getMonumento());
		txtEntrada.setText(circuitoAmp.getEntrada());
		txtHorarioVisita.setText(circuitoAmp.getHorario());
		txtDuracion.setText(circuitoAmp.getDuracion());
		txtTipologia.setText(circuitoAmp.getTipologia());
		textPaneDescripcion.setText(circuitoAmp.getDescripcion());
		btnFoto.setIcon(new ImageIcon(circuitoAmp.getFoto()));
	}

	void crearLista() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaCircuitosAmp.size() - 1; i++) {
			modelo.addElement(listaCircuitosAmp.get(i).getCiudad());
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
		txtEntrada.setEditable(opcion);
		txtHorarioVisita.setEditable(opcion);
		txtDuracion.setEditable(opcion);
		txtTipologia.setEditable(opcion);
		textPaneDescripcion.setEditable(opcion);
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

	public static ArrayList<CircuitoAmp> getListaCircuitosAmp() {
		return listaCircuitosAmp;
	}

}
