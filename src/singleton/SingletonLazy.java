package singleton;
public class SingletonLazy {
	
	private static volatile SingletonLazy instance;
	
	/*
	 * public static synchronized SingletonLazy getInstance() { if (instance ==
	 * null) { instance = new SingletonLazy(); }
	 * 
	 * return instance; }
	 */
	
	public static SingletonLazy getInstance() {
		if (instance == null) {
			synchronized(SingletonLazy.class) {
				if(instance==null)
				instance = new SingletonLazy();
			}
		}
		
		return instance;
	}
	
	private SingletonLazy() {
		System.out.println("this is lazy instantiation");
	}

}
