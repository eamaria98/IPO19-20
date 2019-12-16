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
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class PanelNuevaPromocion extends JPanel {
	private JComboBox comboBoxCiudad;
	private JComboBox comboBoxCircuito;
	private JComboBox comboBoxDescuento;
	private JTable tableFecha;
	private JButton btnCancelar;
	private JButton btnGuardar;

	/**
	 * Create the panel.
	 */
	public PanelNuevaPromocion() {
		setBorder(new TitledBorder(null, "Nueva Promoci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{13, 0, 59, 59, 0, 0};
		gridBagLayout.rowHeights = new int[] {39, 40, 41, 40, 58, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 1;
		add(lblCiudad, gbc_lblCiudad);
		
		comboBoxCiudad = new JComboBox();
		GridBagConstraints gbc_comboBoxCiudad = new GridBagConstraints();
		gbc_comboBoxCiudad.gridwidth = 2;
		gbc_comboBoxCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCiudad.gridx = 2;
		gbc_comboBoxCiudad.gridy = 1;
		add(comboBoxCiudad, gbc_comboBoxCiudad);
		
		JLabel lblCircuito = new JLabel("Circuito:");
		GridBagConstraints gbc_lblCircuito = new GridBagConstraints();
		gbc_lblCircuito.anchor = GridBagConstraints.WEST;
		gbc_lblCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblCircuito.gridx = 1;
		gbc_lblCircuito.gridy = 2;
		add(lblCircuito, gbc_lblCircuito);
		
		comboBoxCircuito = new JComboBox();
		GridBagConstraints gbc_comboBoxCircuito = new GridBagConstraints();
		gbc_comboBoxCircuito.gridwidth = 2;
		gbc_comboBoxCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCircuito.gridx = 2;
		gbc_comboBoxCircuito.gridy = 2;
		add(comboBoxCircuito, gbc_comboBoxCircuito);
		
		JLabel lblTipoDescuento = new JLabel("Tipo de descuento:");
		GridBagConstraints gbc_lblTipoDescuento = new GridBagConstraints();
		gbc_lblTipoDescuento.anchor = GridBagConstraints.WEST;
		gbc_lblTipoDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDescuento.gridx = 1;
		gbc_lblTipoDescuento.gridy = 3;
		add(lblTipoDescuento, gbc_lblTipoDescuento);
		
		comboBoxDescuento = new JComboBox();
		GridBagConstraints gbc_comboBoxDescuento = new GridBagConstraints();
		gbc_comboBoxDescuento.gridwidth = 2;
		gbc_comboBoxDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDescuento.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDescuento.gridx = 2;
		gbc_comboBoxDescuento.gridy = 3;
		add(comboBoxDescuento, gbc_comboBoxDescuento);
		
		JLabel lblValida = new JLabel("Promocion valida hasta:");
		GridBagConstraints gbc_lblValida = new GridBagConstraints();
		gbc_lblValida.anchor = GridBagConstraints.WEST;
		gbc_lblValida.insets = new Insets(0, 0, 5, 5);
		gbc_lblValida.gridx = 1;
		gbc_lblValida.gridy = 4;
		add(lblValida, gbc_lblValida);
		
		tableFecha = new JTable();
		GridBagConstraints gbc_tableFecha = new GridBagConstraints();
		gbc_tableFecha.gridwidth = 2;
		gbc_tableFecha.insets = new Insets(0, 0, 5, 5);
		gbc_tableFecha.fill = GridBagConstraints.BOTH;
		gbc_tableFecha.gridx = 2;
		gbc_tableFecha.gridy = 4;
		add(tableFecha, gbc_tableFecha);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(PanelNuevaPromocion.class.getResource("/presentacion/close.png")));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 7;
		add(btnCancelar, gbc_btnCancelar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(PanelNuevaPromocion.class.getResource("/presentacion/tick.png")));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 3;
		gbc_btnGuardar.gridy = 7;
		add(btnGuardar, gbc_btnGuardar);

	}

}
