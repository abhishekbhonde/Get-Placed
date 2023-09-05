import java.util.*;
import java.io.*;
class userArray{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int [4];

		for (int i = 0; i<=arr.length-1;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
	}

}
