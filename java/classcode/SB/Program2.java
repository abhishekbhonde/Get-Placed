import java.lang.*;

class stringbufferdemo{

	public static void main(String [] args){

		StringBuffer sb = new StringBuffer();

		sb.append("Abhishek");

		System.out.println(sb.capacity());

		System.out.println(sb);

		sb.append("Bhonde JSPM");
			
		System.out.println(sb.cpacity());

		System.out.println(sb);
	}

}
