package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class CircuitosAmpli extends JPanel {
	private JTextField txtCiudad;
	private JTextField txtMonumento;
	private JTextField txtEntrada;
	private JTextField txtHorarioVisita;
	private JTextField txtDuracion;
	private JTextField txtTipologia;

	/**
	 * Create the panel.
	 */
	public CircuitosAmpli() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{25, 85, 85, 85, 0, 0};
		gbl_pnlLista.rowHeights = new int[]{25, 275, 10, 23, 30, 0};
		gbl_pnlLista.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlLista.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/recycle-bin-filled-tool.png")));
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 1;
		gbc_btnBorrar.gridy = 3;
		pnlLista.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/refresh-button.png")));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 3;
		pnlLista.add(btnModificar, gbc_btnModificar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setIcon(new ImageIcon(CircuitosAmpli.class.getResource("/presentacion/plus.png")));
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 3;
		gbc_btnReservar.gridy = 3;
		pnlLista.add(btnReservar, gbc_btnReservar);
		
		JPanel pnlDatos = new JPanel();
		add(pnlDatos, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDatos = new GridBagLayout();
		gbl_pnlDatos.columnWidths = new int[]{50, 0, 100, 100, 0, 40, 0, 0, 30, 0, 0};
		gbl_pnlDatos.rowHeights = new int[]{45, 40, 40, 40, 40, 40, 40, 40, 0, 45, 0};
		gbl_pnlDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlDatos.setLayout(gbl_pnlDatos);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 1;
		pnlDatos.add(lblCiudad, gbc_lblCiudad);
		
		txtCiudad = new JTextField();
		GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
		gbc_txtCiudad.gridwidth = 2;
		gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiudad.gridx = 2;
		gbc_txtCiudad.gridy = 1;
		pnlDatos.add(txtCiudad, gbc_txtCiudad);
		txtCiudad.setColumns(10);
		
		JButton btnNewButton = new JButton("FOTO");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.gridheight = 7;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 1;
		pnlDatos.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblMonumento = new JLabel("Monumento:");
		GridBagConstraints gbc_lblMonumento = new GridBagConstraints();
		gbc_lblMonumento.anchor = GridBagConstraints.WEST;
		gbc_lblMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonumento.gridx = 1;
		gbc_lblMonumento.gridy = 2;
		pnlDatos.add(lblMonumento, gbc_lblMonumento);
		
		txtMonumento = new JTextField();
		GridBagConstraints gbc_txtMonumento = new GridBagConstraints();
		gbc_txtMonumento.gridwidth = 2;
		gbc_txtMonumento.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonumento.gridx = 2;
		gbc_txtMonumento.gridy = 2;
		pnlDatos.add(txtMonumento, gbc_txtMonumento);
		txtMonumento.setColumns(10);
		
		JLabel lblEntrada = new JLabel("Entrada:");
		GridBagConstraints gbc_lblEntrada = new GridBagConstraints();
		gbc_lblEntrada.anchor = GridBagConstraints.WEST;
		gbc_lblEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblEntrada.gridx = 1;
		gbc_lblEntrada.gridy = 3;
		pnlDatos.add(lblEntrada, gbc_lblEntrada);
		
		txtEntrada = new JTextField();
		GridBagConstraints gbc_txtEntrada = new GridBagConstraints();
		gbc_txtEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_txtEntrada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEntrada.gridx = 2;
		gbc_txtEntrada.gridy = 3;
		pnlDatos.add(txtEntrada, gbc_txtEntrada);
		txtEntrada.setColumns(10);
		
		JLabel lblHorarioVisita = new JLabel("Horario visita:");
		GridBagConstraints gbc_lblHorarioVisita = new GridBagConstraints();
		gbc_lblHorarioVisita.anchor = GridBagConstraints.WEST;
		gbc_lblHorarioVisita.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorarioVisita.gridx = 1;
		gbc_lblHorarioVisita.gridy = 4;
		pnlDatos.add(lblHorarioVisita, gbc_lblHorarioVisita);
		
		txtHorarioVisita = new JTextField();
		GridBagConstraints gbc_txtHorarioVisita = new GridBagConstraints();
		gbc_txtHorarioVisita.gridwidth = 2;
		gbc_txtHorarioVisita.insets = new Insets(0, 0, 5, 5);
		gbc_txtHorarioVisita.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHorarioVisita.gridx = 2;
		gbc_txtHorarioVisita.gridy = 4;
		pnlDatos.add(txtHorarioVisita, gbc_txtHorarioVisita);
		txtHorarioVisita.setColumns(10);
		
		JLabel lblDuracionVisita = new JLabel("Duracion visita:");
		GridBagConstraints gbc_lblDuracionVisita = new GridBagConstraints();
		gbc_lblDuracionVisita.anchor = GridBagConstraints.WEST;
		gbc_lblDuracionVisita.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracionVisita.gridx = 1;
		gbc_lblDuracionVisita.gridy = 5;
		pnlDatos.add(lblDuracionVisita, gbc_lblDuracionVisita);
		
		txtDuracion = new JTextField();
		GridBagConstraints gbc_txtDuracion = new GridBagConstraints();
		gbc_txtDuracion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDuracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDuracion.gridx = 2;
		gbc_txtDuracion.gridy = 5;
		pnlDatos.add(txtDuracion, gbc_txtDuracion);
		txtDuracion.setColumns(10);
		
		JLabel lblTipologia = new JLabel("Tipologia:");
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.WEST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 1;
		gbc_lblTipologia.gridy = 6;
		pnlDatos.add(lblTipologia, gbc_lblTipologia);
		
		txtTipologia = new JTextField();
		GridBagConstraints gbc_txtTipologia = new GridBagConstraints();
		gbc_txtTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipologia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipologia.gridx = 2;
		gbc_txtTipologia.gridy = 6;
		pnlDatos.add(txtTipologia, gbc_txtTipologia);
		txtTipologia.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 7;
		pnlDatos.add(lblDescripcion, gbc_lblDescripcion);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridwidth = 3;
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 2;
		gbc_textPane.gridy = 8;
		pnlDatos.add(textPane, gbc_textPane);

	}

}
