package com.bm.threds;

public class MainApp2 {
//	public class MainApp2 implements Runnable {

	public static void main(String[] args) {

//		Runnable t1 = new MainApp2();
//		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new UiThread());
		Thread t2 = new Thread(new RemoteThread());
//		Thread t2 = new Thread(new MainApp2());

		t1.setName("UiThread");
		t2.setName("RemoteThread");
		t1.start(); // Register thread with scheduler
		t2.start(); // Register thread with scheduler
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		process5();

		System.out.println("Main Thread Executed!!!");
	}

	static void process5() {
		System.out.println("Final Task :");
		System.out.println("Process 5");
	}

//	public void run() {
////		if (Thread.currentThread().getName().equals("UiThread")) {
////			System.out.println(Thread.currentThread().getName());
////			process1();
////			process2();
////		} else {
////			System.out.println(Thread.currentThread().getName());
////			process3();
////			process4();
////		}
//	}

}
