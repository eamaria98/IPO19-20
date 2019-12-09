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

public class CircuitosAmpliada extends JPanel {
	VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
	/**
	 * Create the panel.
	 */
	public CircuitosAmpliada() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNort = new JPanel();
		add(pnlNort, BorderLayout.NORTH);
		GridBagLayout gbl_pnlNort = new GridBagLayout();
		gbl_pnlNort.columnWidths = new int[]{0, 0, 0, 391, 0, 0, 0, 0, 0};
		gbl_pnlNort.rowHeights = new int[]{20, 40, 20, 0};
		gbl_pnlNort.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlNort.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlNort.setLayout(gbl_pnlNort);
		
		JButton btnVistaNormal = new JButton("Vista Normal");
		GridBagConstraints gbc_btnVistaNormal = new GridBagConstraints();
		gbc_btnVistaNormal.insets = new Insets(0, 0, 5, 5);
		gbc_btnVistaNormal.gridx = 1;
		gbc_btnVistaNormal.gridy = 1;
		pnlNort.add(btnVistaNormal, gbc_btnVistaNormal);
		
		JButton btnVistaAmpliada = new JButton("Vista Ampliada");
		GridBagConstraints gbc_btnVistaAmpliada = new GridBagConstraints();
		gbc_btnVistaAmpliada.insets = new Insets(0, 0, 5, 5);
		gbc_btnVistaAmpliada.gridx = 2;
		gbc_btnVistaAmpliada.gridy = 1;
		pnlNort.add(btnVistaAmpliada, gbc_btnVistaAmpliada);
		
		JButton btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 4;
		gbc_btnBorrar.gridy = 1;
		pnlNort.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 5;
		gbc_btnModificar.gridy = 1;
		pnlNort.add(btnModificar, gbc_btnModificar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(new BtnReservarActionListener());
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 6;
		gbc_btnReservar.gridy = 1;
		pnlNort.add(btnReservar, gbc_btnReservar);
		
		JPanel pnlCenter = new JPanel();
		add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new BoxLayout(pnlCenter, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new PanelCirAmp();
		GridBagLayout gridBagLayout = (GridBagLayout) panel_1.getLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 20, 20, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowHeights = new int[]{0, 80, 80, 40, 40, 40, 40, 40, 40, 0, 30};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
		pnlCenter.add(panel_1);
		
		JPanel panel = new PanelCirAmp();
		GridBagLayout gridBagLayout_1 = (GridBagLayout) panel.getLayout();
		gridBagLayout_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		gridBagLayout_1.columnWidths = new int[]{0, 0, 0, 20, 20, 0};
		gridBagLayout_1.rowHeights = new int[]{0, 80, 80, 40, 40, 40, 40, 40, 40, 0, 30};
		gridBagLayout_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
		pnlCenter.add(panel);

	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
