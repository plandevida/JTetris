package tetris.piezas.fichas;

import tetris.piezas.Cubito;
import tetris.piezas.Pieza;

public class EleIzq extends Pieza {

	public EleIzq() {
		x = 104;
		y = 12;
		
		crearForma();
	}

	@Override
	protected void crearForma() {
		/** Este array representa un esquema de pieza:
		 *		| 0, 1, 0 |
		 *		| 0, 1, 0 |
		 *		| 1, 1, 0 |
		 *		| 0, 0, 0 |
		 *	donde los unos significa que ahí se pintará un cubito @see Cubito.java
		 **/
		
		// la posición en la que se va a pintar el cubo: x = columna, y = fila
		// forma[0][0] = new Cubito(x+0*10, y+0*10, color);
		//                             ^       ^
		//                         x=columna  y=fila (multiplicados por el ancho del cubito)
		
		forma[0][0] = null; 										forma[0][1] = new Cubito(x+1*lado, y+0*lado, color, this); 	forma[0][2] = null;
		forma[1][0] = null; 										forma[1][1] = new Cubito(x+1*lado, y+1*lado, color, this); 	forma[1][2] = null;
		forma[2][0] = new Cubito(x+0*lado, y+2*lado, color, this); 	forma[2][1] = new Cubito(x+1*lado, y+2*lado, color, this); 	forma[2][2] = null;
		forma[3][0] = null; 										forma[3][1] = null; 										forma[3][2] = null;
	}
}
