package tetris;

import tetris.ventana.TetrisWindow;

public class Tetris implements Runnable {

	private boolean running = true;
	private long desiredFPS = 60;
	private long desiredDeltaLoop = (1000 * 1000 * 1000) / desiredFPS;

	private TetrisWindow tetris;
	
	public Tetris() {
		tetris = new TetrisWindow();
	}

	@Override
	public void run() {
		
		long beginLoopTime;
		long endLoopTime;
		long currentUpdateTime = System.nanoTime();
		long lastUpdateTime;
		long deltaLoop;

		while (running) {

			beginLoopTime = System.nanoTime();
			lastUpdateTime = currentUpdateTime;
			currentUpdateTime = System.nanoTime();

//			tetris.getTetrisPanel().repaint((currentUpdateTime - lastUpdateTime) / (1000 * 1000));
//			tetris.getTetrisPanel().repaint();
			tetris.getTetrisLienzo().repaint( (currentUpdateTime - lastUpdateTime) / (1000 * 1000));

			endLoopTime = System.nanoTime();
			deltaLoop = endLoopTime - beginLoopTime;

			if (deltaLoop <= desiredDeltaLoop) {
				try {
					Thread.sleep((desiredDeltaLoop - deltaLoop) / (1000 * 1000));
				} catch (InterruptedException e) {
					System.out.println("Estamos dentros del tiempo de refresco");
				}
			}
		}
	}
}
