package pojotask;

public class MyPojoTask {
	
	 private String myString;
	    private int myInt;

	    public MyPojoTask() {
	    	
	    }

	    public MyPojoTask(String myString, int myInt) {
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


}
