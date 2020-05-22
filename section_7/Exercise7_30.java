import java.util.Scanner;

class Exercise7_30 {

  static int min(int a,int b) {
	  return a>b?b:a;
  }
  
  static int min(int a,int b,int c) {
	  int min=a;
	  if(b<min) min=b;
	  if(c<min) min=c;
	  return min;
  }
  
  static int min(int[] a) {
	  int min=a[0];
	  for(int i=1;i<a.length;i++) {
		  if(a[i]<min) min=a[i];
	  }
	  return min;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("整数aとbの最小値を求めます。");
    System.out.print("a：");
    int a=stdIn.nextInt();
    System.out.print("b：");
    int b=stdIn.nextInt();
    System.out.println(min(a,b));
    
    System.out.println("整数xとyとzの最小値を求めます。");
    System.out.print("x：");
    int x=stdIn.nextInt();
    System.out.print("y：");
    int y=stdIn.nextInt();
    System.out.print("z：");
    int z=stdIn.nextInt();
    System.out.println(min(x,y,z));
    
    System.out.println("配列aの最小値を求めます。");
    System.out.print("要素数：");
    int n=stdIn.nextInt();
    int[] A=new int[n];
    for(int i=0;i<n;i++) {
    	System.out.print("A["+i+"]=");
    	A[i]=stdIn.nextInt();
    }
    System.out.println(min(A));
  }
}
