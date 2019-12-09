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

public class PanelCirAmp extends JPanel {
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtEntrada;
	private JTextField txtHoravisita;
	private JTextField txtDuracinvisita;
	private JTextField txtTipologa;

	/**
	 * Create the panel.
	 */
	public PanelCirAmp() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 40, 40, 40, 40, 40, 40, 40, 40, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblFoto = new JLabel("FOTO");
		lblFoto.setIcon(new ImageIcon(PanelCirAmp.class.getResource("/presentacion/icon user.png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 2;
		gbc_lblFoto.gridheight = 2;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 2;
		gbc_lblFoto.gridy = 1;
		add(lblFoto, gbc_lblFoto);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 3;
		add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.gridx = 2;
		gbc_txtCiudad.gridy = 3;
		add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblMonumento = new JLabel("Monumento:");
		GridBagConstraints gbc_lblMonumento = new GridBagConstraints();
		gbc_lblMonumento.anchor = GridBagConstraints.EAST;
		gbc_lblMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumento.gridx = 1;
		gbc_lblMonumento.gridy = 4;
		add(lblMonumento, gbc_lblMonumento);
		
		txtMonumento = new JTextField();
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.gridx = 2;
		gbc_txtMonumento.gridy = 4;
		add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);
		
		JLabel lblEntrada = new JLabel("Entrada:");
		GridBagConstraints gbc_lblEntrada = new GridBagConstraints();
		gbc_lblEntrada.anchor = GridBagConstraints.EAST;
		gbc_lblEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblEntrada.gridx = 1;
		gbc_lblEntrada.gridy = 5;
		add(lblEntrada, gbc_lblEntrada);
		
		txtEntrada = new JTextField();
		GridBagConstraints gbc_txtEntrada = new GridBagConstraints();
		gbc_txtEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_txtEntrada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEntrada.gridx = 2;
		gbc_txtEntrada.gridy = 5;
		add(txtEntrada, gbc_txtEntrada);
		txtEntrada.setColumns(10);
		
		JLabel lblHoraVisita = new JLabel("Hora visita:");
		GridBagConstraints gbc_lblHoraVisita = new GridBagConstraints();
		gbc_lblHoraVisita.anchor = GridBagConstraints.EAST;
		gbc_lblHoraVisita.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraVisita.gridx = 1;
		gbc_lblHoraVisita.gridy = 6;
		add(lblHoraVisita, gbc_lblHoraVisita);
		
		txtHoravisita = new JTextField();
		GridBagConstraints gbc_txtHoravisita = new GridBagConstraints();
		gbc_txtHoravisita.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoravisita.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoravisita.gridx = 2;
		gbc_txtHoravisita.gridy = 6;
		add(txtHoravisita, gbc_txtHoravisita);
		txtHoravisita.setColumns(10);
		
		JLabel lblDuracinVisita = new JLabel("Duraci\u00F3n visita:");
		GridBagConstraints gbc_lblDuracinVisita = new GridBagConstraints();
		gbc_lblDuracinVisita.anchor = GridBagConstraints.EAST;
		gbc_lblDuracinVisita.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracinVisita.gridx = 1;
		gbc_lblDuracinVisita.gridy = 7;
		add(lblDuracinVisita, gbc_lblDuracinVisita);
		
		txtDuracinvisita = new JTextField();
		GridBagConstraints gbc_txtDuracinvisita = new GridBagConstraints();
		gbc_txtDuracinvisita.insets = new Insets(0, 0, 5, 5);
		gbc_txtDuracinvisita.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDuracinvisita.gridx = 2;
		gbc_txtDuracinvisita.gridy = 7;
		add(txtDuracinvisita, gbc_txtDuracinvisita);
		txtDuracinvisita.setColumns(10);
		
		JLabel lblTipologa = new JLabel("Tipolog\u00EDa:");
		GridBagConstraints gbc_lblTipologa = new GridBagConstraints();
		gbc_lblTipologa.anchor = GridBagConstraints.EAST;
		gbc_lblTipologa.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologa.gridx = 1;
		gbc_lblTipologa.gridy = 8;
		add(lblTipologa, gbc_lblTipologa);
		
		txtTipologa = new JTextField();
		GridBagConstraints gbc_txtTipologa = new GridBagConstraints();
		gbc_txtTipologa.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipologa.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipologa.gridx = 2;
		gbc_txtTipologa.gridy = 8;
		add(txtTipologa, gbc_txtTipologa);
		txtTipologa.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 9;
		add(lblDescripcin, gbc_lblDescripcin);
		
		JTextPane txtpnDescripcion = new JTextPane();
		GridBagConstraints gbc_txtpnDescripcion = new GridBagConstraints();
		gbc_txtpnDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtpnDescripcion.gridx = 2;
		gbc_txtpnDescripcion.gridy = 9;
		add(txtpnDescripcion, gbc_txtpnDescripcion);

	}

}
