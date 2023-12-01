abstract class parent{

	void career(){

		System.out.println("Software Engineer");
	}

	abstract void marry();
}

class child extends parent{

	void marry(){

		System.out.println("Disha Patni");
	}
}

class client{

	public static void main(String [] args){

		child obj = new child();
		obj.career();
		obj.marry();
	}
}
