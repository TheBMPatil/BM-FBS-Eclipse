package com.bm.threds;

public class RemoteThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		process3();
		process4();
	}

	private void process3() {
		System.out.println("Process 3");
	}

	private void process4() {
		System.out.println("Process 4");
	}

}
