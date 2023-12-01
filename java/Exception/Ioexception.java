import java.io.*;
class Demo{

        void getData()throws Exception{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int data = Integer.parseInt(br.readLine());
                System.out.println(data);
        }
                public static void main(String [] args)throws Exception{

                        Demo obj = new Demo();
                        obj.getData();
                }
}

