import java.util.Scanner;

class Exercise7_28 {

  static int[][] addMatrix(int[][] x,int[][] y) {
	  int[][] z =new int[x.length][];
	  for(int i=0;i<x.length;i++) {
		  z[i]=new int[x[i].length];
		  for(int j=0;j<x[i].length;j++) {
			  z[i][j]=x[i][j]+y[i][j];
		  }
	  }
	  return z;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int[][] x = {{1,2,3},{4,5,6}};
    int[][] y = {{1,2,3},{4,5,6}};
    int[][] z;
    
    z=addMatrix(x,y);
    for(int i=0;i<x.length;i++) {
    	for(int j=0;j<x[i].length;j++) {
    		
    		System.out.print(z[i][j]+" ");
    	}
    	System.out.println();
    }
  }
}