package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

import dominio.Usuario;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JCheckBoxMenuItem;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class Login {

	private static JFrame frmLogin;
	private JPanel panel;
	private JLabel lblUsuario;
	private JTextField textUsuario;
	private JPasswordField pwdPasswd;
	private JLabel lblContraseña;
	private JLabel lblIconLock;
	private JLabel lblIconUser;
	private JLabel lblAviso;
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
	private JCheckBoxMenuItem chckbxmntmMediano;
	private int usuario;
	private ArrayList<Usuario> listaUsuarios = Usuario.generarUsuario();

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
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/presentacion/map.png")));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frmLogin.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 20, 24, 0, 127, 40, 85, 35, 0 };
		gbl_panel.rowHeights = new int[] { 40, 0, 10, 25, 0, 25, 10, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
				// Activamos los campos de la contraseña
				pwdPasswd.setEnabled(true);
				lblContraseña.setEnabled(true);
				// Pasamos el cursos al campo de la contraseña
				pwdPasswd.requestFocus();
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
		gbc_lblContraseña.anchor = GridBagConstraints.EAST;
		gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña.gridx = 2;
		gbc_lblContraseña.gridy = 3;
		panel.add(lblContraseña, gbc_lblContraseña);

		pwdPasswd = new JPasswordField();
		pwdPasswd.addActionListener(new PwdPasswdActionListener());
		GridBagConstraints gbc_pwdPasswd = new GridBagConstraints();
		gbc_pwdPasswd.insets = new Insets(0, 0, 5, 5);
		gbc_pwdPasswd.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdPasswd.gridx = 3;
		gbc_pwdPasswd.gridy = 3;
		panel.add(pwdPasswd, gbc_pwdPasswd);

		lblAviso = new JLabel("");
		lblAviso.setEnabled(false);
		lblAviso.setOpaque(true);
		GridBagConstraints gbc_lblAviso = new GridBagConstraints();
		gbc_lblAviso.gridwidth = 2;
		gbc_lblAviso.insets = new Insets(0, 0, 5, 5);
		gbc_lblAviso.gridx = 2;
		gbc_lblAviso.gridy = 5;
		panel.add(lblAviso, gbc_lblAviso);

		chckbxRecuerdame = new JCheckBox("Recuerdame");
		GridBagConstraints gbc_chckbxRecuerdame = new GridBagConstraints();
		gbc_chckbxRecuerdame.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxRecuerdame.gridx = 5;
		gbc_chckbxRecuerdame.gridy = 4;
		panel.add(chckbxRecuerdame, gbc_chckbxRecuerdame);

		btnEntrar = new JButton("ENTRAR");
		// btnEntrar.addKeyListener(new BtnEntrarKeyListener());
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setEnabled(false);
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
				JOptionPane.showMessageDialog(null,
						"Introduzca el nombre del usuario y la contraseña.\nSi desea que se recuerde su usuario marque la casilla recuerdame.\nA continuación, pulse el botón para entrar en la aplicación.");
			}
		});
		mnAyuda.add(mntmInstrucciones);

		separator = new JSeparator();
		mnAyuda.add(separator);

		mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Aplicación creada por María Espinosa y Andrés Gutiérrez.");
			}
		});
		mnAyuda.add(mntmAcercaDe);

		mnConfig = new JMenu("");
		mnConfig.setIcon(new ImageIcon(Login.class.getResource("/presentacion/setting.png")));
		menuBar.add(mnConfig);

		mnFuente = new JMenu("Tipo fuente");
		mnConfig.add(mnFuente);

		/* Tipo de fuente Arial */
		chckbxmntmArial = new JCheckBoxMenuItem("Arial");
		chckbxmntmArial.addActionListener(new RdbtnmntmArialActionListener());
		buttonGroup.add(chckbxmntmArial);
		mnFuente.add(chckbxmntmArial);

		/* Tipo de fuente Times New Roman */
		chckbxmntmTimesNewRoman = new JCheckBoxMenuItem("Times New Roman");
		chckbxmntmTimesNewRoman.addActionListener(new RdbtnmntmTimesNewRomanActionListener());
		buttonGroup.add(chckbxmntmTimesNewRoman);
		mnFuente.add(chckbxmntmTimesNewRoman);

		separator_1 = new JSeparator();
		mnConfig.add(separator_1);

		mnTamaño = new JMenu("Tama\u00F1o fuente");
		mnConfig.add(mnTamaño);

		/* Tamaño de la fuente grande */
		chckbxmntmGrande = new JCheckBoxMenuItem("Grande");
		chckbxmntmGrande.addActionListener(new RdbtGrandeActionListener());
		buttonGroup.add(chckbxmntmGrande);
		mnTamaño.add(chckbxmntmGrande);

		/* Tamaño de la fuente mediano */
		chckbxmntmMediano = new JCheckBoxMenuItem("Mediano");
		chckbxmntmMediano.addActionListener(new RdbtMedianoActionListener());
		buttonGroup.add(chckbxmntmMediano);
		mnTamaño.add(chckbxmntmMediano);

		/* Tamaño de la fuente pequeña */
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
			pwdPasswd.setFont(new Font(null, Font.PLAIN, 16));
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
			pwdPasswd.setFont(new Font(null, Font.PLAIN, 12));
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
			pwdPasswd.setFont(new Font(null, Font.PLAIN, 10));
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
			pwdPasswd.setFont(new Font("Times New Roman", Font.PLAIN, pwdPasswd.getFont().getSize()));
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
			pwdPasswd.setFont(new Font("Arial", Font.PLAIN, pwdPasswd.getFont().getSize()));
			lblAviso.setFont(new Font("Arial", Font.PLAIN, lblAviso.getFont().getSize()));
			btnEntrar.setFont(new Font("Arial", Font.PLAIN, btnEntrar.getFont().getSize()));
			chckbxRecuerdame.setFont(new Font("Arial", Font.PLAIN, chckbxRecuerdame.getFont().getSize()));
		}
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(); // Mostrar el usuario con su nombre, su conexion y su foto
			ventanaPrincipal.setPersonal(listaUsuarios.get(usuario).getUsuario());
			ventanaPrincipal.setConexion(listaUsuarios.get(usuario).getConexion());
			ventanaPrincipal.setFoto(listaUsuarios.get(usuario).getFoto());
			ventanaPrincipal.setVisible(true);
			frmLogin.setVisible(false);
			textUsuario.setText("");
			pwdPasswd.setText("");
			lblAviso.setText("");
			chckbxRecuerdame.setEnabled(false);
			btnEntrar.setEnabled(true);
		}

	}

	private class BtnEntrarKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent arg0) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER)
				btnEntrar.doClick();
		}
	}

	private class PwdPasswdActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			usuario();
		}
	}

	private void usuario() {
		int i = 0;
		for (i = 0; i < listaUsuarios.size(); i++) {
			if (String.valueOf(pwdPasswd.getPassword()).equals(listaUsuarios.get(i).getPass())
					& String.valueOf(textUsuario.getText()).equals(listaUsuarios.get(i).getUsuario())) {
				usuario = i;
				i = listaUsuarios.size() + 2;
				lblAviso.setBackground(Color.green);
				lblAviso.setText("Contraseña correcta");
				lblAviso.setVisible(true);
				btnEntrar.setEnabled(true);
				lblContraseña.setEnabled(false);
				pwdPasswd.setEnabled(false);

			}
		}
		if (i != listaUsuarios.size() + 3) {
			lblAviso.setBackground(Color.red);
			lblAviso.setText("Usuario o contraseña incorrecta");
			textUsuario.requestFocus();
			lblAviso.setVisible(true);
			textUsuario.setText("");
			lblContraseña.setEnabled(false);
			pwdPasswd.setEnabled(false);
			pwdPasswd.setText("");
			btnEntrar.setEnabled(false);
		}
	}

	public static JFrame getFrmLogin() {
		return frmLogin;

	}

}
