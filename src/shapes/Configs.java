package shapes;

public class Configs {
	public static final int MIN_NUM_OF_SHAPES = 0;
	public static final int MAX_NUM_OF_SHAPES = 5;
	public static final float PI = 3.14f;
	public static final float INCH_CM = 2.54f;

	// unit
	public static final int UNIT_CM = 1;
	public static final int UNIT_INCH = 2;
	public static int unit = UNIT_CM;

	// from cm to inch
	public static float CentimiterToInch(float cm) {
		float inch = cm / INCH_CM;
		return inch;
	}
	// from inch to cm
	public static float InchToCentimiter(float inch) {
		float cm = inch * INCH_CM;
		return cm;
	}
}
