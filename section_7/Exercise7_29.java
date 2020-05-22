import java.util.Scanner;

class Exercise7_29 {

  static int[][] aryClone2(int[][] x) {
	  int[][] y =new int[x.length][];
	  for(int i=0;i<x.length;i++) {
		  y[i]=new int[x[i].length];
		  for(int j=0;j<x[i].length;j++) {
			  y[i][j]=x[i][j];
		  }
	  }
	  return y;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int[][] x = {{1,2,3},{4,5,6}};
    int[][] y;
    
    y=aryClone2(x);
    for(int i=0;i<x.length;i++) {
    	for(int j=0;j<x[i].length;j++) {
    		
    		System.out.print(y[i][j]+" ");
    	}
    	System.out.println();
    }
  }
}