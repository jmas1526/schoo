
public class Q14_1 {

	public static void main(String[] args) {
		Point point = new Point();
		HorzLine horz = new HorzLine(20);
		Parallelogram para = new Parallelogram(12,5);
		
		System.out.println("point:" + point);
		System.out.println("horz:" + horz);
		System.out.println("para:" + para);
		
		Shape[] shape = new Shape[3];
		shape[0] = point;
		shape[1] = horz;
		shape[2] = para;
		
		for(Shape s : shape)
			s.draw();
	}

}
