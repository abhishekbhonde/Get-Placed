class Demo{

	int x =10;
	 
	Demo(){
		System.out.println("In Constructor");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(this);
	}

	void fun(){

		System.out.println(this);
		System.out.println(this.x);
		System.out.println(x);
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		obj.fun();
		System.out.println(obj);
	}
}

