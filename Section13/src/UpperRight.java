
public class UpperRight extends IsoscelesRightTriangle {
	public UpperRight(int bottom) {
		super(bottom);
		}
	
	public String toString() {
		return "UpperRight(bottom:" + getBottom()  + ")"; 
	}
	
	public void draw() {
		for(int i=0;i<getBottom();i++){
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}
			for(int k=0;k<getBottom()-i;k++){
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
