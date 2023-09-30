package com.jsp.multithreading;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 500; i >=1; i--) {
			System.out.println(i);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
