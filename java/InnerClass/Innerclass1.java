class outer{
    class Inner{
        void m1(){

            System.out.println("This is m1-inner class");
        }
    }
    void m2(){
        System.out.println("This is m2-outer class");
    }
}

class client{

    public static void main(String[] args) {
        outer obj = new outer();
        obj.m2();
        outer.Inner obj1 = obj.new Inner();
        obj1.m1();
    }

}