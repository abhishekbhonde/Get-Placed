class parent{

	int x =10;
	static int y =20;

	static {
		System.out.println("Parent Static Bloc");
	}

	parent(){

		System.out.println("In constructor");
	}

	void methodOne(){

		System.out.println(x);
	}

	static void methodTwo(){

		System.out.println(y);
	}
}

class child extends parent{

	static {

		System.out.println("In child static block");
	}

	child(){

		System.out.println("In child constructor");
	}
}

class client{

	public static void main(String [] args){

		child obj = new child();
		obj.methodOne();
		obj.methodTwo();
	}
}

