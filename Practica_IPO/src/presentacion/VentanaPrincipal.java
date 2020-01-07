package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Usuario;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAyuda;
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
	private  JLabel lblNombre;
	private static JLabel lblFoto;
	private static JLabel lblUsuario;
	private JLabel lblAcceso;
	private static JLabel lblFechaHora;
	private JButton btnCerrarSesión;
	private JMenu mnInstrucciones;
	private JMenuItem mntmGeneral;
	private JMenuItem mntmCircuitos;
	private JMenuItem mntmListado;
	private JMenuItem mntmGuias;
	private JMenuItem mntmPromociones;
	private JMenuItem mntmDiseño;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/presentacion/map.png"))); //$NON-NLS-1$
		setMinimumSize(new Dimension(1280, 720));
		setTitle(Messages.getString("VentanaPrincipal.1")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		setJMenuBar(menuBar);
		
		mnAyuda = new JMenu(""); //$NON-NLS-1$
		mnAyuda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/question.png"))); //$NON-NLS-1$
		menuBar.add(mnAyuda);
		
		mnInstrucciones = new JMenu(Messages.getString("VentanaPrincipal.4")); //$NON-NLS-1$
		mnAyuda.add(mnInstrucciones);
		
		mntmGeneral = new JMenuItem(Messages.getString("VentanaPrincipal.5")); //$NON-NLS-1$
		mntmGeneral.addActionListener(new InfoGeneralActionListener());
		mnInstrucciones.add(mntmGeneral);
		
		mntmCircuitos = new JMenuItem(Messages.getString("VentanaPrincipal.6")); //$NON-NLS-1$
		mntmCircuitos.addActionListener(new CircuitoActionListener());
		mnInstrucciones.add(mntmCircuitos);
		
		mntmListado = new JMenuItem(Messages.getString("VentanaPrincipal.7")); //$NON-NLS-1$
		mntmListado.addActionListener(new ListadoActionListener());
		mnInstrucciones.add(mntmListado);
		
		mntmGuias = new JMenuItem(Messages.getString("VentanaPrincipal.8")); //$NON-NLS-1$
		mntmGuias.addActionListener(new GuiasActionListener());
		mnInstrucciones.add(mntmGuias);
		
		mntmPromociones = new JMenuItem(Messages.getString("VentanaPrincipal.9")); //$NON-NLS-1$
		mntmPromociones.addActionListener(new PromocionesActionListener());
		mnInstrucciones.add(mntmPromociones);
		
		mntmDiseño = new JMenuItem(Messages.getString("VentanaPrincipal.10")); //$NON-NLS-1$
		mntmDiseño.addActionListener(new MapaRutaActionListener());
		mnInstrucciones.add(mntmDiseño);
		
		separator = new JSeparator();
		mnAyuda.add(separator);
		
		mntmAcercaDe = new JMenuItem(Messages.getString("VentanaPrincipal.11")); //$NON-NLS-1$
		mntmAcercaDe.addActionListener(new AyudaActionListener());
		mnAyuda.add(mntmAcercaDe);
		
		mnConfig = new JMenu(""); //$NON-NLS-1$
		mnConfig.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/setting.png"))); //$NON-NLS-1$
		menuBar.add(mnConfig);
		
		mnFuente = new JMenu(Messages.getString("VentanaPrincipal.14")); //$NON-NLS-1$
		mnConfig.add(mnFuente);
		
		checkBoxMenuItem = new JCheckBoxMenuItem(Messages.getString("VentanaPrincipal.15")); //$NON-NLS-1$
		mnFuente.add(checkBoxMenuItem);
		
		checkBoxMenuItem_1 = new JCheckBoxMenuItem(Messages.getString("VentanaPrincipal.16")); //$NON-NLS-1$
		mnFuente.add(checkBoxMenuItem_1);
		
		separator_1 = new JSeparator();
		mnConfig.add(separator_1);
		
		mnTamaño = new JMenu(Messages.getString("VentanaPrincipal.17")); //$NON-NLS-1$
		mnConfig.add(mnTamaño);
		
		checkBoxMenuItem_2 = new JCheckBoxMenuItem(Messages.getString("VentanaPrincipal.18")); //$NON-NLS-1$
		mnTamaño.add(checkBoxMenuItem_2);
		
		checkBoxMenuItem_3 = new JCheckBoxMenuItem(Messages.getString("VentanaPrincipal.19")); //$NON-NLS-1$
		mnTamaño.add(checkBoxMenuItem_3);
		
		checkBoxMenuItem_4 = new JCheckBoxMenuItem(Messages.getString("VentanaPrincipal.20")); //$NON-NLS-1$
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
		
		lblNombre = new JLabel(Messages.getString("VentanaPrincipal.21")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 0;
		panel.add(lblNombre, gbc_lblNombre);
		
		lblFoto = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.anchor = GridBagConstraints.SOUTH;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.gridx = 3;
		gbc_lblFoto.gridy = 0;
		panel.add(lblFoto, gbc_lblFoto);
		
		lblUsuario = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		lblAcceso = new JLabel(Messages.getString("VentanaPrincipal.24")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAcceso = new GridBagConstraints();
		gbc_lblAcceso.anchor = GridBagConstraints.WEST;
		gbc_lblAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblAcceso.gridx = 2;
		gbc_lblAcceso.gridy = 2;
		panel.add(lblAcceso, gbc_lblAcceso);
		
		lblFechaHora = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblFechaHora = new GridBagConstraints();
		gbc_lblFechaHora.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblFechaHora.insets = new Insets(0, 0, 0, 5);
		gbc_lblFechaHora.gridx = 2;
		gbc_lblFechaHora.gridy = 3;
		panel.add(lblFechaHora, gbc_lblFechaHora);
		
		btnCerrarSesión = new JButton(Messages.getString("VentanaPrincipal.26")); //$NON-NLS-1$
		btnCerrarSesión.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/logout.png"))); //$NON-NLS-1$
		btnCerrarSesión.setBackground(new Color(204, 204, 255));
		btnCerrarSesión.addActionListener(new BtnCerrarSesiónActionListener());
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
		tabbedPane.addTab(Messages.getString("VentanaPrincipal.28"), null, Circuitos, null); //$NON-NLS-1$
		
		ListadoCircuitos = new ListadoCircuitos();
		tabbedPane.addTab(Messages.getString("VentanaPrincipal.29"), null, ListadoCircuitos, null); //$NON-NLS-1$
		
		GuiasTuriscos = new GuiasTuristicos();
		tabbedPane.addTab(Messages.getString("VentanaPrincipal.30"), null, GuiasTuriscos, null); //$NON-NLS-1$
		
		Promociones = new Promociones();
		tabbedPane.addTab(Messages.getString("VentanaPrincipal.31"), null, Promociones, null); //$NON-NLS-1$
		
		DiseñarRuta = new DisenoRuta(this);
		tabbedPane.addTab(Messages.getString("VentanaPrincipal.32"), null, DiseñarRuta, null); //$NON-NLS-1$
	}

	private class BtnCerrarSesiónActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFrame frame=Login.getFrmLogin();
			frame.setVisible(true);
			setVisible(false);
		}
	}
	
	private class InfoGeneralActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.33")); //$NON-NLS-1$
		}
	}
	
	private class CircuitoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.34")); //$NON-NLS-1$
		}
	}
	
	private class ListadoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.35")); //$NON-NLS-1$
		}
	}
	
	private class GuiasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.36")); //$NON-NLS-1$
		}
	}
	
	private class PromocionesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.37")); //$NON-NLS-1$
		}
	}
	
	private class MapaRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.38")); //$NON-NLS-1$
		}
	}
	
	private class AyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,Messages.getString("VentanaPrincipal.39")); //$NON-NLS-1$
		}
	}

	
	public static String getPersonal() {
		return lblUsuario.getText();
	}
	public static void setPersonal(String nombre) {
		lblUsuario.setText(nombre);
	}
	public static void setFoto(URL ruta) {
		lblFoto.setIcon(new ImageIcon(ruta));
	}
	public static void setConexion(String conexion) {
		lblFechaHora.setText(conexion);
	}
		
}
