package singleton.samples;

/**
 * @author umut.bayram
 */
public class SingletonEagerInitialization {

    private final static SingletonEagerInitialization singletonEagerInitialization = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {

    }

    public static SingletonEagerInitialization getInstance() {
        return singletonEagerInitialization;
    }


}
