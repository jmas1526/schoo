import java.util.Scanner;

class Exercise7_27 {

  static boolean addMatrix(int[][] x,int[][] y,int[][] z) {
    if(x.length != y.length || y.length != z.length)
      return false;
    else{
      for(int i=0;i<x.length;i++)
        if(x[i].length != y[i].length || y[i].length != z[i].length)
          return false;
        for(int i=0;i<x.length;i++)
          for(int j=0;j<x[i].length;j++)
            z[i][j] = x[i][j] + y[i][j];
        return true;
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int[][] x = {{1,2,3},{4,5,6}};
    int[][] y = {{1,2,3},{4,5,6}};
    int[][] z = new int[2][3];

/*Confilm    
    int[][] x = {{1,2,3},{4,5,6}};
    int[][] y = {{1,2,3},{4,5,6}};
    int[][] z = new int[2][4];
*/
    System.out.println(addMatrix(x,y,z)?"true":"false");

    if(addMatrix(x,y,z)==true)
    for(int[] i:z){
      for(int j:i)
        System.out.printf("%3d",j);
      System.out.println();
    }
  }
}
