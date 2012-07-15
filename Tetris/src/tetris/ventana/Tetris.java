package tetris.ventana;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import tetris.paneles.DataPanel;
import tetris.paneles.TetrisPanel;

public class Tetris extends JFrame {
	private static final long serialVersionUID = 1L;

	private JSplitPane splitPane;
	private TetrisPanel panelTetris;
	
	public Tetris() throws HeadlessException {
		super("JTetris");
		initUI();
	}

	public Tetris(String title) throws HeadlessException {
		super(title);
		initUI();
	}
	
	private void initUI() {
		this.setBounds(200, 200, 600, 600);
		this.setResizable(false);
		
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setDividerSize(5);
		
		panelTetris = new TetrisPanel(this);		
		splitPane.setLeftComponent(panelTetris);
		
		DataPanel panelData = new DataPanel(new BorderLayout(4, 4));
		
		splitPane.setRightComponent(panelData);
		
		setContentPane(splitPane);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(Boolean.TRUE);
	}
}
