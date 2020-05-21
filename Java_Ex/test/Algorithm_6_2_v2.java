package test;
import java.util.Scanner;
class Algorithm_6_2 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("\n\n============================================================");
		System.out.println("==========================start=============================");
		System.out.println("============================================================");
		
		
		
		/* Nの値をキーボードから入力 */
		System.out.print("Nの値を2以上で入力してください：");
		int N = keyboardIn.nextInt();
		
		while (N < 2) { //Nが0以下のとき再入力
			System.out.print("Nの値を入力してください：");
			N = keyboardIn.nextInt();
		}
		N++; //問題のNの表記と合わせる
		
		
		
		/* K[I]の配列を作成する */
		int[] K = new int[N];
		for (int i = 0; i < N; i++) {
			K[i] = i + 1;
		}
		printK(N,K);//K[I]の中身を表示する
		
		
		/********************フローチャートここから********************/
		int M = 0;
		int I = 0;
		System.out.println("M=0, I=0 に初期化します");
		
		
		/* (a)の条件分岐*/
		while(I < N-1){
			System.out.println("\n--------------------------------------------\nIを1増やします");
			I++;
			System.out.println("\tI=" + I);
			
			/*(b)と(c)の条件分岐*/
			System.out.print("K[" + I + "]：" + (I + 1) + " は");
			if(K[I] != 0){
				/*(c)ルート*/
				System.out.println("素数です フローチャートの(c)に進みます\nMを1増やします");
				M++;
				System.out.println("\tM=" + M);
				
				int flag = 0; //配列表示判定用のフラグ
				int J = I;
				
				/*(d)(e)のループ*/
				System.out.println("配列の" + K[I] + "以外の" + K[I] + "の倍数を0にします");
				while(J < N-K[I]) { //ここでは(d)の処理タイミングの都合上(J < N)ではない
					J += K[I]; //(d)
					K[J] = 0;
					System.out.println("\tJ=" + J + "\tK[" + J + "]=" + K[J]);
					flag = 1; //配列に変更がある場合のみフラグを立てる
				}
				if(flag == 1){
					printK(N,K);//Iを増やす前にチェック後のK[I]の中身を表示する
				}else{
					System.out.println("配列に変更はありませんでした");
				}
			}else{
				/* (b)ルート*/
				System.out.println("チェック済みです フローチャートの(b)に進みます");
			}
		}
		
		/*(a)の終了へ向かう分岐...表示のためのみの処理*/
		System.out.println("\n--------------------------------------------\nIを1増やします");
		I++;
		System.out.println("I=" + I);
		System.out.println("I > Nとなったため終了します");
		
		/********************フローチャートここまで********************/
		
		/*最終結果の表示*/
		System.out.println("\n\n\n==================最終結果==================");
		System.out.println(N + "までの素数は" + M + "個です");
		printK(N,K);//K[I]の中身を表示する
	}
	
	
	
	/* K[I]の中身を表示する */
	static void printK(int n,int K[]){
		System.out.println("〇現在の配列の中身です〇");
		for (int i = 1; i < n; i++) {
			System.out.print("\tK[" + i + "]=" + K[i] + "\n");
		}
	}
}

