interface Demo{

	void gun();
	void fun();
}

class child implements Demo{

	public void gun(){
		System.out.println("In gun method");
	}

	public void fun(){
		System.out.println("In fun Method");
	}
}

class client{

	public static void main(String [] arg){

		child obj = new child();
		obj.gun();
		obj.fun();
	}
}
