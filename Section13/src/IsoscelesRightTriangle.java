
public abstract class IsoscelesRightTriangle extends Shape {
	private int bottom;
	
	public IsoscelesRightTriangle(int bottom) {
		setBottom(bottom);
	}
	
	public int getBottom() {
		return bottom;
	}
	
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
}
