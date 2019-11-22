public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {}

	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance == null){
			System.out.println("creating instance");
			instance = new ThreadSafeSingleton();
		}

		return instance;
	}

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					System.out.println("creating instance from getInstanceUsingDoubleLocking");
					instance = new ThreadSafeSingleton(); 
				}
			}
		}
		return instance;
	}
}