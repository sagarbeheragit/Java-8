package tricky;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        // Private constructor
    }
    public static Singleton getInstance() {
        if(instance != null){
            return instance;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
