import java.util.Scanner;

class Q08_02 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("����������͂��܂�");
		System.out.print("���Ԃ̖��O�F");
		String name = keyboardIn.next();
		System.out.print("�ԕ�[mm]�F");
		int width = keyboardIn.nextInt();
		System.out.print("�ԍ�[mm]�F");
		int height = keyboardIn.nextInt();
		System.out.print("�Ԓ�[mm]�F");
		int length = keyboardIn.nextInt();
		System.out.print("�^���N�e��[L]�F");
		double tank = keyboardIn.nextDouble();
		System.out.print("�R��[km/L]�F");
		double distPerL = keyboardIn.nextDouble();
		System.out.print("�i���o�[�F");
		int number = keyboardIn.nextInt();
		Car myCar = new Car(name, width, height, length, tank, distPerL, number);
		
		System.out.println("\n��������\�����܂�");
		myCar.putSpec();
		
		myCar.menu();
	}
	
}

class Car{
	static Scanner keyboardIn = new Scanner(System.in);
	//�t�B�[���h
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double tank;
	private double distPerL; //distance per Liter
	private int number;
	
	//�R���X�g���N�^
	Car(String name, int width, int height, int length, double tank, double distPerL, int number){
				
		this.name = name;
		this.width = width;
		this.height  = height;
		this.length = length;
		this.tank = tank;
		x = y = 0.0;
		this.fuel = tank;
		this.distPerL = distPerL;
		this.number = number;
	}
	
	//////////////////���\�b�h
	//�e�l�擾
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	double getFuel(){
		return fuel;
	}
	
	//�X�y�b�N�\��
	void putSpec(){
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width + "mm");
		System.out.println("�ԍ��F" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
		System.out.println("�^���N�e�ʁF" + tank + "L");
		System.out.println("�R��F" + distPerL + "km/L");
		System.out.printf("�i���o�[�F%04d\n", number);
	}
	void putFuel(){
		System.out.println("�R���c�ʁF" + fuel);
		System.out.println("���s�\�����F" + fuel * distPerL);
	}
	
	//�ړ�
	void moveTo(double toX, double toY){
		double dx = toX - x;
		double dy = toY - y;
		if(!move(dx,dy))
			System.out.println("�R��������܂���I");
	}
	boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		if(dist > fuel * distPerL) return false;
		else{
			fuel -= dist/distPerL;
			x += dx;
			y += dy;
			return true;
		}
	}
	//����
	void addFuel(double diff){
		fuel += diff;
		fuel = fuel < tank ? fuel : tank;
	}
	
	//menu
	void menu(){
		int mode = -1;
		do{
			System.out.println();
			switch(mode){
			case 1: 
				System.out.println("�X�y�b�N��\�����܂�");
				putSpec();
				break;
			case 2: 
				System.out.println("�R���̎c�ʂƑ��s�\������\�����܂�");
				putFuel();
				break;
			case 3: 
				System.out.println("�������܂�");
				System.out.print("�����ʁF");
				addFuel(keyboardIn.nextDouble());
				break;
			case 4: 
				System.out.println("���ݒn(x,y) = (" + x + ", " + y + ")");
				System.out.println("�ړI�n����͂��Ă�������");
				System.out.print("X���W�F");
				double toX = keyboardIn.nextDouble();
				System.out.print("Y���W�F");
				moveTo(toX,keyboardIn.nextDouble());
				break;
			default: break;
			}
			System.out.println("\n���̏�����I�����Ă�������");
			System.out.println("1.�X�y�b�N�\�� / 2.�R���󋵕\�� / 3.���� / 4.�ړ� / 0.�I��");
			System.out.print("���̏����ԍ��F");
			mode = keyboardIn.nextInt();
		}while(mode != 0);
	}
}
