import java.util.Scanner;
import java.util.Random;

class Exercise7_10{
	
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	
	static boolean confirmRetry(){
		int cont;
		do{
			System.out.print("もう一度？<Yes…1/No…0>：");
			cont=stdIn.nextInt();
		}while(cont!=0&&cont!=1);
		return cont==1;
	}
	
	
	public static void main(String[]args){
		
		System.out.println("暗算力トレーニング！！");
		do{
			int x=rand.nextInt(900)+100;
			int y=rand.nextInt(900)+100;
			int z=rand.nextInt(900)+100;
			
			int seed=rand.nextInt(4);
			int question=0;
				
			if(seed==0){
				question=x+y+z;
			}else if(seed==1){
				question=x+y-z;
			}else if(seed==2){
				question=x-y+z;
			}else if(seed==3){
				question=x-y-z;
			}
				
			while(true){
					
				if(seed==0){
					System.out.print(x+"+"+y+"+"+z+"=");
				}else if(seed==1){
					System.out.print(x+"+"+y+"-"+z+"=");
				}else if(seed==2){
					System.out.print(x+"-"+y+"+"+z+"=");
				}else if(seed==3){
					System.out.print(x+"-"+y+"-"+z+"=");
				}
				int k=stdIn.nextInt();
				if(k==question){
					System.out.println("正解！！");
					break;
				}
				System.out.println("違いますよ！！");
			}
		}while(confirmRetry());
	}
}

