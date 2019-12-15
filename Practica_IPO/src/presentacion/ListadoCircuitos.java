package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ImageIcon;

public class ListadoCircuitos extends JPanel {
	private JTextField textBusquedaCiudad;

	/**
	 * Create the panel.
	 */
	public ListadoCircuitos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {90, 0, 0, 74, 61, 68, 0, 0, 0, 30};
		gridBagLayout.rowHeights = new int[] {0, 0, 30, 46, 30, 30, 0, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblBusquedaPorCiudad = new JLabel("Busqueda por ciudad");
		GridBagConstraints gbc_lblBusquedaPorCiudad = new GridBagConstraints();
		gbc_lblBusquedaPorCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblBusquedaPorCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusquedaPorCiudad.gridx = 1;
		gbc_lblBusquedaPorCiudad.gridy = 1;
		add(lblBusquedaPorCiudad, gbc_lblBusquedaPorCiudad);
		
		textBusquedaCiudad = new JTextField();
		GridBagConstraints gbc_textBusquedaCiudad = new GridBagConstraints();
		gbc_textBusquedaCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textBusquedaCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBusquedaCiudad.gridx = 2;
		gbc_textBusquedaCiudad.gridy = 1;
		add(textBusquedaCiudad, gbc_textBusquedaCiudad);
		textBusquedaCiudad.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/recycle-bin-filled-tool.png")));
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.anchor = GridBagConstraints.EAST;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 6;
		gbc_btnBorrar.gridy = 1;
		add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/refresh-button.png")));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 7;
		gbc_btnModificar.gridy = 1;
		add(btnModificar, gbc_btnModificar);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setIcon(new ImageIcon(ListadoCircuitos.class.getResource("/presentacion/plus.png")));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 8;
		gbc_btnAadir.gridy = 1;
		add(btnAadir, gbc_btnAadir);
		
		JList listCiudades = new JList();
		GridBagConstraints gbc_listCiudades = new GridBagConstraints();
		gbc_listCiudades.gridheight = 5;
		gbc_listCiudades.gridwidth = 2;
		gbc_listCiudades.insets = new Insets(0, 0, 5, 5);
		gbc_listCiudades.fill = GridBagConstraints.BOTH;
		gbc_listCiudades.gridx = 1;
		gbc_listCiudades.gridy = 2;
		add(listCiudades, gbc_listCiudades);
		
		PanelDetalleCircuito panelDetalleCircuito = new PanelDetalleCircuito();
		GridBagConstraints gbc_panelDetalleCircuito = new GridBagConstraints();
		gbc_panelDetalleCircuito.gridwidth = 3;
		gbc_panelDetalleCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_panelDetalleCircuito.fill = GridBagConstraints.BOTH;
		gbc_panelDetalleCircuito.gridx = 6;
		gbc_panelDetalleCircuito.gridy = 2;
		add(panelDetalleCircuito, gbc_panelDetalleCircuito);
		
		JList listCircuitos = new JList();
		GridBagConstraints gbc_listCircuitos = new GridBagConstraints();
		gbc_listCircuitos.gridheight = 3;
		gbc_listCircuitos.gridwidth = 3;
		gbc_listCircuitos.insets = new Insets(0, 0, 5, 5);
		gbc_listCircuitos.fill = GridBagConstraints.BOTH;
		gbc_listCircuitos.gridx = 6;
		gbc_listCircuitos.gridy = 4;
		add(listCircuitos, gbc_listCircuitos);


	}

}
