class perfectnum{
	public static void main(String [] args){
		int n = 6;
		int temp =n;
		int sum =0;

		for( int i =1; i<n; i++){
			int rem = n%10;
			sum = sum +rem;
			n = n/10;
		}
		if(temp == sum){
			System.out.println(temp + "is a perfect number");
		}
		else{
			System.out.println(temp + "is not a perfect number");
		}
	}
}
