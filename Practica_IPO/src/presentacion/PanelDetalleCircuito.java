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

public class PanelDetalleCircuito extends JPanel {
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtRestaurante;
	private JTextField txtTienda;

	/**
	 * Create the panel.
	 */
	public PanelDetalleCircuito() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{13, 0, 191, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {63, 0, 40, 41, 40, 37, 70, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblFoto = new JLabel("FOTO");
		lblFoto.setIcon(new ImageIcon(PanelCirAmp.class.getResource("/presentacion/icon user.png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.NORTH;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 3;
		gbc_lblFoto.gridy = 1;
		add(lblFoto, gbc_lblFoto);
		
		JLabel lblPersonas = new JLabel("Numero personas han realizado el circuito:");
		GridBagConstraints gbc_lblPersonas = new GridBagConstraints();
		gbc_lblPersonas.anchor = GridBagConstraints.EAST;
		gbc_lblPersonas.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonas.gridx = 1;
		gbc_lblPersonas.gridy = 2;
		add(lblPersonas, gbc_lblPersonas);
		
		txtCiudad = new JTextField();
		txtCiudad.setEditable(false);
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.gridx = 2;
		gbc_txtCiudad.gridy = 2;
		add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);
		
		txtMonumento = new JTextField();
		txtMonumento.setEditable(false);
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.gridx = 2;
		gbc_txtMonumento.gridy = 3;
		add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);
		
		JLabel lblIncidencias = new JLabel("Incidencias:");
		GridBagConstraints gbc_lblIncidencias = new GridBagConstraints();
		gbc_lblIncidencias.anchor = GridBagConstraints.EAST;
		gbc_lblIncidencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncidencias.gridx = 1;
		gbc_lblIncidencias.gridy = 4;
		add(lblIncidencias, gbc_lblIncidencias);
		
		txtRestaurante = new JTextField();
		txtRestaurante.setEditable(false);
		GridBagConstraints gbc_txtRestaurante = new GridBagConstraints();
		gbc_txtRestaurante.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRestaurante.insets = new Insets(0, 0, 5, 5);
		gbc_txtRestaurante.gridx = 2;
		gbc_txtRestaurante.gridy = 4;
		add(txtRestaurante, gbc_txtRestaurante);
		txtRestaurante.setColumns(10);
		
		JLabel lblOpiniones = new JLabel("Opiniones Turistas:");
		GridBagConstraints gbc_lblOpiniones = new GridBagConstraints();
		gbc_lblOpiniones.fill = GridBagConstraints.VERTICAL;
		gbc_lblOpiniones.anchor = GridBagConstraints.EAST;
		gbc_lblOpiniones.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpiniones.gridx = 1;
		gbc_lblOpiniones.gridy = 5;
		add(lblOpiniones, gbc_lblOpiniones);
		
		txtTienda = new JTextField();
		txtTienda.setEditable(false);
		GridBagConstraints gbc_txtTienda = new GridBagConstraints();
		gbc_txtTienda.gridheight = 2;
		gbc_txtTienda.fill = GridBagConstraints.BOTH;
		gbc_txtTienda.insets = new Insets(0, 0, 5, 5);
		gbc_txtTienda.gridx = 2;
		gbc_txtTienda.gridy = 5;
		add(txtTienda, gbc_txtTienda);
		txtTienda.setColumns(10);

	}

}
