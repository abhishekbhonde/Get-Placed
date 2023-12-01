package java.Exception;

class Demo{

    void m1(){
        System.out.println(10/2);
        m2();
    }

    void m2(){
            System.out.println("This is m2");
    }

}

class client{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.m1();
    }
}
