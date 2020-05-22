
public class UpperLeft extends IsoscelesRightTriangle {
	public UpperLeft(int bottom) {
		super(bottom);
		}
	
	public String toString() {
		return "UpperLeft(bottom:" + getBottom()  + ")"; 
	}
	
	public void draw() {
		for(int i=getBottom();i>0;i--){
			for(int j=getBottom();j>0;j--){
				System.out.print("* ");
			}
			System.out.println();
			setBottom(getBottom()-1);
		}
	}
}
