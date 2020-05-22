import java.util.Scanner;

class Exercise6_5{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n=stdIn.nextInt();
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			
			//read 
			System.out.print("a["+i+"] = ");
			a[i]=stdIn.nextInt();
			
		}
		
		//print initializer
		System.out.print("a = {");
			
		for(int i=0;i<n;i++){
			
			System.out.print(a[i]);
			
			if(i<n-1){
				System.out.print(", ");
			}
		}
		
		System.out.println("}");
	}
}

			