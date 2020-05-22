import java.util.Scanner;

class Exercise7_33 {

  static void printArray(int[] a) {
	 for(int i=0;i<a.length;i++) {
		 System.out.print(a[i]+" ");
	 }
  }
  
  static void printArray(int[][] a) {
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<a[i].length;j++) {
			  System.out.printf("%-6d",a[i][j]);
		  }
		  System.out.println();
	  }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("1次元配列の要素数：");
    int n=stdIn.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++) {
    	System.out.print("a["+i+"]=");	
    	a[i]=stdIn.nextInt();
    }
    printArray(a);
    System.out.println();
    

    System.out.println("2次元配列の行数：");
    int row=stdIn.nextInt();
    int[]column=new int[row];
    int[][] b=new int[row][];
    for(int i=0;i<row;i++) {
    	System.out.print(i+"行目の列数：");
    	column[i]=stdIn.nextInt();
    	b[i]=new int[column[i]];
    }
    for(int i=0;i<row;i++) {
    	for(int j=0;j<column[i];j++) {
    		System.out.print("b["+i+"]["+j+"]=");
    		b[i][j]=stdIn.nextInt();
    	}
    }
    printArray(b);
  }
}

