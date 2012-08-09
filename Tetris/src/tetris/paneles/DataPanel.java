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
	
	private JLabel score = new JLabel("Pos: ");
	
	public DataPanel(LayoutManager layout) {
		setLayout(layout);
		initUI();
	}
	
	public DataPanel() {
		initUI();
	}
	
	private void initUI() {
		JPanel data = new JPanel();
		data.add(score);
		add(data, BorderLayout.NORTH);
	}
	
	public JLabel getScore() {
		return score;
	}
}
