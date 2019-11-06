package singleton.samples;

/**
 * @author umut.bayram
 */
public class SingletonLazyInitialization {

    private static SingletonLazyInitialization singletonLazyInitialization;

    private SingletonLazyInitialization() {

    }

    public static synchronized SingletonLazyInitialization getInstance() {
        if (singletonLazyInitialization == null)
            singletonLazyInitialization = new SingletonLazyInitialization();
        return singletonLazyInitialization;
    }

}
