package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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

public class Circuitos extends JPanel {
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtRestaurante;
	private JTextField txtTienda;
	//VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
	/**
	 * Create the panel.
	 */
	public Circuitos() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{25, 0, 0, 0, 0, 0};
		gbl_pnlLista.rowHeights = new int[]{25, 44, 10, 0, 30, 0};
		gbl_pnlLista.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlLista.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/recycle-bin-filled-tool.png")));
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 3;
		pnlLista.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/refresh-button.png")));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 3;
		pnlLista.add(btnModificar, gbc_btnModificar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/plus.png")));
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 3;
		gbc_btnReservar.gridy = 3;
		pnlLista.add(btnReservar, gbc_btnReservar);
		
		JPanel pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[]{0, 378, 213, 0, 242, 38, 0, 0, 0};
		gbl_pnlDatos.rowHeights = new int[]{0, 40, 40, 40, 40, 40, 40, 40, 0, 0, 0};
		gbl_pnlDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlDatos.setLayout(gbl_pnlDatos);
		
		JButton btnFoto = new JButton("FOTO");
		GridBagConstraints gbc_btnFoto = new GridBagConstraints();
		gbc_btnFoto.fill = GridBagConstraints.BOTH;
		gbc_btnFoto.gridheight = 8;
		gbc_btnFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnFoto.gridx = 1;
		gbc_btnFoto.gridy = 1;
		pnlDatos.add(btnFoto, gbc_btnFoto);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 3;
		gbc_lblCiudad.gridy = 4;
		pnlDatos.add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.gridx = 4;
		gbc_txtCiudad.gridy = 4;
		pnlDatos.add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblMonumento = new JLabel("Monumento:");
		GridBagConstraints gbc_lblMonumento = new GridBagConstraints();
		gbc_lblMonumento.anchor = GridBagConstraints.WEST;
		gbc_lblMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumento.gridx = 3;
		gbc_lblMonumento.gridy = 5;
		pnlDatos.add(lblMonumento, gbc_lblMonumento);
		
		txtMonumento = new JTextField();
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.gridx = 4;
		gbc_txtMonumento.gridy = 5;
		pnlDatos.add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);
		
		JLabel lblRestaurantes = new JLabel("Restaurante/s:");
		GridBagConstraints gbc_lblRestaurantes = new GridBagConstraints();
		gbc_lblRestaurantes.anchor = GridBagConstraints.WEST;
		gbc_lblRestaurantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestaurantes.gridx = 3;
		gbc_lblRestaurantes.gridy = 6;
		pnlDatos.add(lblRestaurantes, gbc_lblRestaurantes);
		
		txtRestaurante = new JTextField();
		GridBagConstraints gbc_txtRestaurante = new GridBagConstraints();
		gbc_txtRestaurante.insets = new Insets(0, 0, 5, 5);
		gbc_txtRestaurante.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRestaurante.gridx = 4;
		gbc_txtRestaurante.gridy = 6;
		pnlDatos.add(txtRestaurante, gbc_txtRestaurante);
		txtRestaurante.setColumns(10);
		
		JLabel lblTiendas = new JLabel("Tienda/s:");
		GridBagConstraints gbc_lblTiendas = new GridBagConstraints();
		gbc_lblTiendas.anchor = GridBagConstraints.WEST;
		gbc_lblTiendas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTiendas.gridx = 3;
		gbc_lblTiendas.gridy = 7;
		pnlDatos.add(lblTiendas, gbc_lblTiendas);
		
		txtTienda = new JTextField();
		GridBagConstraints gbc_txtTienda = new GridBagConstraints();
		gbc_txtTienda.insets = new Insets(0, 0, 5, 5);
		gbc_txtTienda.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTienda.gridx = 4;
		gbc_txtTienda.gridy = 7;
		pnlDatos.add(txtTienda, gbc_txtTienda);
		txtTienda.setColumns(10);

	}
}
