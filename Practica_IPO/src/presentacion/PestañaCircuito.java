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
				tabbedPane.addTab(Messages.getString("PestañaCircuito.0"), null, pnlNormal, null); //$NON-NLS-1$
			}
			{
				pnlAmpliada = new CircuitosAmpli();
				tabbedPane.addTab(Messages.getString("PestañaCircuito.1"), null, pnlAmpliada, null); //$NON-NLS-1$
			}
		}

	}

}
