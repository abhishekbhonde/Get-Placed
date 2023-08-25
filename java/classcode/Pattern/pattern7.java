class pattern7{
	public static void main(String [] args){
		char ch = 'A';
		int num = 1;
		for(int i =1 ; i<=4; i++){
			for(int j=1; j<=4; j++){
				if(j%2==0){
					System.out.print(num++ + " ");
				}
				else{
					System.out.print(ch++ + " ");
				}
				
			}
			System.out.println();

		}
	}
}
