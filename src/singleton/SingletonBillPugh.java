package singleton;

public class SingletonBillPugh {
	
    private SingletonBillPugh() {
        System.out.println("hello");
    }

    private static class SingletonHolder {
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHolder.instance;
    }
}