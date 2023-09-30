package com.jsp.multithreading;

public class ThreadDriver {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();

		Thread t = new Thread(t1);// approach1-implements runnable
		t.start();

		MyThread2 t2 = new MyThread2();// approach2-extends runnable
		t2.start();

	}

}
