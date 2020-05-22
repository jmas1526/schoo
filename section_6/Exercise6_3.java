class Exercise6_3{
	public static void main(String[]args){
		
		double []a=new double[5];
		
		for(int i=0;i<a.length;i++){
			a[i]=(i+1)*1.1;
			System.out.printf("a["+i+"]=%.1f\n",a[i]);
		}
	}
}