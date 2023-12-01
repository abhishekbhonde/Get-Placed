class Defence{
	
	int noOfDept = 3;	

	Defence(){
		

		System.out.println("To protect India");
	}
	
	void DefenceProp(){

		System.out.println("All requirements");
	}
}
class Army extends Defence{
		
	Army(){
		System.out.println("To Protect Army  India");
	}
}

class client{
	public static void main(String [] args){

		Army obj = new Army();
		obj.DefenceProp();
	}
}
