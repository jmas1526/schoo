import java.util.Scanner;

public class Human{
	static Scanner keyboardIn = new Scanner(System.in);
	//�t�B�[���h
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	private String bloodType;
	private Day birthday;
	
	//�R���X�g���N�^
	Human(String name, int age, double height, double weight, String bloodType){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = null;
	}
	Human(String name, int age, double height, double weight, String bloodType,Day birthday){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = birthday;
	}
	
	//////////////////���\�b�h
	//�e�l�擾
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	double getHeight(){
		return height;
	}
	double getWeight(){
		return weight;
	}
	double getBmi(){
		return bmi;
	}
	String getBloodType(){
		return bloodType;
	}
	Day getBirthday() {
		return new Day(birthday);
	}
	
	
	//toString
	@Override
	public String toString() {
		return this.name + " " + age + "��";
	}
	
	//�S�f�[�^�\��
	void printData(){
		System.out.println("���O�F" + name);
		System.out.println("�N��F" + age + "��");
		System.out.println("�g���F" + height + "m");
		System.out.println("�̏d�F" + weight + "kg");
		System.out.println("BMI�F" + bmi);
		System.out.println("���t�^�F" + bloodType + "�^");
		System.out.println("�a�����F" + birthday);
	}
	
	//�l�̕ύX
	
	void addAge(int diff){
		age += diff;
		if(age < 0) System.out.println("�x���F�N��}�C�i�X�l�ɂȂ�܂���");
	}
	
	void addHeight(double diff){
		height += diff;
		if(height < 0) System.out.println("�x���F�g�����}�C�i�X�l�ɂȂ�܂���");
		bmi = weight / height / height;
	}
	
	void addWeight(double diff){
		weight += diff;
		if(weight < 0) System.out.println("�x���F�̏d���}�C�i�X�l�ɂȂ�܂���");
		bmi = weight / height / height;
	}
	
	//menu
	void menu(){
		int mode = -1;
		do{
			switch(mode){
			case 1: 
				System.out.println("�f�[�^��\�����܂�");
				printData();
				break;
			case 2: 
				System.out.println("����" + age +  "�΂ł�");
				System.out.print("�N��̑����F");
				addAge(keyboardIn.nextInt());
				break;
			case 3: 
				System.out.println("����" + height +  "m�ł�");
				System.out.print("�g���̑����F");
				addHeight(keyboardIn.nextDouble());
				break;
			case 4: 
				System.out.println("����" + weight +  "kg�ł�");
				System.out.print("�̏d�̑����F");
				addWeight(keyboardIn.nextDouble());
				break;
			default: break;
			}
			System.out.println("\n���̏�����I�����Ă�������");
			System.out.println("1.�f�[�^�\�� / 2.�N��ύX / 3.�g���ύX / 4.�̏d�ύX / 0.�I��");
			System.out.print("���̏����ԍ��F");
			mode = keyboardIn.nextInt();
		}while(mode != 0);
	}
}
