interface Demo1{

	default void gun(){

		System.out.println("THis is gun method in default demo1");
	}

}

interface Demo2{

	default void gun(){

		System.out.println("This is gun method in default demo2");
	}
}

class child implements Demo1,Demo2{

	public void gun(){

		System.out.println("This is gun method in child class");
	}
}
class client{

	public static void main(String [] args){

		child obj = new child();
		obj.gun();
	}}

