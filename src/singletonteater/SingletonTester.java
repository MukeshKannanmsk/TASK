package singletonteater;

import singleton.SingletonLazy;
import singleton.SingletonBillPugh;
import singleton.SingletonEager;
import singleton.SingletonEnum;

public class SingletonTester {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				SingletonLazy obj1 =SingletonLazy.getInstance();
				System.out.println(obj1.hashCode());
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				SingletonLazy obj2 =SingletonLazy.getInstance();
				System.out.println(obj2.hashCode());
			}
		});
		
		thread1.start();
		thread2.start();
		
		
		SingletonLazy obj1 =SingletonLazy.getInstance();
		System.out.println(obj1.hashCode());
        SingletonLazy obj2 =SingletonLazy.getInstance();
		
		System.out.println(obj2.hashCode());
		
		SingletonEnum obj3 = SingletonEnum.INSTANCE;
		obj3.myString = "welcome";
		System.out.println(obj3.hashCode());
		obj3.print();
		
		SingletonEnum obj4 = SingletonEnum.INSTANCE;
		obj4.myString = "hi";
		System.out.println(obj4.hashCode());
		obj3.print();
		
		SingletonEager obj5 =SingletonEager.getInstance();
		System.out.println(obj5.hashCode());
		
		SingletonBillPugh obj6 =SingletonBillPugh.getInstance();
		System.out.println(obj6.hashCode());
	}

}
