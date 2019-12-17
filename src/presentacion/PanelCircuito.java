package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PanelCircuito extends JPanel {
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtRestaurante;
	private JTextField txtTienda;

	/**
	 * Create the panel.
	 */
	public PanelCircuito() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{13, 0, 0, 59, 0, 0};
		gridBagLayout.rowHeights = new int[] {63, 0, 40, 41, 40, 40, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblFoto = new JLabel("FOTO");
		lblFoto.setIcon(new ImageIcon(PanelCirAmp.class.getResource("/presentacion/icon user.png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.NORTH;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 3;
		gbc_lblFoto.gridy = 0;
		add(lblFoto, gbc_lblFoto);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 2;
		gbc_lblCiudad.gridy = 2;
		add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.gridx = 3;
		gbc_txtCiudad.gridy = 2;
		add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblMonumento = new JLabel("Monumento:");
		GridBagConstraints gbc_lblMonumento = new GridBagConstraints();
		gbc_lblMonumento.anchor = GridBagConstraints.EAST;
		gbc_lblMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumento.gridx = 2;
		gbc_lblMonumento.gridy = 3;
		add(lblMonumento, gbc_lblMonumento);
		
		txtMonumento = new JTextField();
		txtMonumento.setEditable(false);
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.gridx = 3;
		gbc_txtMonumento.gridy = 3;
		add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);
		
		JLabel lblRestaurante = new JLabel("Restaurante:");
		GridBagConstraints gbc_lblRestaurante = new GridBagConstraints();
		gbc_lblRestaurante.anchor = GridBagConstraints.EAST;
		gbc_lblRestaurante.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestaurante.gridx = 2;
		gbc_lblRestaurante.gridy = 4;
		add(lblRestaurante, gbc_lblRestaurante);
		
		txtRestaurante = new JTextField();
		txtRestaurante.setEditable(false);
		GridBagConstraints gbc_txtRestaurante = new GridBagConstraints();
		gbc_txtRestaurante.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRestaurante.insets = new Insets(0, 0, 5, 5);
		gbc_txtRestaurante.gridx = 3;
		gbc_txtRestaurante.gridy = 4;
		add(txtRestaurante, gbc_txtRestaurante);
		txtRestaurante.setColumns(10);
		
		JLabel lblTienda = new JLabel("Tienda:");
		GridBagConstraints gbc_lblTienda = new GridBagConstraints();
		gbc_lblTienda.anchor = GridBagConstraints.EAST;
		gbc_lblTienda.insets = new Insets(0, 0, 0, 5);
		gbc_lblTienda.gridx = 2;
		gbc_lblTienda.gridy = 5;
		add(lblTienda, gbc_lblTienda);
		
		txtTienda = new JTextField();
		txtTienda.setEditable(false);
		GridBagConstraints gbc_txtTienda = new GridBagConstraints();
		gbc_txtTienda.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTienda.insets = new Insets(0, 0, 0, 5);
		gbc_txtTienda.gridx = 3;
		gbc_txtTienda.gridy = 5;
		add(txtTienda, gbc_txtTienda);
		txtTienda.setColumns(10);

	}

}
