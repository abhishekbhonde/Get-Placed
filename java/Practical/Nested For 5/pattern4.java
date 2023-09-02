import java.io.*;


class pattern4{
	 	
	 public static void main(String [] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        System.out.println("Even num: ");

        for (int i = end; i>=start; i--) {

            if(i%2==0){
                System.out.print(i + "");
            }
        }
            System.out.println();
            System.out.println("Odd num");
            for (int i =start; i <=end; i++) {
                if(i%2==1){
                    System.out.print(i + "");
                }
            }
        System.out.println();
     }

    }