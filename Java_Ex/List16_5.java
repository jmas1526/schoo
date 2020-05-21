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
		System.out.print("追加テキスト：");
		String kibun = sc.next();
		
		System.out.println();
		term(kibun);
		System.out.println("終了します。");
		sc.close();
	}
	
	//入出力ファイルの選択
	public static void init() {
		BufferedReader br = null;
		while(true) {
			try {
				
				System.out.print("ファイル名：");
				fileName = sc.next();
				//UTF-8で読み込む
				br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),StandardCharsets.UTF_8));
				System.out.println("ファイルの中身です。");
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
//				System.out.println("前回の気分は" + kibun[0] + "でした。");
				
			} catch (FileNotFoundException e) {
				System.out.println("ファイルがありません。");
				System.out.print("新規作成...1 / 再入力...2 / 終了...0：");
				String next = sc.next();
				
				if(next.equals("0")) {
					System.out.println("終了します。");
					System.exit(1);
					
				}else if(next.equals("1")) {
					break;
				}else{
					//0でも1でもないとき再入力
					continue;
				}
				
			} catch (IOException e) {
				System.out.println("その他のIOエラーです。");
			} finally {
				if ( br!= null ) {
					try {
						br.close();
					} catch (IOException e) {
						System.out.println("ファイルクローズ失敗。");
					}
				}
				
			}
			break;
		}
			
	}
	
	
	
	//ファイル出力
	public static void term(String s) {
		BufferedWriter bw = null;
		System.out.println("ファイルを保存します。");
	TRY:{
		try {
			System.out.println("0...ファイル上書き(これまでのデータは消えます)");
			System.out.println("1...ファイル末尾に追加");
			System.out.println("9...変更せず終了");
			System.out.print("どれにしますか：");
			String mode = sc.next();
			if(mode.equals("9")) break TRY;
			//UTF-8で書き出し、modeで追加or完全上書き
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName,!mode.equals("0")),StandardCharsets.UTF_8));
			bw.write(s + "\n");
		} catch (IOException e) {
			System.out.println("エラー発生!!");
		} finally {
			if (bw != null) {
				try {
					bw.close();
					System.out.println("書き込み完了");
				} catch (IOException e) {
				System.out.println("ファイルクローズ失敗。");
				} 
			}
		}
	}//TRYの終わり
		
	}

}
