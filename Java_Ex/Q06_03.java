class Q06_03 {
	public static void main(String[] args){
		double[] d = new double[5];
		
		for(int i = 0; i < d.length; i++) {
			d[i] = 1.1 * (i + 1);
			System.out.printf("d[%d] = %.1f\n",i ,d[i]);
		}
	}
}
