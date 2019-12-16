package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAyuda;
	private JMenuItem mntmIntrucciones;
	private JSeparator separator;
	private JMenuItem mntmAcercaDe;
	private JMenu mnConfig;
	private JMenu mnFuente;
	private JCheckBoxMenuItem checkBoxMenuItem;
	private JCheckBoxMenuItem checkBoxMenuItem_1;
	private JSeparator separator_1;
	private JMenu mnTamaño;
	private JCheckBoxMenuItem checkBoxMenuItem_2;
	private JCheckBoxMenuItem checkBoxMenuItem_3;
	private JCheckBoxMenuItem checkBoxMenuItem_4;
	private JPanel panel;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel Circuitos;
	private JPanel ListadoCircuitos;
	private JPanel GuiasTuriscos;
	private JPanel Promociones;
	private JPanel DiseñarRuta;
	private JComboBox comboBox;
	private JLabel lblNombre;
	private JLabel lblFoto;
	private JLabel lblUsuario;
	private JLabel lblAcceso;
	private JLabel lblFechaHora;
	private JButton btnCerrarSesión;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/presentacion/icon maps.png")));
		setMinimumSize(new Dimension(1280, 720));
		setTitle("Circuitos Turisticos Ciudad Real ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		setJMenuBar(menuBar);
		
		mnAyuda = new JMenu("");
		mnAyuda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/question.png")));
		menuBar.add(mnAyuda);
		
		mntmIntrucciones = new JMenuItem("Instrucciones");
		mnAyuda.add(mntmIntrucciones);
		
		separator = new JSeparator();
		mnAyuda.add(separator);
		
		mntmAcercaDe = new JMenuItem("Acerca de");
		mnAyuda.add(mntmAcercaDe);
		
		mnConfig = new JMenu("");
		mnConfig.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/setting.png")));
		menuBar.add(mnConfig);
		
		mnFuente = new JMenu("Tipo fuente");
		mnConfig.add(mnFuente);
		
		checkBoxMenuItem = new JCheckBoxMenuItem("Arial");
		mnFuente.add(checkBoxMenuItem);
		
		checkBoxMenuItem_1 = new JCheckBoxMenuItem("Times New Roman");
		mnFuente.add(checkBoxMenuItem_1);
		
		separator_1 = new JSeparator();
		mnConfig.add(separator_1);
		
		mnTamaño = new JMenu("Tama\u00F1o fuente");
		mnConfig.add(mnTamaño);
		
		checkBoxMenuItem_2 = new JCheckBoxMenuItem("Grande");
		mnTamaño.add(checkBoxMenuItem_2);
		
		checkBoxMenuItem_3 = new JCheckBoxMenuItem("Mediano");
		mnTamaño.add(checkBoxMenuItem_3);
		
		checkBoxMenuItem_4 = new JCheckBoxMenuItem("Peque\u00F1o");
		mnTamaño.add(checkBoxMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{97, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{10, 30, 30, 10, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "English"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.SOUTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 0;
		panel.add(comboBox, gbc_comboBox);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 0;
		panel.add(lblNombre, gbc_lblNombre);
		
		lblFoto = new JLabel("FOTO");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.SOUTH;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.gridx = 3;
		gbc_lblFoto.gridy = 0;
		panel.add(lblFoto, gbc_lblFoto);
		
		lblUsuario = new JLabel("Adri\u00E1n Lara Sanchez");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		lblAcceso = new JLabel("Fecha y hora del \u00FAltimo acceso:");
		GridBagConstraints gbc_lblAcceso = new GridBagConstraints();
		gbc_lblAcceso.anchor = GridBagConstraints.WEST;
		gbc_lblAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblAcceso.gridx = 2;
		gbc_lblAcceso.gridy = 2;
		panel.add(lblAcceso, gbc_lblAcceso);
		
		lblFechaHora = new JLabel("4/11/2019    0:31");
		GridBagConstraints gbc_lblFechaHora = new GridBagConstraints();
		gbc_lblFechaHora.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblFechaHora.insets = new Insets(0, 0, 0, 5);
		gbc_lblFechaHora.gridx = 2;
		gbc_lblFechaHora.gridy = 3;
		panel.add(lblFechaHora, gbc_lblFechaHora);
		
		btnCerrarSesión = new JButton("Cerrar Sesi\u00F3n");
		GridBagConstraints gbc_btnCerrarSesión = new GridBagConstraints();
		gbc_btnCerrarSesión.anchor = GridBagConstraints.NORTH;
		gbc_btnCerrarSesión.gridx = 3;
		gbc_btnCerrarSesión.gridy = 3;
		panel.add(btnCerrarSesión, gbc_btnCerrarSesión);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		Circuitos = new PestañaCircuito();
		tabbedPane.addTab("Circuitos", null, Circuitos, null);
		
		ListadoCircuitos = new ListadoCircuitos();
		tabbedPane.addTab("Listado Circuitos", null, ListadoCircuitos, null);
		
		GuiasTuriscos = new GuiasTuristicos();
		tabbedPane.addTab("Guias tur\u00EDsticos", null, GuiasTuriscos, null);
		
		Promociones = new Promociones();
		tabbedPane.addTab("Promociones", null, Promociones, null);
		
		DiseñarRuta = new DisenoRuta();
		tabbedPane.addTab("Dise\u00F1ar Ruta", null, DiseñarRuta, null);
	}

	/*public JPanel getCircuitos() {
		return Circuitos;
	}

	public void setCircuitos(JPanel circuitos) {
		Circuitos= new Reserva();
	}*/
}
