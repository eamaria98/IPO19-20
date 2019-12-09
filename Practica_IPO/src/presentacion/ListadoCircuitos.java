package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

public class ListadoCircuitos extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListadoCircuitos() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlLista = new JPanel();
		add(pnlLista, BorderLayout.WEST);
		GridBagLayout gbl_pnlLista = new GridBagLayout();
		gbl_pnlLista.columnWidths = new int[]{0};
		gbl_pnlLista.rowHeights = new int[]{0};
		gbl_pnlLista.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_pnlLista.rowWeights = new double[]{Double.MIN_VALUE};
		pnlLista.setLayout(gbl_pnlLista);
		
		JPanel pnlDetalles = new JPanel();
		add(pnlDetalles, BorderLayout.CENTER);
		GridBagLayout gbl_pnlDetalles = new GridBagLayout();
		gbl_pnlDetalles.columnWidths = new int[]{0};
		gbl_pnlDetalles.rowHeights = new int[]{0};
		gbl_pnlDetalles.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_pnlDetalles.rowWeights = new double[]{Double.MIN_VALUE};
		pnlDetalles.setLayout(gbl_pnlDetalles);

	}

}
