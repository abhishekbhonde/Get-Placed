interface Demo{

	default void gun(){

		System.out.println("This is default gun");
	}

	void fun();
}

class child implements Demo{

	public void fun(){

		System.out.println("This is fun");
	}
}

class client{

	public static void main(String[] args){

		child obj = new child();
		obj.gun();
		obj.fun();
	}
}
