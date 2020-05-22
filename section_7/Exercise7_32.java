import java.util.Scanner;

class Exercise7_32 {

  static void printBits(byte x) {
	 for(int i=7;i>=0;i--)
		 System.out.print(((x>>>i&1)==1)?"1":"0");
	 System.out.println();
  }
  
  static void printBits(short x) {
	  for(int i=15;i>=0;i--)
			 System.out.print(((x>>>i&1)==1)?"1":"0");
	  System.out.println();
  }
  
  static void printBits(int x) {
	  for(int i=31;i>=0;i--)
			 System.out.print(((x>>>i&1)==1)?"1":"0");
	  System.out.println();
  }
  
  static void printBits(long x) {
	  for(int i=63;i>=0;i--)
			 System.out.print(((x>>>i&1)==1)?"1":"0");
	  System.out.println();
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("byteŒ^®”F");
    byte a=stdIn.nextByte();
    printBits(a);
    
    System.out.print("shortŒ^®”F");
    short b=stdIn.nextShort();
    printBits(b);
    
    System.out.print("intŒ^À”F");
    int c=stdIn.nextInt();
    printBits(c);
    
    System.out.print("longŒ^À”F");
    long d=stdIn.nextLong();
    printBits(d);
  }
}
