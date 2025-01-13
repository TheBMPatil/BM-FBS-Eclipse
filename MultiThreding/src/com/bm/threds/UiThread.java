package com.bm.threds;

public class UiThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		process1();
		process2();
	}

	private void process1() {
		System.out.println("Process 1");
	}

	private void process2() {
		System.out.println("Process 2");
	}
}
