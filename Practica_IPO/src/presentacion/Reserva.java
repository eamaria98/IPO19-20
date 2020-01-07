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
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dominio.CircuitosList;
import dominio.PromocionesD;
import dominio.Turistas;
import javafx.scene.control.ComboBox;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Reserva extends JPanel {
	private JPanel panel;
	private int opcion = 2;
	private URL foto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textFechaNacimiento;
	private JTextField textCorreo;
	private ArrayList<Turistas> listaTuristas;
	private JList list;
	private JComboBox comboBox;
	private JButton button;
	private JFormattedTextField formattedTextTelefono;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{195, 214, 180, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JPanel panelGrupo = new JPanel();
		panelGrupo.setBorder(new TitledBorder(null, Messages.getString("Reserva.0"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_panelGrupo = new GridBagConstraints();
		gbc_panelGrupo.insets = new Insets(0, 0, 0, 5);
		gbc_panelGrupo.fill = GridBagConstraints.BOTH;
		gbc_panelGrupo.gridx = 0;
		gbc_panelGrupo.gridy = 0;
		add(panelGrupo, gbc_panelGrupo);
		GridBagLayout gbl_panelGrupo = new GridBagLayout();
		gbl_panelGrupo.columnWidths = new int[]{30, 0, 0, 20, 0, 70, 0};
		gbl_panelGrupo.rowHeights = new int[]{0, 40, 40, 40, 40, 40, 170, 0, 0};
		gbl_panelGrupo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelGrupo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelGrupo.setLayout(gbl_panelGrupo);
		
		JLabel label = new JLabel(Messages.getString("Reserva.1")); //$NON-NLS-1$
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panelGrupo.add(label, gbc_label);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panelGrupo.add(textField, gbc_textField);
		
		JLabel label_1 = new JLabel(Messages.getString("Reserva.2")); //$NON-NLS-1$
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		panelGrupo.add(label_1, gbc_label_1);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new comboBoxActionListener());
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$ //$NON-NLS-14$ //$NON-NLS-15$ //$NON-NLS-16$ //$NON-NLS-17$
		comboBox.setSelectedIndex(0);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		panelGrupo.add(comboBox, gbc_comboBox);
		
		JLabel label_2 = new JLabel(Messages.getString("Reserva.20")); //$NON-NLS-1$
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 3;
		panelGrupo.add(label_2, gbc_label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		panelGrupo.add(textField_1, gbc_textField_1);
		
		JLabel label_3 = new JLabel(Messages.getString("Reserva.21")); //$NON-NLS-1$
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 4;
		panelGrupo.add(label_3, gbc_label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		panelGrupo.add(textField_2, gbc_textField_2);
		
		JLabel label_4 = new JLabel(Messages.getString("Reserva.22")); //$NON-NLS-1$
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.WEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 5;
		panelGrupo.add(label_4, gbc_label_4);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridwidth = 4;
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.gridx = 2;
		gbc_textPane.gridy = 6;
		panelGrupo.add(textPane, gbc_textPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		list = new JList();
		list.addListSelectionListener(new ListListSelectionListener());
		panel.add(list);
		
		JPanel panelTurista = new JPanel();
		panelTurista.setBorder(new TitledBorder(null, Messages.getString("Reserva.23"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_panelTurista = new GridBagConstraints();
		gbc_panelTurista.fill = GridBagConstraints.BOTH;
		gbc_panelTurista.gridx = 2;
		gbc_panelTurista.gridy = 0;
		add(panelTurista, gbc_panelTurista);
		GridBagLayout gbl_panelTurista = new GridBagLayout();
		gbl_panelTurista.columnWidths = new int[]{50, 0, 0, 0, 30, 20, 0};
		gbl_panelTurista.rowHeights = new int[]{0, 102, 72, 74, 60, 40, 40, 40, 40, 40, 0, 0, 0};
		gbl_panelTurista.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelTurista.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelTurista.setLayout(gbl_panelTurista);
		
		button = new JButton(""); //$NON-NLS-1$
		button.setIcon(new ImageIcon(Reserva.class.getResource("/presentacion/dslr-camera.png"))); //$NON-NLS-1$
		button.addActionListener(new BtnFotoActionListener());
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.gridheight = 2;
		gbc_button.gridwidth = 3;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 2;
		panelTurista.add(button, gbc_button);
		
		JLabel label_5 = new JLabel(Messages.getString("Reserva.26")); //$NON-NLS-1$
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 5;
		panelTurista.add(label_5, gbc_label_5);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.gridx = 3;
		gbc_textNombre.gridy = 5;
		panelTurista.add(textNombre, gbc_textNombre);
		
		JLabel label_6 = new JLabel(Messages.getString("Reserva.27")); //$NON-NLS-1$
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 6;
		panelTurista.add(label_6, gbc_label_6);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridwidth = 3;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_textApellidos.gridx = 3;
		gbc_textApellidos.gridy = 6;
		panelTurista.add(textApellidos, gbc_textApellidos);
		
		JLabel label_7 = new JLabel(Messages.getString("Reserva.28")); //$NON-NLS-1$
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 7;
		panelTurista.add(label_7, gbc_label_7);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		GridBagConstraints gbc_textFechaNacimiento = new GridBagConstraints();
		gbc_textFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_textFechaNacimiento.gridx = 3;
		gbc_textFechaNacimiento.gridy = 7;
		panelTurista.add(textFechaNacimiento, gbc_textFechaNacimiento);
		
		JLabel label_8 = new JLabel(Messages.getString("Reserva.29")); //$NON-NLS-1$
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 8;
		panelTurista.add(label_8, gbc_label_8);
		
		formattedTextTelefono = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextTelefono = new GridBagConstraints();
		gbc_formattedTextTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextTelefono.gridwidth = 2;
		gbc_formattedTextTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextTelefono.gridx = 3;
		gbc_formattedTextTelefono.gridy = 8;
		panelTurista.add(formattedTextTelefono, gbc_formattedTextTelefono);
		
		JLabel label_9 = new JLabel(Messages.getString("Reserva.30")); //$NON-NLS-1$
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 9;
		panelTurista.add(label_9, gbc_label_9);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		GridBagConstraints gbc_textCorreo = new GridBagConstraints();
		gbc_textCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCorreo.gridwidth = 3;
		gbc_textCorreo.insets = new Insets(0, 0, 5, 0);
		gbc_textCorreo.gridx = 3;
		gbc_textCorreo.gridy = 9;
		panelTurista.add(textCorreo, gbc_textCorreo);
		
		JButton button_1 = new JButton(Messages.getString("Reserva.31")); //$NON-NLS-1$
		button_1.setBackground(new Color(102, 255, 102));
		button_1.addActionListener(new BtnGuardarActionListener());
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 11;
		panelTurista.add(button_1, gbc_button_1);
		
		listaTuristas= listaDefecto();
		crearLista();
			
	}

	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			cargarTuristas(listaTuristas.get(list.getSelectedIndex()));
		}
	}
	
	private void cargarTuristas(Turistas turistas) {
		textNombre.setText(turistas.getNombre());
		textApellidos.setText(turistas.getApellidos());
		textFechaNacimiento.setText(turistas.getFechaNacimiento());
		formattedTextTelefono.setText(turistas.getTelefono());
		textCorreo.setText(turistas.getCorreo());
		button.setIcon(new ImageIcon(turistas.getFoto()));
	}
	
	public ArrayList<Turistas> listaDefecto() {
		ArrayList<Turistas> turistas = new ArrayList<Turistas>();
		for (int i = 4; i <= comboBox.getSelectedIndex()+7; i++) {
			turistas.add(new Turistas(Messages.getString("Reserva.32")+(i-3),"","","","", Turistas.class.getResource(""))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
		}
		return turistas;
	}
	
	void crearLista() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaTuristas.size() - 1; i++) {
			modelo.addElement(listaTuristas.get(i).getNombre());
		}
		list.setModel(modelo);
	}
	
	private class comboBoxActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				listaTuristas= listaDefecto();
				crearLista();
			} catch (Exception e2) {

			}
		}
	}
	
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			button.setText(""); //$NON-NLS-1$
			try {
				switch (getOpcion()) {
				case 2:
					Turistas tur = listaTuristas.get(list.getSelectedIndex());
					tur.setNombre(textNombre.getText());
					tur.setApellidos(textApellidos.getText());
					tur.setFechaNacimiento(textFechaNacimiento.getText());
					tur.setTelefono(formattedTextTelefono.getText());
					tur.setCorreo(textCorreo.getText());
					tur.setFoto(getFoto());
					listaTuristas.set(list.getSelectedIndex(), tur);
					break;
				}

				crearLista();
			} catch (Exception e2) {

			}

		}
	}
	
	private class BtnFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (textNombre.isEditable()) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(panel);
				// Recoger el nombre del fichero seleccionado por el usuario
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					button.setIcon(new ImageIcon(file.getAbsolutePath()));
					try {
						setFoto(file.toURI().toURL());
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}
	
	private int getOpcion() {
		return opcion;
	}

	private void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	private URL getFoto() {
		return foto;
	}

	private void setFoto(URL foto) {
		this.foto = foto;
	}

}
