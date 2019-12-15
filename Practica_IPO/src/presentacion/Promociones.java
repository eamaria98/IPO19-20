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
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Promociones extends JPanel {
	private JTextField textBusqueda;
	//VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
	/**
	 * Create the panel.
	 */
	public Promociones() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNort = new JPanel();
		add(pnlNort, BorderLayout.NORTH);
		GridBagLayout gbl_pnlNort = new GridBagLayout();
		gbl_pnlNort.columnWidths = new int[]{0, 0, 0, 179, 0, 0, 0, 0, 0};
		gbl_pnlNort.rowHeights = new int[]{20, 40, 20, 0};
		gbl_pnlNort.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlNort.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlNort.setLayout(gbl_pnlNort);
		
		JButton btnFiltrar = new JButton("Filtrar busqueda");
		btnFiltrar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/binoculars.png")));
		GridBagConstraints gbc_btnFiltrar = new GridBagConstraints();
		gbc_btnFiltrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnFiltrar.gridx = 1;
		gbc_btnFiltrar.gridy = 1;
		pnlNort.add(btnFiltrar, gbc_btnFiltrar);
		
		JButton btnSeleccionar = new JButton("Seleccionar todo");
		btnSeleccionar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/select.png")));
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeleccionar.gridx = 2;
		gbc_btnSeleccionar.gridy = 1;
		pnlNort.add(btnSeleccionar, gbc_btnSeleccionar);
		
		textBusqueda = new JTextField();
		textBusqueda.setText("Buscar Promocion");
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
		gbl_pnlCenter.columnWidths = new int[] {117, 133, 40, 40, 295};
		gbl_pnlCenter.rowHeights = new int[] {0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		PanelPromocion panelPromocion_1 = new PanelPromocion();
		GridBagLayout gbl_panelPromocion_1 = (GridBagLayout) panelPromocion_1.getLayout();
		gbl_panelPromocion_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panelPromocion_1.rowHeights = new int[]{20, 20, 20, 20, 0};
		gbl_panelPromocion_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panelPromocion_1.columnWidths = new int[]{20, 30, 20, 80, 30};
		GridBagConstraints gbc_panelPromocion_1 = new GridBagConstraints();
		gbc_panelPromocion_1.anchor = GridBagConstraints.EAST;
		gbc_panelPromocion_1.gridwidth = 2;
		gbc_panelPromocion_1.insets = new Insets(0, 0, 5, 5);
		gbc_panelPromocion_1.fill = GridBagConstraints.VERTICAL;
		gbc_panelPromocion_1.gridx = 0;
		gbc_panelPromocion_1.gridy = 1;
		pnlCenter.add(panelPromocion_1, gbc_panelPromocion_1);
		
		PanelPromocion panelPromocion = new PanelPromocion();
		GridBagLayout gridBagLayout_1 = (GridBagLayout) panelPromocion.getLayout();
		gridBagLayout_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout_1.rowHeights = new int[]{20, 20, 20, 20, 0};
		gridBagLayout_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout_1.columnWidths = new int[]{20, 30, 20, 80, 30};
		GridBagConstraints gbc_panelPromocion = new GridBagConstraints();
		gbc_panelPromocion.anchor = GridBagConstraints.WEST;
		gbc_panelPromocion.gridwidth = 2;
		gbc_panelPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_panelPromocion.fill = GridBagConstraints.VERTICAL;
		gbc_panelPromocion.gridx = 2;
		gbc_panelPromocion.gridy = 1;
		pnlCenter.add(panelPromocion, gbc_panelPromocion);
		
		PanelNuevaPromocion panelPromocion_4 = new PanelNuevaPromocion();
		panelPromocion_4.setToolTipText("");
		GridBagLayout gridBagLayout_3 = (GridBagLayout) panelPromocion_4.getLayout();
		gridBagLayout_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout_3.rowHeights = new int[]{20, 20, 20, 20, 0};
		gridBagLayout_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout_3.columnWidths = new int[]{20, 30, 20, 80, 30};
		GridBagConstraints gbc_panelPromocion_4 = new GridBagConstraints();
		gbc_panelPromocion_4.gridheight = 2;
		gbc_panelPromocion_4.insets = new Insets(0, 0, 5, 0);
		gbc_panelPromocion_4.fill = GridBagConstraints.BOTH;
		gbc_panelPromocion_4.gridx = 4;
		gbc_panelPromocion_4.gridy = 1;
		pnlCenter.add(panelPromocion_4, gbc_panelPromocion_4);
		
		PanelPromocion panelPromocion_2 = new PanelPromocion();
		GridBagLayout gridBagLayout = (GridBagLayout) panelPromocion_2.getLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowHeights = new int[]{20, 20, 20, 20, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.columnWidths = new int[]{20, 30, 20, 80, 30};
		GridBagConstraints gbc_panelPromocion_2 = new GridBagConstraints();
		gbc_panelPromocion_2.anchor = GridBagConstraints.EAST;
		gbc_panelPromocion_2.gridwidth = 2;
		gbc_panelPromocion_2.insets = new Insets(0, 0, 5, 5);
		gbc_panelPromocion_2.fill = GridBagConstraints.VERTICAL;
		gbc_panelPromocion_2.gridx = 0;
		gbc_panelPromocion_2.gridy = 2;
		pnlCenter.add(panelPromocion_2, gbc_panelPromocion_2);
		
		PanelPromocion panelPromocion_3 = new PanelPromocion();
		GridBagLayout gridBagLayout_2 = (GridBagLayout) panelPromocion_3.getLayout();
		gridBagLayout_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout_2.rowHeights = new int[]{20, 20, 20, 20, 0};
		gridBagLayout_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout_2.columnWidths = new int[]{20, 30, 20, 80, 30};
		GridBagConstraints gbc_panelPromocion_3 = new GridBagConstraints();
		gbc_panelPromocion_3.anchor = GridBagConstraints.WEST;
		gbc_panelPromocion_3.gridwidth = 2;
		gbc_panelPromocion_3.insets = new Insets(0, 0, 5, 5);
		gbc_panelPromocion_3.fill = GridBagConstraints.VERTICAL;
		gbc_panelPromocion_3.gridx = 2;
		gbc_panelPromocion_3.gridy = 2;
		pnlCenter.add(panelPromocion_3, gbc_panelPromocion_3);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/recycle-bin-filled-tool.png")));
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.anchor = GridBagConstraints.EAST;
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 0;
		gbc_btnBorrar.gridy = 3;
		pnlCenter.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/refresh-button.png")));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 0, 5);
		gbc_btnModificar.gridx = 1;
		gbc_btnModificar.gridy = 3;
		pnlCenter.add(btnModificar, gbc_btnModificar);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setIcon(new ImageIcon(Promociones.class.getResource("/presentacion/plus.png")));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.anchor = GridBagConstraints.WEST;
		gbc_btnAadir.insets = new Insets(0, 0, 0, 5);
		gbc_btnAadir.gridx = 2;
		gbc_btnAadir.gridy = 3;
		pnlCenter.add(btnAadir, gbc_btnAadir);

	}
}
