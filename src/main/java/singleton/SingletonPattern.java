package singleton;

import singleton.samples.*;

/**
 *
 * Thread Safe Singleton Samples
 *
 * @author umut.bayram
 */
public class SingletonPattern {

    public static void main(String args[]) {

        /**
         *  Eager initialization instance test
         */
        SingletonEagerInitialization singletonEagerInitialization1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization singletonEagerInitialization2 = SingletonEagerInitialization.getInstance();

        if (singletonEagerInitialization1.equals(singletonEagerInitialization2))
            System.out.println("Same object. (Eager Initialization)");
        else
            System.out.println("Not same object. (Eager Initialization)");

        /**
         *  Static blok initialization instance test
         */
        SingletonStaticBlockInitialization singletonStaticBlockInitialization1 = SingletonStaticBlockInitialization.getInstance();
        SingletonStaticBlockInitialization singletonStaticBlockInitialization2 = SingletonStaticBlockInitialization.getInstance();

        if (singletonStaticBlockInitialization1.equals(singletonStaticBlockInitialization2))
            System.out.println("Same object. (Static Block Initialization)");
        else
            System.out.println("Not same object. (Static Block Initialization)");


        /**
         *  Lazy initialization instance test
         */
        SingletonLazyInitialization singletonLazyInitialization1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization singletonLazyInitialization2 = SingletonLazyInitialization.getInstance();

        if (singletonLazyInitialization1.equals(singletonLazyInitialization2))
            System.out.println("Same object. (Lazy Initialization)");
        else
            System.out.println("Not same object. (Lazy Initialization)");

        /**
         *  Lazy initialization optimization instance test
         */
        SingletonLazyInitializationOptimization singletonLazyInitializationOptimization1   = SingletonLazyInitializationOptimization.getInstance();
        SingletonLazyInitializationOptimization singletonLazyInitializationOptimization2 = SingletonLazyInitializationOptimization.getInstance();

        if (singletonLazyInitializationOptimization1.equals(singletonLazyInitializationOptimization2))
            System.out.println("Same object. (Lazy Initialization Optimization)");
        else
            System.out.println("Not same object. (Lazy Initialization Optimization)");

        /**
         *  Enum instance test
         */
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

        if (singletonEnum1.equals(singletonEnum2))
            System.out.println("Same object. (Enum)");
        else
            System.out.println("Not same object. (Enum)");

    }

}
