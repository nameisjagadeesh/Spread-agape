package com.xworkz.data;

public class CopyConstructorRunner {

	public static void main(String[] args) {
		CopyConstructor constructor=new CopyConstructor();
		CopyConstructor copy=new CopyConstructor(constructor);//FQN
		System.out.println(copy);
	}

}
