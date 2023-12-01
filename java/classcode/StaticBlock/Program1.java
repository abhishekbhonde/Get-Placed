class Demo{


        static{
                System.out.println("In static block 1");
        }
        public static void main(String[] args) {

            System.out.println("In main");

        }

        static{
            System.out.println("In static block 2");
        }
}