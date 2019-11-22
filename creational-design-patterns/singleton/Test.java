public class Test {
	public static void main(String[] args) {
		System.out.println("EagerInitializedSingleton : " + EagerInitializedSingleton.getInstance());
		System.out.println("EagerInitializedSingleton : " + EagerInitializedSingleton.getInstance());

		System.out.println("++++++++++++++");
		System.out.println("StaticBlockSingleton : "+ StaticBlockSingleton.getInstance());
		System.out.println("StaticBlockSingleton : "+ StaticBlockSingleton.getInstance());

		System.out.println("++++++++++++++");
		System.out.println("LazyInitializedSingleton : "+ LazyInitializedSingleton.getInstance());
		System.out.println("LazyInitializedSingleton : "+ LazyInitializedSingleton.getInstance());

		System.out.println("++++++++++++++");
		System.out.println("ThreadSafeSingleton : "+ ThreadSafeSingleton.getInstance());
		System.out.println("ThreadSafeSingleton : "+ ThreadSafeSingleton.getInstance());

		System.out.println("++++++++++++++");
		System.out.println("ThreadSafeSingleton getInstanceUsingDoubleLocking : "+ ThreadSafeSingleton.getInstanceUsingDoubleLocking());
		System.out.println("ThreadSafeSingleton getInstanceUsingDoubleLocking : "+ ThreadSafeSingleton.getInstanceUsingDoubleLocking());

		System.out.println("++++++++++++++");
		System.out.println("BillPughSingleton : "+ BillPughSingleton.getInstance());
		System.out.println("BillPughSingleton : "+ BillPughSingleton.getInstance());
		String[] args1 = {"1", "2"}; 
		System.out.println("++++++++++++++");
		ReflectionSingletonTest.main(args1);
		
		System.out.println("++++++++++++++");
		SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

	}
}