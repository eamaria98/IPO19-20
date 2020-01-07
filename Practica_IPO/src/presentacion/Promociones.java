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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dominio.CircuitosList;
import dominio.PromocionesD;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Promociones extends JPanel {
	private JPanel panel;
	private int opcion;
	private URL foto;
	private JTextField textBusqueda;
	private JTextField textCiudad;
	private JTextField textCircuito;
	private JTextField textDescuento;
	private JTextField textValidez;
	private static ArrayList<PromocionesD> listaPromociones = PromocionesD.generarPromocion();
	private JList list;
	private JButton btnFoto;
	private JButton btnCancelar;
	private JButton btnGuardar;
	//VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
	/**
	 * Create the panel.
	 */
	public Promociones() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNort = new JPanel();
		add(pnlNort, BorderLayout.NORTH);
		GridBagLayout gbl_pnlNort = new GridBagLayout();
		gbl_pnlNort.columnWidths = new int[]{0, 0, 30, 179, 0, 0, 330, 162, 0};
		gbl_pnlNort.rowHeights = new int[]{20, 40, 20, 0};
		gbl_pnlNort.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlNort.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlNort.setLayout(gbl_pnlNort);
		
		textBusqueda = new JTextField();
		textBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				if(textBusqueda.getText().equals("")){ //$NON-NLS-1$
					crearLista();
				}else {
					for (int i = 0; i <= listaPromociones.size() - 1; i++) {
						if(listaPromociones.get(i).getCiudad().equals(textBusqueda.getText())) {
							modelo.addElement(listaPromociones.get(i).getCiudad());
						}
					}
					list.setModel(modelo);
				}
			}
		});
		
		JLabel lblBuscarPromocion = new JLabel(Messages.getString("Promociones.1")); //$NON-NLS-1$
		GridBagConstraints gbc_lblBuscarPromocion = new GridBagConstraints();
		gbc_lblBuscarPromocion.gridwidth = 2;
		gbc_lblBuscarPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarPromocion.gridx = 4;
		gbc_lblBuscarPromocion.gridy = 1;
		pnlNort.add(lblBuscarPromocion, gbc_lblBuscarPromocion);
		GridBagConstraints gbc_textBusqueda = new GridBagConstraints();
		gbc_textBusqueda.insets = new Insets(0, 0, 5, 5);
		gbc_textBusqueda.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBusqueda.gridx = 6;
		gbc_textBusqueda.gridy = 1;
		pnlNort.add(textBusqueda, gbc_textBusqueda);
		textBusqueda.setColumns(10);
		
		JPanel pnlCenter = new JPanel();
		add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[] {0, 117, 0, 30, 53, 40, 295};
		gbl_pnlCenter.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		list = new JList();
		list.addListSelectionListener(new ListListSelectionListener());
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		pnlCenter.add(list, gbc_list);
		
		btnFoto = new JButton(""); //$NON-NLS-1$
		btnFoto.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/dslr-camera.png")));
		GridBagConstraints gbc_btnFoto = new GridBagConstraints();
		btnFoto.addActionListener(new BtnFotoActionListener());
		gbc_btnFoto.fill = GridBagConstraints.BOTH;
		gbc_btnFoto.gridheight = 2;
		gbc_btnFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnFoto.gridx = 3;
		gbc_btnFoto.gridy = 1;
		pnlCenter.add(btnFoto, gbc_btnFoto);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 6;
		gbc_panel.gridy = 1;
		pnlCenter.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {94, 110, 0, 57, 71, 0, 30};
		gbl_panel.rowHeights = new int[] {30, 30, 30, 30, 0, 30};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblCiudad = new JLabel(Messages.getString("Promociones.3")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 0;
		gbc_lblCiudad.gridy = 0;
		panel.add(lblCiudad, gbc_lblCiudad);
		
		textCiudad = new JTextField();
		textCiudad.setEditable(false);
		GridBagConstraints gbc_textCiudad = new GridBagConstraints();
		gbc_textCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCiudad.gridwidth = 3;
		gbc_textCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textCiudad.gridx = 1;
		gbc_textCiudad.gridy = 0;
		panel.add(textCiudad, gbc_textCiudad);
		textCiudad.setColumns(10);
		
		JLabel lblCircuito = new JLabel(Messages.getString("Promociones.4")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCircuito = new GridBagConstraints();
		gbc_lblCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblCircuito.gridx = 0;
		gbc_lblCircuito.gridy = 1;
		panel.add(lblCircuito, gbc_lblCircuito);
		
		textCircuito = new JTextField();
		textCircuito.setEditable(false);
		GridBagConstraints gbc_textCircuito = new GridBagConstraints();
		gbc_textCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCircuito.gridwidth = 3;
		gbc_textCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_textCircuito.gridx = 1;
		gbc_textCircuito.gridy = 1;
		panel.add(textCircuito, gbc_textCircuito);
		textCircuito.setColumns(10);
		
		JLabel lblDescuento = new JLabel(Messages.getString("Promociones.5")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
		gbc_lblDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescuento.gridx = 0;
		gbc_lblDescuento.gridy = 2;
		panel.add(lblDescuento, gbc_lblDescuento);
		
		textDescuento = new JTextField();
		textDescuento.setEditable(false);
		GridBagConstraints gbc_textDescuento = new GridBagConstraints();
		gbc_textDescuento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDescuento.gridwidth = 4;
		gbc_textDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_textDescuento.gridx = 1;
		gbc_textDescuento.gridy = 2;
		panel.add(textDescuento, gbc_textDescuento);
		textDescuento.setColumns(10);
		
		JLabel lblValidez = new JLabel(Messages.getString("Promociones.6")); //$NON-NLS-1$
		GridBagConstraints gbc_lblValidez = new GridBagConstraints();
		gbc_lblValidez.insets = new Insets(0, 0, 5, 5);
		gbc_lblValidez.gridx = 0;
		gbc_lblValidez.gridy = 3;
		panel.add(lblValidez, gbc_lblValidez);
		
		textValidez = new JTextField();
		textValidez.setEditable(false);
		GridBagConstraints gbc_textValidez = new GridBagConstraints();
		gbc_textValidez.fill = GridBagConstraints.HORIZONTAL;
		gbc_textValidez.gridwidth = 2;
		gbc_textValidez.insets = new Insets(0, 0, 5, 5);
		gbc_textValidez.gridx = 1;
		gbc_textValidez.gridy = 3;
		panel.add(textValidez, gbc_textValidez);
		textValidez.setColumns(10);
		
		btnCancelar = new JButton(Messages.getString("Promociones.7")); //$NON-NLS-1$
		btnCancelar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/close.png"))); //$NON-NLS-1$
		btnCancelar.setBackground(new Color(255, 102, 102));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		btnCancelar.setEnabled(false);
		btnCancelar.setVisible(false);
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 4;
		panel.add(btnCancelar, gbc_btnCancelar);
		
		btnGuardar = new JButton(Messages.getString("Promociones.9")); //$NON-NLS-1$
		btnGuardar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/tick.png"))); //$NON-NLS-1$
		btnGuardar.setBackground(new Color(153, 255, 102));
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 4;
		panel.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnBorrar = new JButton(Messages.getString("Promociones.11")); //$NON-NLS-1$
		btnBorrar.setBackground(new Color(255, 102, 102));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnBorrar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/recycle-bin-filled-tool.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 2;
		gbc_btnBorrar.gridy = 5;
		pnlCenter.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton(Messages.getString("Promociones.13")); //$NON-NLS-1$
		btnModificar.setBackground(Color.GRAY);
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/refresh-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 3;
		gbc_btnModificar.gridy = 5;
		pnlCenter.add(btnModificar, gbc_btnModificar);
		
		JButton btnAadir = new JButton(Messages.getString("Promociones.15")); //$NON-NLS-1$
		btnAadir.setBackground(new Color(153, 255, 102));
		btnAadir.addActionListener(new BtnAñadirActionListener());
		btnAadir.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/plus.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 4;
		gbc_btnAadir.gridy = 5;
		pnlCenter.add(btnAadir, gbc_btnAadir);
		
		crearLista();

	}
	
	void crearLista() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaPromociones.size() - 1; i++) {
			modelo.addElement(listaPromociones.get(i).getCiudad());
		}
		list.setModel(modelo);
	}
	
	public static ArrayList<PromocionesD> getListaCircuitosList() {
		return listaPromociones;
	}
	
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			cargarPromociones(listaPromociones.get(list.getSelectedIndex()));
		}
	}
	
	private void cargarPromociones(PromocionesD promocionesD) {
		textCiudad.setText(promocionesD.getCiudad());
		textCircuito.setText(promocionesD.getCircuito());
		textDescuento.setText(promocionesD.getDescuento());
		textValidez.setText(promocionesD.getValidez());
		btnFoto.setIcon(new ImageIcon(promocionesD.getFoto()));
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
				listaPromociones.remove(list.getSelectedIndex());
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
					listaPromociones.add(new PromocionesD(textCiudad.getText(), textCircuito.getText(), textDescuento.getText(), textValidez.getText(), getFoto()));
					break;
				case 2:
					PromocionesD prom = listaPromociones.get(list.getSelectedIndex());
					prom.setCiudad(textCiudad.getText());
					prom.setCircuito(textCircuito.getText());
					prom.setDescuento(textDescuento.getText());
					prom.setValidez(textValidez.getText());
					listaPromociones.set(list.getSelectedIndex(), prom);
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
			textCircuito.setText(""); //$NON-NLS-1$
			textDescuento.setText(""); //$NON-NLS-1$
			textValidez.setText(""); //$NON-NLS-1$
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
		textCiudad.setEditable(opcion);
		textCircuito.setEditable(opcion);
		textDescuento.setEditable(opcion);
		textValidez.setEditable(opcion);
		// btnFoto.setEnabled(opcion);
	}
	
	
}
