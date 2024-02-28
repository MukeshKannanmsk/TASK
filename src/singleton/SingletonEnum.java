package singleton;

public enum SingletonEnum {
	
	INSTANCE;
	
	public String myString;
	
	public void print() {
		System.out.println(myString);
	}

}
