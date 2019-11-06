package singleton.samples;

/**
 * @author umut.bayram
 */
public class SingletonLazyInitializationOptimization {

    private static SingletonLazyInitializationOptimization singletonLazyInitializationOptimization;

    private SingletonLazyInitializationOptimization() {

    }

    public static SingletonLazyInitializationOptimization getInstance() {
        if (singletonLazyInitializationOptimization == null) {
            synchronized (SingletonLazyInitializationOptimization.class) {
                if (singletonLazyInitializationOptimization == null)
                    singletonLazyInitializationOptimization = new SingletonLazyInitializationOptimization();
            }
        }
        return singletonLazyInitializationOptimization;
    }
}
