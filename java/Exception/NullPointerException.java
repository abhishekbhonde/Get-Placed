class Demo{
	
	void m1(){
		System.out.println("This is m1 method");
	}
	void m2(){
		System.out.println("This is m2 method");
	}

}
class client{
	public static void main(String [] args){

		Demo obj = new Demo();
		obj.m1();
		obj = null;
		obj.m2();
		System.out.println("End main");
	}
}


