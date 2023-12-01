interface Demo1{
	int x =10;
	void fun();
}

class Demochild implements Demo1{

	public void fun(){

		System.out.println(x);
		System.out.println(Demo1.x);
	}
}

class client{

	public static void main(String [] args){

		Demo1 obj = new Demochild();
		obj.fun();
	}
}
