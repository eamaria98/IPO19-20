package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Rectangle;

public class Reserva extends JPanel {
	private JTextField txtDescripcion;
	private JTextField txtTipologia;
	private JTextField txtIntereses;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtFecha;
	private JTextField txtTelefono;
	private JTextField txtCorreo;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel pnlGrupo = new JPanel();
		pnlGrupo.setBorder(new TitledBorder(null, "Informacion grupo turistas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnlGrupo);
		GridBagLayout gbl_pnlGrupo = new GridBagLayout();
		gbl_pnlGrupo.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_pnlGrupo.rowHeights = new int[]{0, 40, 40, 40, 40, 40, 0, 0, 0};
		gbl_pnlGrupo.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlGrupo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlGrupo.setLayout(gbl_pnlGrupo);
		
		JLabel lblDescripcionDelGrupo = new JLabel("Descripci\u00F3n del grupo:");
		GridBagConstraints gbc_lblDescripcionDelGrupo = new GridBagConstraints();
		gbc_lblDescripcionDelGrupo.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcionDelGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionDelGrupo.gridx = 1;
		gbc_lblDescripcionDelGrupo.gridy = 1;
		pnlGrupo.add(lblDescripcionDelGrupo, gbc_lblDescripcionDelGrupo);
		
		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.anchor = GridBagConstraints.NORTH;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 1;
		pnlGrupo.add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblNumeroDeIntegrantes = new JLabel("N\u00FAmero de integrantes");
		GridBagConstraints gbc_lblNumeroDeIntegrantes = new GridBagConstraints();
		gbc_lblNumeroDeIntegrantes.anchor = GridBagConstraints.WEST;
		gbc_lblNumeroDeIntegrantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDeIntegrantes.gridx = 1;
		gbc_lblNumeroDeIntegrantes.gridy = 2;
		pnlGrupo.add(lblNumeroDeIntegrantes, gbc_lblNumeroDeIntegrantes);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		pnlGrupo.add(comboBox, gbc_comboBox);
		
		JLabel lblTipologia = new JLabel("Tipolog\u00EDa:");
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.WEST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 1;
		gbc_lblTipologia.gridy = 3;
		pnlGrupo.add(lblTipologia, gbc_lblTipologia);
		
		txtTipologia = new JTextField();
		GridBagConstraints gbc_txtTipologia = new GridBagConstraints();
		gbc_txtTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipologia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipologia.gridx = 2;
		gbc_txtTipologia.gridy = 3;
		pnlGrupo.add(txtTipologia, gbc_txtTipologia);
		txtTipologia.setColumns(10);
		
		JLabel lblIntereses = new JLabel("Intereses:");
		GridBagConstraints gbc_lblIntereses = new GridBagConstraints();
		gbc_lblIntereses.anchor = GridBagConstraints.WEST;
		gbc_lblIntereses.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntereses.gridx = 1;
		gbc_lblIntereses.gridy = 4;
		pnlGrupo.add(lblIntereses, gbc_lblIntereses);
		
		txtIntereses = new JTextField();
		GridBagConstraints gbc_txtIntereses = new GridBagConstraints();
		gbc_txtIntereses.insets = new Insets(0, 0, 5, 5);
		gbc_txtIntereses.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIntereses.gridx = 2;
		gbc_txtIntereses.gridy = 4;
		pnlGrupo.add(txtIntereses, gbc_txtIntereses);
		txtIntereses.setColumns(10);
		
		JLabel lblRestricciones = new JLabel("Restricciones:");
		GridBagConstraints gbc_lblRestricciones = new GridBagConstraints();
		gbc_lblRestricciones.anchor = GridBagConstraints.WEST;
		gbc_lblRestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblRestricciones.gridx = 1;
		gbc_lblRestricciones.gridy = 5;
		pnlGrupo.add(lblRestricciones, gbc_lblRestricciones);
		
		JTextPane txtRestricciones = new JTextPane();
		GridBagConstraints gbc_txtRestricciones = new GridBagConstraints();
		gbc_txtRestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_txtRestricciones.fill = GridBagConstraints.BOTH;
		gbc_txtRestricciones.gridx = 2;
		gbc_txtRestricciones.gridy = 6;
		pnlGrupo.add(txtRestricciones, gbc_txtRestricciones);
		
		JPanel pnlLista = new JPanel();
		add(pnlLista);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{28, 0, 0, 120, 0, 0};
		gbl_pnlLista.rowHeights = new int[]{50, 0, 0, 0, 0, 0};
		gbl_pnlLista.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlLista.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel pnlTuristas = new JPanel();
		pnlTuristas.setBorder(new TitledBorder(null, "Informacion turistas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnlTuristas);
		GridBagLayout gbl_pnlTuristas = new GridBagLayout();
		gbl_pnlTuristas.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlTuristas.rowHeights = new int[]{0, 120, 120, 40, 40, 40, 40, 40, 40, 0, 0};
		gbl_pnlTuristas.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlTuristas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlTuristas.setLayout(gbl_pnlTuristas);
		
		JLabel lblFoto = new JLabel("FOTO");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.WEST;
		gbc_lblFoto.gridwidth = 3;
		gbc_lblFoto.gridheight = 2;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 1;
		gbc_lblFoto.gridy = 1;
		pnlTuristas.add(lblFoto, gbc_lblFoto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		pnlTuristas.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 3;
		pnlTuristas.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 4;
		pnlTuristas.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 3;
		gbc_txtApellidos.gridy = 4;
		pnlTuristas.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		GridBagConstraints gbc_lblFechaDeNacimiento = new GridBagConstraints();
		gbc_lblFechaDeNacimiento.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeNacimiento.gridx = 1;
		gbc_lblFechaDeNacimiento.gridy = 5;
		pnlTuristas.add(lblFechaDeNacimiento, gbc_lblFechaDeNacimiento);
		
		txtFecha = new JTextField();
		GridBagConstraints gbc_txtFecha = new GridBagConstraints();
		gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFecha.gridx = 3;
		gbc_txtFecha.gridy = 5;
		pnlTuristas.add(txtFecha, gbc_txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 6;
		pnlTuristas.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 3;
		gbc_txtTelefono.gridy = 6;
		pnlTuristas.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico:");
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.anchor = GridBagConstraints.WEST;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 1;
		gbc_lblCorreoElectrnico.gridy = 7;
		pnlTuristas.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		
		txtCorreo = new JTextField();
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridx = 3;
		gbc_txtCorreo.gridy = 7;
		pnlTuristas.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 3;
		gbc_btnGuardar.gridy = 9;
		pnlTuristas.add(btnGuardar, gbc_btnGuardar);

	}

}
