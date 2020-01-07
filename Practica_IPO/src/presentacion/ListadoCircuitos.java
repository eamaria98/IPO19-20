package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dominio.Circuito;
import dominio.CircuitoAmp;
import dominio.CircuitosList;
import dominio.Guias;
import dominio.ProximosCircuitos;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextPane;

public class ListadoCircuitos extends JPanel {
	private JPanel panel;
	private int opcion;
	private URL foto;
	private JTextField textBusquedaCiudad;
	private static ArrayList<CircuitosList> listaCircuitosList = CircuitosList.generarCircuito();
	private static ArrayList<ProximosCircuitos> listaProximosCircuitosList = ProximosCircuitos.generarProximosCircuitos();
	private JList listCiudades;
	private JTextField textIncidencias;
	private JTextField textPrecio;
	private JTextField textParticipantes;
	private JButton btnFoto;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JTextField textCiudad;
	private JTextPane textOpiniones;
	private JList listCircuitos;

	/**
	 * Create the panel.
	 */
	public ListadoCircuitos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {90, 0, 118, 68, 0, 0, 0, 30};
		gridBagLayout.rowHeights = new int[] {20, -15, 142, 30, 30, 0, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblBusquedaPorCiudad = new JLabel(Messages.getString("ListadoCircuitos.0")); //$NON-NLS-1$
		lblBusquedaPorCiudad.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblBusquedaPorCiudad = new GridBagConstraints();
		gbc_lblBusquedaPorCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBusquedaPorCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusquedaPorCiudad.gridx = 1;
		gbc_lblBusquedaPorCiudad.gridy = 1;
		add(lblBusquedaPorCiudad, gbc_lblBusquedaPorCiudad);
		
		textBusquedaCiudad = new JTextField();
		textBusquedaCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				if(textBusquedaCiudad.getText().equals("")){ //$NON-NLS-1$
					crearLista();
				}else {
					for (int i = 0; i <= listaCircuitosList.size() - 1; i++) {
						if(listaCircuitosList.get(i).getCiudad().equals(textBusquedaCiudad.getText())) {
							modelo.addElement(listaCircuitosList.get(i).getCiudad());
						}
					}
					listCiudades.setModel(modelo);
				}
			}
		});

		GridBagConstraints gbc_textBusquedaCiudad = new GridBagConstraints();
		gbc_textBusquedaCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textBusquedaCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBusquedaCiudad.gridx = 2;
		gbc_textBusquedaCiudad.gridy = 1;
		add(textBusquedaCiudad, gbc_textBusquedaCiudad);
		textBusquedaCiudad.setColumns(10);
		
		JButton btnBorrar = new JButton(Messages.getString("ListadoCircuitos.2")); //$NON-NLS-1$
		btnBorrar.setBackground(new Color(255, 102, 102));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnBorrar.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/recycle-bin-filled-tool.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.anchor = GridBagConstraints.EAST;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 4;
		gbc_btnBorrar.gridy = 1;
		add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton(Messages.getString("ListadoCircuitos.4")); //$NON-NLS-1$
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setBackground(Color.GRAY);
		btnModificar.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/refresh-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 5;
		gbc_btnModificar.gridy = 1;
		add(btnModificar, gbc_btnModificar);
		
		JButton btnAadir = new JButton(Messages.getString("ListadoCircuitos.6")); //$NON-NLS-1$
		btnAadir.setBackground(new Color(153, 255, 102));
		btnAadir.addActionListener(new BtnAñadirActionListener());
		btnAadir.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/plus.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 6;
		gbc_btnAadir.gridy = 1;
		add(btnAadir, gbc_btnAadir);
		
		listCiudades = new JList();
		listCiudades.addListSelectionListener(new ListListSelectionListener());
		GridBagConstraints gbc_listCiudades = new GridBagConstraints();
		gbc_listCiudades.gridheight = 4;
		gbc_listCiudades.gridwidth = 2;
		gbc_listCiudades.insets = new Insets(0, 0, 5, 5);
		gbc_listCiudades.fill = GridBagConstraints.BOTH;
		gbc_listCiudades.gridx = 1;
		gbc_listCiudades.gridy = 2;
		add(listCiudades, gbc_listCiudades);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {124, 61, 107, 0, 0, 85, 111};
		gbl_panel.rowHeights = new int[] {0, 20, 20, 20, 27, 20};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0};
		panel.setLayout(gbl_panel);
		
		JLabel lblCiudad = new JLabel(Messages.getString("ListadoCircuitos.8")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblCiudad.gridx = 0;
		gbc_lblCiudad.gridy = 0;
		panel.add(lblCiudad, gbc_lblCiudad);
		
		textCiudad = new JTextField();
		textCiudad.setEditable(false);
		GridBagConstraints gbc_textCiudad = new GridBagConstraints();
		gbc_textCiudad.gridwidth = 4;
		gbc_textCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCiudad.gridx = 1;
		gbc_textCiudad.gridy = 0;
		panel.add(textCiudad, gbc_textCiudad);
		textCiudad.setColumns(10);
		
		JLabel lblParticipantes = new JLabel(Messages.getString("ListadoCircuitos.9")); //$NON-NLS-1$
		GridBagConstraints gbc_lblParticipantes = new GridBagConstraints();
		gbc_lblParticipantes.fill = GridBagConstraints.VERTICAL;
		gbc_lblParticipantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticipantes.anchor = GridBagConstraints.EAST;
		gbc_lblParticipantes.gridx = 0;
		gbc_lblParticipantes.gridy = 1;
		panel.add(lblParticipantes, gbc_lblParticipantes);
		
		textParticipantes = new JTextField();
		textParticipantes.setEditable(false);
		GridBagConstraints gbc_textParticipantes = new GridBagConstraints();
		gbc_textParticipantes.insets = new Insets(0, 0, 5, 5);
		gbc_textParticipantes.fill = GridBagConstraints.BOTH;
		gbc_textParticipantes.gridx = 1;
		gbc_textParticipantes.gridy = 1;
		panel.add(textParticipantes, gbc_textParticipantes);
		textParticipantes.setColumns(10);
		
		btnFoto = new JButton(""); //$NON-NLS-1$
		btnFoto.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/dslr-camera.png")));
		btnFoto.addActionListener(new BtnFotoActionListener());
		GridBagConstraints gbc_btnFoto = new GridBagConstraints();
		gbc_btnFoto.insets = new Insets(0, 0, 5, 0);
		gbc_btnFoto.fill = GridBagConstraints.BOTH;
		gbc_btnFoto.gridheight = 4;
		gbc_btnFoto.gridx = 6;
		gbc_btnFoto.gridy = 1;
		panel.add(btnFoto, gbc_btnFoto);
		
		JLabel lblPrecio = new JLabel(Messages.getString("ListadoCircuitos.11")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.fill = GridBagConstraints.VERTICAL;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 2;
		panel.add(lblPrecio, gbc_lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.gridwidth = 4;
		gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecio.fill = GridBagConstraints.BOTH;
		gbc_textPrecio.gridx = 1;
		gbc_textPrecio.gridy = 2;
		panel.add(textPrecio, gbc_textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblIncidencias = new JLabel(Messages.getString("ListadoCircuitos.12")); //$NON-NLS-1$
		GridBagConstraints gbc_lblIncidencias = new GridBagConstraints();
		gbc_lblIncidencias.fill = GridBagConstraints.VERTICAL;
		gbc_lblIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncidencias.anchor = GridBagConstraints.EAST;
		gbc_lblIncidencias.gridx = 0;
		gbc_lblIncidencias.gridy = 3;
		panel.add(lblIncidencias, gbc_lblIncidencias);
		
		textIncidencias = new JTextField();
		textIncidencias.setEditable(false);
		GridBagConstraints gbc_textIncidencias = new GridBagConstraints();
		gbc_textIncidencias.gridwidth = 5;
		gbc_textIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_textIncidencias.fill = GridBagConstraints.BOTH;
		gbc_textIncidencias.gridx = 1;
		gbc_textIncidencias.gridy = 3;
		panel.add(textIncidencias, gbc_textIncidencias);
		textIncidencias.setColumns(10);
		
		JLabel lblOpiniones = new JLabel(Messages.getString("ListadoCircuitos.13")); //$NON-NLS-1$
		GridBagConstraints gbc_lblOpiniones = new GridBagConstraints();
		gbc_lblOpiniones.fill = GridBagConstraints.VERTICAL;
		gbc_lblOpiniones.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpiniones.anchor = GridBagConstraints.EAST;
		gbc_lblOpiniones.gridx = 0;
		gbc_lblOpiniones.gridy = 4;
		panel.add(lblOpiniones, gbc_lblOpiniones);
		
		textOpiniones = new JTextPane();
		textOpiniones.setEditable(false);
		GridBagConstraints gbc_textOpiniones = new GridBagConstraints();
		gbc_textOpiniones.gridwidth = 5;
		gbc_textOpiniones.insets = new Insets(0, 0, 5, 5);
		gbc_textOpiniones.fill = GridBagConstraints.BOTH;
		gbc_textOpiniones.gridx = 1;
		gbc_textOpiniones.gridy = 4;
		panel.add(textOpiniones, gbc_textOpiniones);
		
		listCircuitos = new JList();
		listCircuitos.setBorder(new TitledBorder(null, Messages.getString("ListadoCircuitos.14"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_listCircuitos = new GridBagConstraints();
		gbc_listCircuitos.gridheight = 3;
		gbc_listCircuitos.gridwidth = 3;
		gbc_listCircuitos.insets = new Insets(0, 0, 5, 5);
		gbc_listCircuitos.fill = GridBagConstraints.BOTH;
		gbc_listCircuitos.gridx = 4;
		gbc_listCircuitos.gridy = 3;
		add(listCircuitos, gbc_listCircuitos);
		
		btnCancelar = new JButton(Messages.getString("ListadoCircuitos.15")); //$NON-NLS-1$
		btnCancelar.setBackground(new Color(255, 102, 102));
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setEnabled(false);
		btnCancelar.setVisible(false);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 5;
		gbc_btnCancelar.gridy = 6;
		add(btnCancelar, gbc_btnCancelar);
		
		btnGuardar = new JButton(Messages.getString("ListadoCircuitos.16")); //$NON-NLS-1$
		btnGuardar.setBackground(new Color(102, 255, 102));
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 6;
		gbc_btnGuardar.gridy = 6;
		add(btnGuardar, gbc_btnGuardar);

		crearLista();
		crearListaProximos();
		
		
	}
	
	void crearLista() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaCircuitosList.size() - 1; i++) {
			modelo.addElement(listaCircuitosList.get(i).getCiudad());
		}
		listCiudades.setModel(modelo);
	}
	
	void crearListaProximos() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaProximosCircuitosList.size() - 1; i++) {
			modelo.addElement(listaProximosCircuitosList.get(i).getCiudad()+"    "+listaProximosCircuitosList.get(i).getFecha());
		}
		listCircuitos.setModel(modelo);
	}
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			cargarCircuitosList(listaCircuitosList.get(listCiudades.getSelectedIndex()));
		}
	}
	
	private void cargarCircuitosList(CircuitosList circuitoList) {
		textCiudad.setText(circuitoList.getCiudad());
		textParticipantes.setText(circuitoList.getParticipantes());
		textPrecio.setText(circuitoList.getEntrada());
		textIncidencias.setText(circuitoList.getIncidencias());
		textOpiniones.setText(circuitoList.getOpiniones());
		btnFoto.setIcon(new ImageIcon(circuitoList.getFoto()));
	}

	public static ArrayList<CircuitosList> getListaCircuitosList() {
		return listaCircuitosList;
	}
	
	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(true);
			setOpcion(2);
		}
	}
	
	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				listaCircuitosList.remove(listCiudades.getSelectedIndex());
				crearLista();
			} catch (ArrayIndexOutOfBoundsException ai) {

			}
		}
	}
	
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(false);
		}
	}
	
	private class BtnFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (textCiudad.isEditable()) {
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
	
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			habilitar(false);
			btnFoto.setText(""); //$NON-NLS-1$
			try {
				switch (getOpcion()) {
				case 1:
					listaCircuitosList.add(new CircuitosList(textCiudad.getText(), textParticipantes.getText(), textPrecio.getText(), textIncidencias.getText(), textOpiniones.getText(), getFoto()));
					break;
				case 2:
					CircuitosList cir = listaCircuitosList.get(listCiudades.getSelectedIndex());
					cir.setCiudad(textCiudad.getText());
					cir.setParticipantes(textParticipantes.getText());
					cir.setEntrada(textPrecio.getText());
					cir.setIncidencias(textIncidencias.getText());
					cir.setOpiniones(textOpiniones.getText());
					cir.setFoto(getFoto());
					listaCircuitosList.set(listCiudades.getSelectedIndex(), cir);
					break;
				}

				crearLista();
			} catch (Exception e2) {

			}

		}
	}
	
	private class BtnAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			habilitar(true);
			textCiudad.setText(""); //$NON-NLS-1$
			textParticipantes.setText(""); //$NON-NLS-1$
			textPrecio.setText(""); //$NON-NLS-1$
			textIncidencias.setText(""); //$NON-NLS-1$
			textOpiniones.setText(""); //$NON-NLS-1$
			btnFoto.setIcon(null);
			setOpcion(1);
		}
	}
	
	private int getOpcion() {
		return opcion;
	}

	private void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	private URL getFoto() {
		return foto;
	}

	private void setFoto(URL foto) {
		this.foto = foto;
	}
	
	private void habilitar(boolean opcion) {

		btnGuardar.setVisible(opcion);
		btnGuardar.setEnabled(opcion);
		btnCancelar.setVisible(opcion);
		btnCancelar.setEnabled(opcion);
		textCiudad.setEditable(opcion);
		textParticipantes.setEditable(opcion);
		textPrecio.setEditable(opcion);
		textIncidencias.setEditable(opcion);
		textOpiniones.setEditable(opcion);
		// btnFoto.setEnabled(opcion);
	}
	
}
