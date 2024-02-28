package singleton;

public class SingletonEager {
	
private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        System.out.println("this is early instantiation");
    }
    
    public static SingletonEager getInstance() {
        return instance;
    }
  
}
