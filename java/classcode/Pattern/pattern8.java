class pattern8{
	public static void main(String [] args){
		int n=4;
		for(int i =1; i<=n; i++){
			for(int j =1; j<=n; j++){
				if(j%2==0){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
