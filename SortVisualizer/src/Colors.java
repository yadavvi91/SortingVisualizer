import java.awt.Color;

public enum Colors {
	INACTIVE(191, 191, 191), SORTED(87, 232, 14), TARGET(255, 20, 20), ACTIVE(8,8,8);

	private final Color col;

	Colors(int r, int g, int b) {
		col = new Color(r, g, b);
	}

	public Color get() {
		return col;
	}
}
