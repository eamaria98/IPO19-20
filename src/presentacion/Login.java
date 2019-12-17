package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.ComponentOrientation;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Toolkit;

public class Login {

	private JFrame frmLogin;
	private JPanel panel;
	private JLabel lblUsuario;
	private JTextField textUsuario;
	private JLabel lblContraseña;
	private JTextField textContraseña;
	private JLabel lblIconLock;
	private JLabel lblIconUser;
	private JCheckBox chckbxRecuerdame;
	private JButton btnEntrar;
	private JMenuBar menuBar;
	private JMenu mnAyuda;
	private JMenu mnConfig;
	private JMenuItem mntmInstrucciones;
	private JSeparator separator;
	private JMenuItem mntmAcercaDe;
	private JSeparator separator_1;
	private JMenu mnFuente;
	private JMenu mnTamaño;
	private JCheckBoxMenuItem chckbxmntmArial;
	private JCheckBoxMenuItem chckbxmntmTimesNewRoman;
	private JCheckBoxMenuItem chckbxmntmGrande;
	private JCheckBoxMenuItem chckbxmntmPequeño;
	private final ButtonGroup buttonGroup = new ButtonGroup(); 
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private JLabel lblAviso;
	private JCheckBoxMenuItem chckbxmntmMediano;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/presentacion/icon maps.png")));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frmLogin.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 24, 0, 92, 69, 85, 35, 0};
		gbl_panel.rowHeights = new int[]{40, 0, 10, 25, 0, 6, 10, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblIconUser = new JLabel("");
		lblIconUser.setIcon(new ImageIcon(Login.class.getResource("/presentacion/icon user.png")));
		GridBagConstraints gbc_lblIconUser = new GridBagConstraints();
		gbc_lblIconUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconUser.gridx = 1;
		gbc_lblIconUser.gridy = 1;
		panel.add(lblIconUser, gbc_lblIconUser);
		
		lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Activamos los campos de la contraseña
				textContraseña.setEnabled(true);
				lblContraseña.setEnabled(true);
				//Pasamos el cursos al campo de la contraseña 
				textContraseña.requestFocus();
			}
		});
		GridBagConstraints gbc_textUsuario = new GridBagConstraints();
		gbc_textUsuario.fill = GridBagConstraints.BOTH;
		gbc_textUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_textUsuario.gridx = 3;
		gbc_textUsuario.gridy = 1;
		panel.add(textUsuario, gbc_textUsuario);
		textUsuario.setColumns(10);
		
		lblIconLock = new JLabel("");
		lblIconLock.setIcon(new ImageIcon(Login.class.getResource("/presentacion/icon lock (1).png")));
		GridBagConstraints gbc_lblIconLock = new GridBagConstraints();
		gbc_lblIconLock.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconLock.gridx = 1;
		gbc_lblIconLock.gridy = 3;
		panel.add(lblIconLock, gbc_lblIconLock);
		
		lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setEnabled(false);
		GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
		gbc_lblContraseña.anchor = GridBagConstraints.WEST;
		gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña.gridx = 2;
		gbc_lblContraseña.gridy = 3;
		panel.add(lblContraseña, gbc_lblContraseña);
		
		textContraseña = new JTextField();
		textContraseña.setEnabled(false);
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.gridwidth = 2;
		gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.gridx = 3;
		gbc_textContraseña.gridy = 3;
		panel.add(textContraseña, gbc_textContraseña);
		textContraseña.setColumns(10);
		
		lblAviso = new JLabel("\"  \" ");
		GridBagConstraints gbc_lblAviso = new GridBagConstraints();
		gbc_lblAviso.gridwidth = 2;
		gbc_lblAviso.gridheight = 2;
		gbc_lblAviso.insets = new Insets(0, 0, 5, 5);
		gbc_lblAviso.gridx = 2;
		gbc_lblAviso.gridy = 4;
		panel.add(lblAviso, gbc_lblAviso);
		
		chckbxRecuerdame = new JCheckBox("Recuerdame");
		GridBagConstraints gbc_chckbxRecuerdame = new GridBagConstraints();
		gbc_chckbxRecuerdame.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxRecuerdame.gridx = 5;
		gbc_chckbxRecuerdame.gridy = 4;
		panel.add(chckbxRecuerdame, gbc_chckbxRecuerdame);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
				//Mostrar el usuario con su nombre, su conexion y su foto
				ventanaPrincipal.setVisible(true);
				frmLogin.setVisible(false);
				textUsuario.setText("");
				textContraseña.setText("");
				lblAviso.setText("");
				chckbxRecuerdame.setEnabled(false);
				btnEntrar.setEnabled(false);
			}
		});
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 5;
		gbc_btnEntrar.gridy = 5;
		panel.add(btnEntrar, gbc_btnEntrar);
		
		menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frmLogin.setJMenuBar(menuBar);
		
		mnAyuda = new JMenu("");
		mnAyuda.setIcon(new ImageIcon(Login.class.getResource("/presentacion/question.png")));
		menuBar.add(mnAyuda);
		
		mntmInstrucciones = new JMenuItem("Instrucciones");
		mntmInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Introduzca el nombre del usuario y la contraseña.\nSi desea que se recuerde su usuario marque la casilla recuerdame.\nA continuación, pulse el botón para entrar en la aplicación.");
			}
		});
		mnAyuda.add(mntmInstrucciones);
		
		separator = new JSeparator();
		mnAyuda.add(separator);
		
		mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Aplicación creada por María Espinosa y Andrés Gutiérrez.");
			}
		});
		mnAyuda.add(mntmAcercaDe);
		
		mnConfig = new JMenu("");
		mnConfig.setIcon(new ImageIcon(Login.class.getResource("/presentacion/setting.png")));
		menuBar.add(mnConfig);
		
		mnFuente = new JMenu("Tipo fuente");
		mnConfig.add(mnFuente);
			
		/*Tipo de fuente Arial*/
		chckbxmntmArial = new JCheckBoxMenuItem("Arial");
		chckbxmntmArial.addActionListener(new RdbtnmntmArialActionListener());
		buttonGroup.add(chckbxmntmArial);
		mnFuente.add(chckbxmntmArial);
				
		/*Tipo de fuente Times New Roman*/
		chckbxmntmTimesNewRoman = new JCheckBoxMenuItem("Times New Roman");
		chckbxmntmTimesNewRoman.addActionListener(new RdbtnmntmTimesNewRomanActionListener());
		buttonGroup.add(chckbxmntmTimesNewRoman);
		mnFuente.add(chckbxmntmTimesNewRoman);
		
		separator_1 = new JSeparator();
		mnConfig.add(separator_1);
		
		mnTamaño = new JMenu("Tama\u00F1o fuente");
		mnConfig.add(mnTamaño);
		
		/*Tamaño de la fuente grande*/
		chckbxmntmGrande = new JCheckBoxMenuItem("Grande");
		chckbxmntmGrande.addActionListener(new RdbtGrandeActionListener());
		buttonGroup.add(chckbxmntmGrande);
		mnTamaño.add(chckbxmntmGrande);
		
		/*Tamaño de la fuente mediano*/
		chckbxmntmMediano = new JCheckBoxMenuItem("Mediano");
		chckbxmntmMediano.addActionListener(new RdbtMedianoActionListener());
		buttonGroup.add(chckbxmntmMediano);
		mnTamaño.add(chckbxmntmMediano);
		
		/*Tamaño de la fuente pequeña*/
		chckbxmntmPequeño = new JCheckBoxMenuItem("Peque\u00F1o");
		chckbxmntmPequeño.addActionListener(new RdbtPequeActionListener());
		buttonGroup.add(chckbxmntmPequeño);
		mnTamaño.add(chckbxmntmPequeño);
	}
	
	private class RdbtGrandeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblUsuario.setFont(new Font(null, Font.PLAIN, 16));
			textUsuario.setFont(new Font(null, Font.PLAIN, 16));
			lblContraseña.setFont(new Font(null, Font.PLAIN, 16));
			textContraseña.setFont(new Font(null, Font.PLAIN, 16));
			lblAviso.setFont(new Font(null, Font.PLAIN, 16));
			btnEntrar.setFont(new Font(null, Font.PLAIN, 16));
			chckbxRecuerdame.setFont(new Font(null, Font.PLAIN, 16));
		}
	}
	
	private class RdbtMedianoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblUsuario.setFont(new Font(null, Font.PLAIN, 12));
			textUsuario.setFont(new Font(null, Font.PLAIN, 12));
			lblContraseña.setFont(new Font(null, Font.PLAIN, 12));
			textContraseña.setFont(new Font(null, Font.PLAIN, 12));
			lblAviso.setFont(new Font(null, Font.PLAIN, 12));
			btnEntrar.setFont(new Font(null, Font.PLAIN, 12));
			chckbxRecuerdame.setFont(new Font(null, Font.PLAIN, 12));
		}
	}
	
	private class RdbtPequeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblUsuario.setFont(new Font(null, Font.PLAIN, 10));
			textUsuario.setFont(new Font(null, Font.PLAIN, 10));
			lblContraseña.setFont(new Font(null, Font.PLAIN, 10));
			textContraseña.setFont(new Font(null, Font.PLAIN, 10));
			lblAviso.setFont(new Font(null, Font.PLAIN, 10));
			btnEntrar.setFont(new Font(null, Font.PLAIN, 10));
			chckbxRecuerdame.setFont(new Font(null, Font.PLAIN, 10));
		}
	}
	
	
	private class RdbtnmntmTimesNewRomanActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {	
			lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, lblUsuario.getFont().getSize()));
			textUsuario.setFont(new Font("Times New Roman", Font.PLAIN, textUsuario.getFont().getSize()));
			lblContraseña.setFont(new Font("Times New Roman", Font.PLAIN, lblContraseña.getFont().getSize()));
			textContraseña.setFont(new Font("Times New Roman", Font.PLAIN, textContraseña.getFont().getSize()));
			lblAviso.setFont(new Font("Times New Roman", Font.PLAIN, lblAviso.getFont().getSize()));
			btnEntrar.setFont(new Font("Times New Roman", Font.PLAIN, btnEntrar.getFont().getSize()));
			chckbxRecuerdame.setFont(new Font("Times New Roman", Font.PLAIN, chckbxRecuerdame.getFont().getSize()));
		}
	}
	private class RdbtnmntmArialActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblUsuario.setFont(new Font("Arial", Font.PLAIN, lblUsuario.getFont().getSize()));
			textUsuario.setFont(new Font("Arial", Font.PLAIN, textUsuario.getFont().getSize()));
			lblContraseña.setFont(new Font("Arial", Font.PLAIN, lblContraseña.getFont().getSize()));
			textContraseña.setFont(new Font("Arial", Font.PLAIN, textContraseña.getFont().getSize()));
			lblAviso.setFont(new Font("Arial", Font.PLAIN, lblAviso.getFont().getSize()));
			btnEntrar.setFont(new Font("Arial", Font.PLAIN, btnEntrar.getFont().getSize()));
			chckbxRecuerdame.setFont(new Font("Arial", Font.PLAIN, chckbxRecuerdame.getFont().getSize()));
		}
	}

}
