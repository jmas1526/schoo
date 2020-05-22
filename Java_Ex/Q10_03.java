import java.util.Scanner;

class Q10_03 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		int i1 = 0;
		int i2 = 1;
		int i3 = 2;
		long l1 = 0;
		long l2 = 1;
		long l3 = 2;
		float f1 = 0;
		float f2 = 1;
		float f3 = 2;
		double d1 = 0;
		double d2 = 1;
		double d3 = 2;
		System.out.println("intMax�F" + MinMax.max(i1,i2,i3));
		System.out.println("intgMin�F" + MinMax.min(i1,i2,i3));
		System.out.println("longMax�F" + MinMax.max(l1,l2,l3));
		System.out.println("longMin�F" + MinMax.min(l1,l2,l3));
		System.out.println("floatMax�F" + MinMax.max(f1,f2,f3));
		System.out.println("floatMin�F" + MinMax.min(f1,f2,f3));
		System.out.println("doubleMax�F" + MinMax.max(d1,d2,d3));
		System.out.println("doubleMin�F" + MinMax.min(d1,d2,d3));
		int[] a = {1,2,5,4,3};
		long[] b = {1,2,5,4,3};
		float[] c = {1,2,5,4,3};
		double[] d = {1,2,5,4,3};
		System.out.println("aMax�F" + MinMax.max(a));
		System.out.println("aMin�F" + MinMax.min(a));
		System.out.println("bMax�F" + MinMax.max(b));
		System.out.println("bMin�F" + MinMax.min(b));
		System.out.println("cMax�F" + MinMax.max(c));
		System.out.println("cMin�F" + MinMax.min(c));
		System.out.println("dMax�F" + MinMax.max(d));
		System.out.println("dMin�F" + MinMax.min(d));
		
	}
	
}

class MinMax{
	public static int min(int x, int y){
		return x < y ? x : y;
	}
	
	public static long min(long x, long y){
		return x < y ? x : y;
	}
	
	public static float min(float x, float y){
		return x < y ? x : y;
	}
	
	public static double min(double x, double y){
		return x < y ? x : y;
	}
	
	public static int min(int x, int y, int z){
		return min(min(x,y),z);
	}
	
	public static long min(long x, long y, long z){
		return min(min(x,y),z);
	}
	
	public static float min(float x, float y, float z){
		return min(min(x,y),z);
	}
	
	public static double min(double x, double y, double z){
		return min(min(x,y),z);
	}
	
	public static int min(int[] a){
		int min = a[0];
		for(int i : a){
			min = min(min,i);;
		}
		return min;
	}
	
	public static long min(long[] a){
		long min = a[0];
		for(long i : a){
			min = min(min,i);;
		}
		return min;
	}
	
	public static float min(float[] a){
		float min = a[0];
		for(float i : a){
			min = min(min,i);;
		}
		return min;
	}
	
	public static double min(double[] a){
		double min = a[0];
		for(double i : a){
			min = min(min,i);;
		}
		return min;
	}
	//////////////////////////////
	public static int max(int x, int y){
		return x > y ? x : y;
	}
	
	public static long max(long x, long y){
		return x > y ? x : y;
	}
	
	public static float max(float x, float y){
		return x > y ? x : y;
	}
	
	public static double max(double x, double y){
		return x > y ? x : y;
	}
	
	public static int max(int x, int y, int z){
		return max(max(x,y),z);
	}
	
	public static long max(long x, long y, long z){
		return max(max(x,y),z);
	}
	
	public static float max(float x, float y, float z){
		return max(max(x,y),z);
	}
	
	public static double max(double x, double y, double z){
		return max(max(x,y),z);
	}
	
	public static int max(int[] a){
		int max = a[0];
		for(int i : a){
			max = max(max, i);
		}
		return max;
	}
	
	public static long max(long[] a){
		long max = a[0];
		for(long i : a){
			max = max(max, i);
		}
		return max;
	}
	
	public static float max(float[] a){
		float max = a[0];
		for(float i : a){
			max = max(max, i);
		}
		return max;
	}
	
	public static double max(double[] a){
		double max = a[0];
		for(double i : a){
			max = max(max, i);
		}
		return max;
	}
}
