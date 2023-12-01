class outer{

	class inner{

		void m1(){

			System.out.println("This is m1 ");
		}
	}

	void m2(){

		System.out.println("In m2 method");
	}
}

class client{

	public static void main(String [] args){

		outer obj = new outer();
		obj.m2();

		outer.inner obj1 = obj.new inner();
		outer.inner obj2 = new outer().new inner();  // you can make make objects of both class like this rather than making different objects
		obj1.m1();
	}
}
