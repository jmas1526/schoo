import java.util.Scanner;

class Q08_01 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("����������͂��܂�");
		System.out.print("���O�F");
		String name = keyboardIn.next();
		System.out.print("�N��F");
		int age = keyboardIn.nextInt();
		System.out.print("�g��[m]�F");
		double height = keyboardIn.nextDouble();
		System.out.print("�̏d[kg]�F");
		double weight = keyboardIn.nextDouble();
		System.out.print("���t�^[A/B/O/AB]�F");
		String bloodType = keyboardIn.next();
		Human human = new Human(name, age, height, weight, bloodType);
		
		System.out.println("\n��������\�����܂�");
		human.printData();
		
		human.menu();
	}
	
}