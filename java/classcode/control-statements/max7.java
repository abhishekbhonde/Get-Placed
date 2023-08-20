class max7{
	public static void main(String [] args){

		int x = 15;

		if(x%3==0 && x%5==0){

			System.out.println("Both are divisible");
		}
		else if(x%3==0){
			System.out.println("Divisible by 3");
		}
		else if(x%5==0){
			System.out.println("Divisible by 5");
		}
		else {
			System.out.println("Not divisible by both");
		}
	}
}
