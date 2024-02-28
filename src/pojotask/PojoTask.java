package pojotask;

public class PojoTask {
	
	 private String myString;
	    private int myInt;

	    public PojoTask() {
	    	
	    }

	    public PojoTask(String myString, int myInt) {
	        this.myString = myString;
	        this.myInt = myInt;
	    }

	    public String getMyString() {
	        return myString;
	    }

	    public void setMyString(String myString) {
	        this.myString = myString;
	    }

	    public int getMyInt() {
	        return myInt;
	    }

	    public void setMyInt(int myInt) {
	        this.myInt = myInt;
	    }
	    
	    public String toString() {
	        return myString+","+myInt ;
	    }

}
