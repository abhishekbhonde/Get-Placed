class multidigits{
	public static void main(String [] args){
		int sum = 0;
		int n = 135;
		int rem;
		while(n!=0){
			rem = n %10;
			n = n/10;
			sum = sum * rem;

		}
		System.out.println(sum);
	}
}
