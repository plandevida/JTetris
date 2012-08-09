package utilidades;

import java.awt.Color;

public enum ColorsEnum {
	BLACK(Color.BLACK),
	BLUE(Color.BLUE),
	RED(Color.RED),
	GREEN(Color.GREEN),
	GRAY(Color.GRAY),
	LIGTH_GRAY(Color.LIGHT_GRAY)
	;
	
	private Color colorType;
	
	ColorsEnum (Color color) {
		this.colorType = color;
	}
	
	public Color getColor() {
		return colorType;
	}
	
	public static Color getColorIndex(int colorIndex) {
		Color color = ColorsEnum.values()[0].getColor();
		for (ColorsEnum col : values()) {
			if (col.ordinal() == colorIndex) {
				color = col.getColor();
			}
		}
		
		return color;
	}
}
