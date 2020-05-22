import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class List16_5 {
	static String fileName;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		init();
		
		System.out.println();
		System.out.print("�ǉ��e�L�X�g�F");
		String kibun = sc.next();
		
		System.out.println();
		term(kibun);
		System.out.println("�I�����܂��B");
		sc.close();
	}
	
	//���o�̓t�@�C���̑I��
	public static void init() {
		BufferedReader br = null;
		while(true) {
			try {
				
				System.out.print("�t�@�C�����F");
				fileName = sc.next();
				//UTF-8�œǂݍ���
				br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),StandardCharsets.UTF_8));
				System.out.println("�t�@�C���̒��g�ł��B");
				ArrayList<String> data = new ArrayList<String>();
				String line = br.readLine();
				do{
					data.add(line);
					line = br.readLine();
					
				}while(line != null);
				
				for(String s : data) {
					System.out.println(s);
				}
				
//				System.out.println("read br");
//				String[] kibun = br.lines().toArray();
//				System.out.println("kibun toArray");
//				System.out.println("�O��̋C����" + kibun[0] + "�ł����B");
				
			} catch (FileNotFoundException e) {
				System.out.println("�t�@�C��������܂���B");
				System.out.print("�V�K�쐬...1 / �ē���...2 / �I��...0�F");
				String next = sc.next();
				
				if(next.equals("0")) {
					System.out.println("�I�����܂��B");
					System.exit(1);
					
				}else if(next.equals("1")) {
					break;
				}else{
					//0�ł�1�ł��Ȃ��Ƃ��ē���
					continue;
				}
				
			} catch (IOException e) {
				System.out.println("���̑���IO�G���[�ł��B");
			} finally {
				if ( br!= null ) {
					try {
						br.close();
					} catch (IOException e) {
						System.out.println("�t�@�C���N���[�Y���s�B");
					}
				}
				
			}
			break;
		}
			
	}
	
	
	
	//�t�@�C���o��
	public static void term(String s) {
		BufferedWriter bw = null;
		System.out.println("�t�@�C����ۑ����܂��B");
	TRY:{
		try {
			System.out.println("0...�t�@�C���㏑��(����܂ł̃f�[�^�͏����܂�)");
			System.out.println("1...�t�@�C�������ɒǉ�");
			System.out.println("9...�ύX�����I��");
			System.out.print("�ǂ�ɂ��܂����F");
			String mode = sc.next();
			if(mode.equals("9")) break TRY;
			//UTF-8�ŏ����o���Amode�Œǉ�or���S�㏑��
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName,!mode.equals("0")),StandardCharsets.UTF_8));
			bw.write(s + "\n");
		} catch (IOException e) {
			System.out.println("�G���[����!!");
		} finally {
			if (bw != null) {
				try {
					bw.close();
					System.out.println("�������݊���");
				} catch (IOException e) {
				System.out.println("�t�@�C���N���[�Y���s�B");
				} 
			}
		}
	}//TRY�̏I���
		
	}

}
