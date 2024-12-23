package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        billPughSingleton.display();
        DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
        doubleCheckLockingSingleton.display();
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        eagerInitializedSingleton.display();
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        lazyInitializedSingleton.display();
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        staticBlockSingleton.display();
        ThreadSafeLazyInitializedSingleton threadSafeLazyInitializedSingleton = ThreadSafeLazyInitializedSingleton.getInstance();
        threadSafeLazyInitializedSingleton.display();
    }
}
