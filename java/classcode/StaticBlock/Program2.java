public class Program2 {

        int x = 10;
        static int y = 20;
        static{
            System.out.println("In static block 1");
        }
        public static void main(String[] args) {

            Program2 obj = new Program2();
            System.out.println(obj.x);

        }
        static{
            System.out.println("in static block 2");
            System.out.println(y);
        }
}
