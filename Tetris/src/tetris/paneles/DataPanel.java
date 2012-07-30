package tetris.paneles;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Plandevida
 *
 */
public class DataPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public DataPanel(LayoutManager layout) {
		setLayout(layout);
		initUI();
	}
	
	public DataPanel() {
		initUI();
	}
	
	private void initUI() {
		JPanel data = new JPanel();
		data.add(new JLabel("Data"));
		add(data, BorderLayout.NORTH);
	}
}
