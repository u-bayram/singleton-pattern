package singleton.samples;

/**
 * @author umut.bayram
 */
public class SingletonStaticBlockInitialization {

    private static SingletonStaticBlockInitialization singletonStaticBlockInitialization;

    static {
        try {
            singletonStaticBlockInitialization = new SingletonStaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Singleton class couldn't created");
        }
    }

    private SingletonStaticBlockInitialization() {

    }

    public static SingletonStaticBlockInitialization getInstance() {
        return singletonStaticBlockInitialization;
    }

}
