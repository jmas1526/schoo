class Exercise5_7{
	public static void main(String[]args){
		
		for(int i=0;i<=1000;i++){
			
			float x1 = (float)i/1000;
			float x2 = (x1 * x1);
			
			System.out.printf("%.7f   %.7f\n",x1,x2);
		}
	}
}
