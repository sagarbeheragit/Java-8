package tricky;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Other methods needs Singleton class to modify accordingly. So those are not really a way to break it without modifiing the Singleton.
 * - By Clone - This needs Singleton class to implement Cloneable interface. And override clone method.
 * - By implementing the Serializable interface
 */
public class SingletonBreakerReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        System.out.println(singleton1 == singleton);
    }
}
