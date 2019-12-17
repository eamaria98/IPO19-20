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
import javax.swing.JCheckBox;

public class PanelPromocion extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelPromocion() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{13, 0, 269, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 40, 41, 40, 40, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 0;
		add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JLabel lblTipoViaje = new JLabel("VIAJE EXPRESS");
		GridBagConstraints gbc_lblTipoViaje = new GridBagConstraints();
		gbc_lblTipoViaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoViaje.gridx = 2;
		gbc_lblTipoViaje.gridy = 1;
		add(lblTipoViaje, gbc_lblTipoViaje);
		
		JLabel lblFoto = new JLabel("FOTO");
		lblFoto.setIcon(new ImageIcon(PanelCirAmp.class.getResource("/presentacion/icon user.png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.NORTH;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 1;
		gbc_lblFoto.gridy = 2;
		add(lblFoto, gbc_lblFoto);
		
		JLabel lblTiempoPrecio = new JLabel("7 dias por tan solo 480\u20AC");
		GridBagConstraints gbc_lblTiempoPrecio = new GridBagConstraints();
		gbc_lblTiempoPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblTiempoPrecio.gridx = 2;
		gbc_lblTiempoPrecio.gridy = 2;
		add(lblTiempoPrecio, gbc_lblTiempoPrecio);
		
		JLabel lblPromocion = new JLabel("Promocion valida hasta");
		GridBagConstraints gbc_lblPromocion = new GridBagConstraints();
		gbc_lblPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lblPromocion.gridx = 2;
		gbc_lblPromocion.gridy = 3;
		add(lblPromocion, gbc_lblPromocion);
		
		JLabel lblFecha = new JLabel("24/11/2019");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.insets = new Insets(0, 0, 0, 5);
		gbc_lblFecha.gridx = 2;
		gbc_lblFecha.gridy = 4;
		add(lblFecha, gbc_lblFecha);

	}

}
