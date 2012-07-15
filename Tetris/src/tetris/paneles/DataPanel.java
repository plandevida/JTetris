package tetris.paneles;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

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
//		setBounds(0, 0, getWidth()/2, getHeight());
		JPanel data = new JPanel();
		data.add(new JLabel("scores"));
		add(data, BorderLayout.NORTH);
	}
}
