import java.io.*;


class pattern3{
	 	
	 public static void main(String [] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows");

		int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {
                int x = row-i+1;
                for (int j = row; j>=i; j--) {
                        System.out.print(x*i + "");
                        x--;
                }
                System.out.println();
        }
    
     }
    }