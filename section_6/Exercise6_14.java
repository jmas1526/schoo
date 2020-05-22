import java.util.Scanner;
import java.util.Random;

class Exercise6_14{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		
		
		String []month ={"January","Febuary","March","April","May","June","July","August","September","October","November","Dexember"};
		
		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");
		
		while(true){
			int number=rand.nextInt(12)+1;
			System.out.print(number+"月：");
			String m=stdIn.next();
			
			if(!(m.equals(month[number-1]))){
				System.out.println("違います。");
			}else{
				System.out.println("正解です。もう一度？　1…Yes/0…No");
				int question=stdIn.nextInt();
				
				if (!(question==1)){
					break;
				}
			}
		}
	}
}