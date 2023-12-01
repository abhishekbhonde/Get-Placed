 class MultChildThread extends Thread {

    public void run(){
        System.out.println("MultiThread :"+ Thread.currentThread().getName());
    }
    
}

class Demo extends Thread{
    public void run(){
        System.out.println("Demo :" + Thread.currentThread().getName());

        MultChildThread obj = new MultChildThread();
        obj.start();
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        System.out.println("ThreadDemo:" + Thread.currentThread().getName());
        Demo obj = new Demo();
        obj.start();
    }
}
