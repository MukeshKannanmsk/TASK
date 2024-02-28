package mytestrunner;
import mycars.*;
import mybirds.*;

public class TestRunner {
	public static void main(String[] args) {
		Swift swift = new Swift();
		swift.setYearOfMake(2012);
		swift.setEngineNumber("TN84");
		swift.setCarType("Hatchback");
		swift.setSeats(5);
		swift.setAirbags(2);
		swift.setModel("Swift ZXI Plus");
		swift.setColor("Red");
		System.out.println("SWIFT");
		System.out.println("Year of Make:"+swift.getYearOfMake());
		System.out.println("Engine number:"+swift.getEngineNumber());
		System.out.println("Car type:"+swift.getCarType());
		System.out.println("Number of seats:"+swift.getSeats());
		System.out.println("number of Airbags:"+swift.getAirbags());
		System.out.println("Model name:"+swift.getModel());
		System.out.println("color:"+swift.getColor());
		
		SCross scross = new SCross();
		scross.setSeats(7);
		scross.setAirbags(1);
		scross.setModel("Alpha AT");
		scross.setColor("Blue");
		System.out.println("SCross");
		System.out.println("Number of seats:"+scross.getSeats());
		System.out.println("number of Airbags:"+scross.getAirbags());
		System.out.println("Model name:"+scross.getModel());
		System.out.println("color:"+scross.getColor());
		
		XUV xuv = new XUV();
		xuv.setCarType("mahendra");
		scross.setCarType("Maruti");
		myCar(xuv);
		myCar(swift);
		myCar(scross);
		
		mySwift(swift);
		
		Car carobj = new Swift();
		mySwift((Swift)carobj);
		
		scross.maintenance();
		Car scrossobj = new SCross();
		scrossobj.maintenance();
		Car car = new Car();
		car.maintenance();
		swift.maintenance();
		
		//XUV xuv1 = new XUV();
		
 	ParrotMod parrot = new ParrotMod();	
 	parrot.fly();
 	parrot.speak();
 	Duck duck = new Duck();
 	duck.fly();
 	duck.speak();
		
		
	
 }

	public static void myCar(Car car) {
		if (car instanceof Swift) {
		    System.out.println("Car type:HAtch");
	    } else if (car instanceof SCross) {
			System.out.println("Car type:Seden");
		} else if (car instanceof XUV) {
			System.out.println("Car type:SUV");
		} else System.out.println("unknown");
		
		
	}
	
	public static void mySwift(Swift swift) {
		System.out.println("car came");
	}

}
