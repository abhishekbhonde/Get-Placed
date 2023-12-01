 class MultiChildRunnable implements Runnable {
    public void run(){
        System.out.println("In run");
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        MultChildThread obj = new MultChildThread();
        Thread t = new Thread(obj);
        t.start();
    }
}