package test;
import java.util.Scanner;
class Algorithm_6_2 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("\n\n============================================================");
		System.out.println("==========================start=============================");
		System.out.println("============================================================");
		
		
		
		/* N�̒l���L�[�{�[�h������� */
		System.out.print("N�̒l��2�ȏ�œ��͂��Ă��������F");
		int N = keyboardIn.nextInt();
		
		while (N < 2) { //N��0�ȉ��̂Ƃ��ē���
			System.out.print("N�̒l����͂��Ă��������F");
			N = keyboardIn.nextInt();
		}
		N++; //����N�̕\�L�ƍ��킹��
		
		
		
		/* K[I]�̔z����쐬���� */
		int[] K = new int[N];
		for (int i = 0; i < N; i++) {
			K[i] = i + 1;
		}
		printK(N,K);//K[I]�̒��g��\������
		
		
		/********************�t���[�`���[�g��������********************/
		int M = 0;
		int I = 0;
		System.out.println("M=0, I=0 �ɏ��������܂�");
		
		
		/* (a)�̏�������*/
		while(I < N-1){
			System.out.println("\n--------------------------------------------\nI��1���₵�܂�");
			I++;
			System.out.println("\tI=" + I);
			
			/*(b)��(c)�̏�������*/
			System.out.print("K[" + I + "]�F" + (I + 1) + " ��");
			if(K[I] != 0){
				/*(c)���[�g*/
				System.out.println("�f���ł� �t���[�`���[�g��(c)�ɐi�݂܂�\nM��1���₵�܂�");
				M++;
				System.out.println("\tM=" + M);
				
				int flag = 0; //�z��\������p�̃t���O
				int J = I;
				
				/*(d)(e)�̃��[�v*/
				System.out.println("�z���" + K[I] + "�ȊO��" + K[I] + "�̔{����0�ɂ��܂�");
				while(J < N-K[I]) { //�����ł�(d)�̏����^�C�~���O�̓s����(J < N)�ł͂Ȃ�
					J += K[I]; //(d)
					K[J] = 0;
					System.out.println("\tJ=" + J + "\tK[" + J + "]=" + K[J]);
					flag = 1; //�z��ɕύX������ꍇ�̂݃t���O�𗧂Ă�
				}
				if(flag == 1){
					printK(N,K);//I�𑝂₷�O�Ƀ`�F�b�N���K[I]�̒��g��\������
				}else{
					System.out.println("�z��ɕύX�͂���܂���ł���");
				}
			}else{
				/* (b)���[�g*/
				System.out.println("�`�F�b�N�ς݂ł� �t���[�`���[�g��(b)�ɐi�݂܂�");
			}
		}
		
		/*(a)�̏I���֌���������...�\���̂��߂݂̂̏���*/
		System.out.println("\n--------------------------------------------\nI��1���₵�܂�");
		I++;
		System.out.println("I=" + I);
		System.out.println("I > N�ƂȂ������ߏI�����܂�");
		
		/********************�t���[�`���[�g�����܂�********************/
		
		/*�ŏI���ʂ̕\��*/
		System.out.println("\n\n\n==================�ŏI����==================");
		System.out.println(N + "�܂ł̑f����" + M + "�ł�");
		printK(N,K);//K[I]�̒��g��\������
	}
	
	
	
	/* K[I]�̒��g��\������ */
	static void printK(int n,int K[]){
		System.out.println("�Z���݂̔z��̒��g�ł��Z");
		for (int i = 1; i < n; i++) {
			System.out.print("\tK[" + i + "]=" + K[i] + "\n");
		}
	}
}

