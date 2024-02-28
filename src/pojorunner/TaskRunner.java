package pojorunner;

import pojotask.MyTask;
import pojotask.PojoTask;

public class TaskRunner {

	public static void main(String[] args) {
		MyTask obj1 = new MyTask("hello");
		System.out.println(obj1);
		
		PojoTask obj2 = new PojoTask("hi",5);
		System.out.println(obj2);
		
		obj2.setMyString("hello buddy");
		obj2.setMyInt(7);
		System.out.println(obj2.getMyString());
		System.out.println(obj2.getMyInt());
		try {
		 Class<?> myClass = Class.forName("pojotask.MyPojoTask");
		 
		  Object obj4 = myClass.getDeclaredConstructor().newInstance();
		 
		  Object obj3 = myClass.getDeclaredConstructor(String.class,int.class).newInstance("welcome",10);
		 
		 String myString = (String) myClass.getDeclaredMethod("getMyString").invoke(obj3); 
		 System.out.println(myString);
		 int myInt = (int) myClass.getDeclaredMethod("getMyInt").invoke(obj3); 
		 System.out.println(myInt);
		 
		 myClass.getDeclaredMethod("setMyString",String.class).invoke(obj4, "come on");
		 System.out.println((String) myClass.getDeclaredMethod("getMyString").invoke(obj4));
		
		} catch (ReflectiveOperationException rex) {
		    System.out.println("error occured"+rex.getMessage());
		}
		
	}

}
