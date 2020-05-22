public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private Day purchaseDay;
	
	//�R���X�g���N�^
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay){	
		this.name = name;
		this.width = width;
		this.height  = height;
		this.length = length;
		x = y = 0.0;
		this.fuel = fuel;
		this.purchaseDay = new Day(purchaseDay);
	}
	
	//getter
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getFuel(){
		return fuel;
	}
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	//�X�y�b�N�\��
	public void putSpec(){
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width + "mm");
		System.out.println("�ԍ��F" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
	}
	
	//�ړ�
	public boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		if(dist > fuel) return false;
		else{
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}

