
class MyThread extends Thread{
    MyThread(ThreadGroup tg,String str){
        super(tg,str);
    }

    public void run(){
        System.out.println(Thread.currentThread());
    }
}


 class ThreadGroupDemo {
    
    public static void main(String[] args) {
        ThreadGroup pThreadGP = new ThreadGroup("India");

        MyThread obj1 = new MyThread(pThreadGP, "Maha");
        MyThread obj2 = new MyThread(pThreadGP, "Goa");
        MyThread obj3 = new MyThread(pThreadGP, "Kolkatta");
        obj1.start();
        obj2.start();
        obj3.start();
    }   
        

}
