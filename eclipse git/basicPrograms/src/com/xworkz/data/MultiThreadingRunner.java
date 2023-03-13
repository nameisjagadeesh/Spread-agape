package com.xworkz.data;

/*
 * multiThreading is the ability to excecute multiple paths of code at the same time.
 * 2 ways to create thread- writing one class extending thread class and othe way by implementing runnable interface.
 * if we extend thread we cant extend other class 
 * but there is no guarantee which thread is created first
 * if we throw exception in perticular thread ,other threads will continue
 */
public class MultiThreadingRunner {

	public static void main(String[] args) {
		
//		MultiThread multiThread=new MultiThread();
//		MultiThread multiThread2=new MultiThread();
//		multiThread.start(); //to kickof new thread brand new one
//		multiThread2.start(); //runs two threads
		//here if we invoke run method ,it will not do parallel execution.
		
		//Or using for loop
		
		for(int i=0; i<6 ;i++) {
			MultiThread multiThread=new MultiThread(i);
			multiThread.start();
			try {
				multiThread.join();  //Waits for this another thread to die.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
