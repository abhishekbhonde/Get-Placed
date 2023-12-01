abstract class parent{

		void fun(){

			print("In abstract class");
		}

		void marry();
}

class client {

	public static void main(String [] args){

		parent obj = new parent();	// ERROR : you cannot make the object of the abstract class
	}
}

