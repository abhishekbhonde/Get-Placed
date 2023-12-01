class outer{

    void m1(){
            System.out.println("In m1-outer");

        class Inner{

            void m1(){
                System.out.println("In m1_inner");
            }

        }
        Inner obj = new Inner();
        obj.m1();
    }
}

class client{
    public static void main(String[] args) {
        outer obj1 = new outer();
        obj1.m1();
    }
}
