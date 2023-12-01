interface Demo{

	void gun();
	void fun();
}

abstract class child implements Demo{

	public 	void gun(){

		System.out.println("In gun method");
	}

}

class Demochild extends child {

	public 	void fun(){

		System.out.println("In fun method");
	}

}
class client{
	public static void main(String [] args){
	Demochild obj = new Demochild();
	obj.gun();
	obj.fun();
}
}
