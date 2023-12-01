 class PriorityThread extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
class ThreadDemo1{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        PriorityThread obj1 = new PriorityThread();
        obj1.start();
        t.setPriority(7);
        System.out.println(t.getPriority());

        PriorityThread obj2 = new PriorityThread();
        obj2.start(); 
    }
}