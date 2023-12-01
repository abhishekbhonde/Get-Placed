class parent{

	int x =10;
	static int y =20;

	parent(){
		System.out.println("In parent constructor");
	}

}

class child extends parent{

	int x =100;
	static int y =200;

	child(){
		System.out.println("In child constructor");
	}

	void access(){

		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	}
}

class client{

	public static void main(String []args){

		child obj = new child();
		obj.access();
	}
}
