package com.xworkz.data;

public class MultiThread extends Thread {

	private int threadNumber;

	public MultiThread(int threadNumber) {
		System.out.println("created " + this.getClass().getSimpleName());

		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+"  from Thread  "+threadNumber);
			if(threadNumber==3) {
			throw new RuntimeException();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
