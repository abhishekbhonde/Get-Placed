class ICC{
	
	ICC(){
		System.out.println("In ICC constructor");
	}

}

class BCCI extends ICC{

	BCCI(){

		System.out.println("In BCCI constructor");
	}
}

class client{

	public static void main(String [] args){

		BCCI obj = new BCCI();
	}
}

