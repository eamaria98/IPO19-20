package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;

public class PestañaCircuito extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel pnlNormal;
	private JPanel pnlAmpliada;

	/**
	 * Create the panel.
	 */
	public PestañaCircuito() {
		setLayout(new BorderLayout(0, 0));
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			add(tabbedPane, BorderLayout.CENTER);
			{
				pnlNormal = new Circuitos();
				tabbedPane.addTab("New tab", null, pnlNormal, null);
				GridBagLayout gbl_pnlNormal = new GridBagLayout();
				gbl_pnlNormal.columnWidths = new int[]{0};
				gbl_pnlNormal.rowHeights = new int[]{0};
				gbl_pnlNormal.columnWeights = new double[]{Double.MIN_VALUE};
				gbl_pnlNormal.rowWeights = new double[]{Double.MIN_VALUE};
				pnlNormal.setLayout(gbl_pnlNormal);
			}
			{
				pnlAmpliada = new CircuitosAmpli();
				tabbedPane.addTab("New tab", null, pnlAmpliada, null);
				GridBagLayout gbl_pnlAmpliada = new GridBagLayout();
				gbl_pnlAmpliada.columnWidths = new int[]{0};
				gbl_pnlAmpliada.rowHeights = new int[]{0};
				gbl_pnlAmpliada.columnWeights = new double[]{Double.MIN_VALUE};
				gbl_pnlAmpliada.rowWeights = new double[]{Double.MIN_VALUE};
				pnlAmpliada.setLayout(gbl_pnlAmpliada);
			}
		}

	}

}
