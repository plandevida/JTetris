package tetris;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Tetris extends JFrame {
	private static final long serialVersionUID = 1L;

	public Tetris() throws HeadlessException {
		super("JTetris");
	}

	public Tetris(GraphicsConfiguration gc) {
		super(gc);
	}

	public Tetris(String title) throws HeadlessException {
		super(title);
	}

	public Tetris(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}
}
