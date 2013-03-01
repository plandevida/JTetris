package tetris;

import java.lang.Thread;

/**
 * Esta clase es la clase principal que ejecuta el juego.
 * 
 * @author Plandevida
 *
 */
public class Manager {
	
	// Instancia del juego, que contiene toda
	// la l�gica del hilo, actualizaci�n, etc...
        private Thread hilo;
	
	public Manager() {
		Tetris tetris = new Tetris();
                hilo = new Thread(tetris);
	}
	
	/**
	 * Ejecuta el hilo principal y �nico del juego.
	 */
	public void ejecutar() {
		hilo.start();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.ejecutar();
	}
}
