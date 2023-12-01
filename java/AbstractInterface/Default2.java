interface Demo1{

	default void fun(){

		System.out.println("This is default-Demo1 fun");
	}

}

interface Demo2{

	default void fun(){

		System.out.println("This is default-Demo2 fun");
	}

}

class child implements Demo1, Demo2{

}

class client{

	public static void main(String [] args){

		child obj = new child();
		obj.fun();                // Error: By default keyword both method gets inheriated. But we are calling that method. Child class gets confused which method to call. That's why it gives error
					  // Solution : solution is that method should not get inheriated. For that static keyword is introduced.
					  //
	}
}
