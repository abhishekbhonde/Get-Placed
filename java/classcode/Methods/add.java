import java.util.*;
class add {
	
	static void addi(int a , int b){

		int ans = a+b;
		System.out.println(ans);
	}
	 static void mult(int a , int b){

                int ans = a*b;
                System.out.println(ans);
        }
	 static void div(int a , int b){

                int ans = a/b;
                System.out.println(ans);
        }
	 static void sub(int a , int b){

                int ans = a-b;
                System.out.println(ans);
        }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		addi(a,b);
		mult(a,b);
		div(a,b);
		sub(a,b);
	}
}
