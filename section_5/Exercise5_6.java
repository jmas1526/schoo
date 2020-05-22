class Exercise5_6{
	public static void main(String[]args){
		
		float sum1=0.0F;
		float sum2=0.0F;
		
		System.out.println("  flost        int   ");
		System.out.println("---------------------");

		for(float x=0.0f, y=0.0f;x<=1.0F;x+=0.001F,y++){
			
			float y2=(float)y/1000;
			System.out.printf("%.7f"+"   "+"%.7f\n",x,y2);
		}
	}
}

