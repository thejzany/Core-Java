package com.jsp.multithreading;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
