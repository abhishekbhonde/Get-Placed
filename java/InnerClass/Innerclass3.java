class outer{

    void m2(){
        System.out.println("This is outer class");
    }
    static class Inner{
        void m1(){
            System.out.println("This is static ineer class");
        }
    }
}

class client{
        public static void main(String[] args) {
            outer.Inner obj = new outer.Inner();
            obj.m1();
            
        }
}
