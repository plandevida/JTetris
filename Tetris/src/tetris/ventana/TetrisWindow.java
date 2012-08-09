package tetris.ventana;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import tetris.paneles.DataPanel;
import tetris.paneles.TetrisPanel;

/**
 * 
 * @author Plandevida
 *
 */
public class TetrisWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	private JSplitPane splitPane;
	private TetrisPanel panelTetris;
	private DataPanel panelData;
	
	public TetrisWindow() throws HeadlessException {
		super("JTetris");
		initUI();
	}

	public TetrisWindow(String title) throws HeadlessException {
		super(title);
		initUI();
	}
	
	private void initUI() {
		this.setBounds(200, 200, 600, 600);
		this.setResizable(Boolean.FALSE);
		
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setDividerSize(5);
		
		panelTetris = new TetrisPanel(this);	
		splitPane.setLeftComponent(panelTetris);
		
		panelData = new DataPanel(new BorderLayout(4, 4));
		
		splitPane.setRightComponent(panelData);
		
		setContentPane(splitPane);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(Boolean.TRUE);
		this.setVisible(Boolean.TRUE);
	}
	
	public TetrisPanel getTetrisPanel() {
		return panelTetris;
	}
	
	public DataPanel getDataPanel() {
		return panelData;
	}
}
