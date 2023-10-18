class Demo1{

	int x =10;

	Demo1(){
		System.out.println("No args");
	}

	Demo1(int x){
		System.out.println("Para");
	}

	Demo1(Demo1 xyz){
		System.out.println("Para Demo");
	}

	public static void main(String [] args){
		Demo1 obj = new Demo1();
		Demo1 obj1= new Demo1(10);
		Demo1 obj2 = new Demo1(obj1);
	}
}

