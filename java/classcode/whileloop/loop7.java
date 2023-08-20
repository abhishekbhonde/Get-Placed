class loop7{
	public static void main(String [] args){

		int sum = 0;
		int rem;
		int n = 6531;
		while ( n!=0){
			rem = n %10;
			n = n / 10;
			sum = sum + rem;
		}
		System.out.println(sum);
	}
}

