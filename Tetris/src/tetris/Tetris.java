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
		
		Long beginLoopTime = null;
		Long endLoopTime = null;
		Long currentUpdateTime = System.nanoTime();
		Long lastUpdateTime = null;
		Long deltaLoop = null;

		while (running) {
			
//			if (deltaLoop != null) {
//				System.out.println((desiredDeltaLoop - deltaLoop) / (1000 * 10));
//				tetris.getTetrisLienzo().repaint((desiredDeltaLoop - deltaLoop) / (1000 * 10));
//				tetris.getTetrisLienzo().update((int) ((desiredDeltaLoop - deltaLoop) / (1000 * 10)) );
//			} else {
//				tetris.getTetrisLienzo().repaint();
//			}

			beginLoopTime = System.nanoTime();
			
			tetris.getTetrisLienzo().paint(tetris.getTetrisLienzo().getGraphics());;
			
			lastUpdateTime = currentUpdateTime;
			currentUpdateTime = System.nanoTime();
			
			tetris.getTetrisLienzo().update((int)(currentUpdateTime - lastUpdateTime) / (1000 * 1000));

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
