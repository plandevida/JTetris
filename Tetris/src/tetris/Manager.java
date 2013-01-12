package tetris;

/**
 * Esta clase es la clase principal que ejecuta el juego.
 * 
 * @author Plandevida
 *
 */
public class Manager {
	
	// Instancia del juego, que contiene toda
	// la lógica del hilo, actualización, etc...
	private Tetris tetris;
	
	public Manager() {
		tetris = new Tetris();
	}
	
	/**
	 * Ejecuta el hilo principal y único del juego.
	 */
	public void ejecutar() {
		tetris.run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.ejecutar();
	}
}
