class MyThread extends Thread {

	public void run(){

		for(int i =0; i<10;i++){

			System.out.println("In Thread-0");
		}
	}
}

class ThreadDemo{

	public static void main(String [] args)throws InterruptedException{
		System.out.println(Thread.currentThread());
		MyThread obj = new MyThread();
		obj.start();
                Thread.sleep(10);

		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Abhishek");
		System.out.println(Thread.currentThread());
		for(int i =0; i<10;i++){
			System.out.println("In main");
		}
	}
}
