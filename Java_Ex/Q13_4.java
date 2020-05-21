import java.util.Scanner;

/**
 * ���̃N���X��javadoc���K�p�̐l�ԃN���X�ł��B
 * 
 * @author gojin
 * @see Day
 *
 */
public class Q13_4{
	
	//�t�B�[���h
	/**
 	 * ���O����String�^�̃t�B�[���h�ł��B
	 */
	private String name;
	/**
	 * �N�������int�^�̃t�B�[���h�ł��B
	 */
	private int age;
	/**
	 * �g��������double�^�̃t�B�[���h�ł��B
	 */
	private double height;
	/**
	 * 
	 * �̏d������double�^�̃t�B�[���h�ł��B
	 */
	private double weight;
	/**
	 * BMI������int�^�̃t�B�[���h�ł��B
	 * 
	 */
	private double bmi;
	/**
	 * ���t�^������String�^�̃t�B�[���h�ł��B
	 */
	private String bloodType;
	/**
	 * �a�����������N���XDay�^�̃t�B�[���h�ł��B
	 * 
	 */
	private Day birthday;
	
	//�R���X�g���N�^
	/**
	 * �a�����̂Ȃ��l�ԃN���X�𐶐�����R���X�g���N�^�ł��B
	 * �a������null�ƂȂ�܂��B
	 * @param name ���O
	 * @param age �N��
	 * @param height �g��
	 * @param weight �̏d
	 * @param bloodType ���t�^
	 */
	public Q13_4(String name, int age, double height, double weight, String bloodType){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = null;
	}
	
	/**
	 * �a�����������Ƃ��Ď󂯎��R���X�g���N�^�ł��B
	 * @param name ���O
	 * @param age �N��
	 * @param height �g��
	 * @param weight �̏d
	 * @param bloodType ���t�^
	 * @param birthday �a����
	 */
	public Q13_4(String name, int age, double height, double weight, String bloodType,Day birthday){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = birthday;
	}
	
	//////////////////���\�b�h
	
	static Scanner keyboardIn = new Scanner(System.in);
	/**
	 * @param args �R�}���h���C�������̔z��
	 */
	public static void main(String[] args) {
		System.out.println("�������R�����g�̍쐬");
	}
	
	
	//�e�l�擾
	/**
	 * ���O��ԋp���܂�
	 * @return �t�B�[���h�́u���O�v��ԋp���܂�
	 */
	String getName(){
		return name;
	}
	/**
	 * �N���ԋp���܂�
	 * @return �t�B�[���h�́u�N��v��ԋp���܂�
	 */
	int getAge(){
		return age;
	}
	/**
	 * �g����ԋp���܂�
	 * @return �t�B�[���h�́u�g���v��ԋp���܂�
	 */
	double getHeight(){
		return height;
	}
	/**
	 * �̏d��ԋp���܂�
	 * @return �t�B�[���h�́u�̏d�v��ԋp���܂�
	 */
	double getWeight(){
		return weight;
	}
	/**
	 * BMI��ԋp���܂�
	 * @return �t�B�[���h�́uBMI�v��ԋp���܂�
	 */
	double getBmi(){
		return bmi;
	}
	/**
	 * ���t�^��ԋp���܂�
	 * @return �t�B�[���h�́u���t�^�v��ԋp���܂�
	 */
	String getBloodType(){
		return bloodType;
	}
	/**
	 * �a������ԋp���܂�
	 * @return �t�B�[���h�́u�a�����v��ԋp���܂�
	 */
	Day getBirthday() {
		return new Day(birthday);
	}
	
	
	//toString
	/**
	 *���\�b�htoString�́A���O�ƔN���Ԃ��܂�
	 *@return �u(���O) (�N��)�΁v�ƕԋp���܂�
	 */
	@Override
	public String toString() {
		return this.name + " " + age + "��";
	}
	
	//�S�f�[�^�\��
	/**
	 * �C���X�^���X�̑S�����R���\�[���ɕ\�����܂�
	 */
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
	
	/**
	 * �N���ύX���܂�
	 * @param diff �ύX����N��̑���
	 */
	void addAge(int diff){
		age += diff;
		if(age < 0) System.out.println("�x���F�N��}�C�i�X�l�ɂȂ�܂���");
	}
	
	/**
	 * �g����ύX���܂�
	 * @param diff �ύX����g���̑���
	 */
	void addHeight(double diff){
		height += diff;
		if(height < 0) System.out.println("�x���F�g�����}�C�i�X�l�ɂȂ�܂���");
		bmi = weight / height / height;
	}
	
	/**
	 * �̏d��ύX���܂�
	 * @param diff �ύX����̏d�̑���
	 */
	void addWeight(double diff){
		weight += diff;
		if(weight < 0) System.out.println("�x���F�̏d���}�C�i�X�l�ɂȂ�܂���");
		bmi = weight / height / height;
	}
	
	//menu
	/**
	 * �R���\�[������C���X�^���X�̑�����s�����Ƃ��ł��܂�\n
	 * �f�[�^�̕\���A�N��E�g���E�̏d�̕ύX���\�ł�
	 */
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
