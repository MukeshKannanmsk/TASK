package mycars;

public class Car {
	private int yearOfMake;
	private String engineNumber;
	private String carType;
	    
	   public Car() {
	   
	   }
	
       public Car(String myString) {
    	   System.out.println(myString);
        }
       
	   public int getYearOfMake() {
	       return yearOfMake;
	    }
	   public String getEngineNumber() {
	       return engineNumber;
	    }
	   public String getCarType() {
	       return carType;
	    }
	
	   public void setYearOfMake(int yearOfMake) {
	       this.yearOfMake = yearOfMake;
	    }
	   public void setEngineNumber(String engineNumber) {
	      this.engineNumber = engineNumber;
	    }
	   public void setCarType(String carType) {
	       this.carType = carType;
	    }
	   
	   public void maintenance() {
		   System.out.println("car is under maintenance");
	   }


}
