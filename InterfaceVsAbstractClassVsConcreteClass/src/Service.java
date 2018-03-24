
public interface Service {
	
	void method1(); // public abstract void method1(); 
	
	abstract void method2(); // public abstract void method2(); 
	
	default void method3() {
		System.out.println("method 3");
	}
	
	static void method4() {
		System.out.println("method 4");
	}

}

// 1. Abstract Method: Method which does not have body.
// 2. Concrete Method: Method which has body.
// 3. Can a interface have concrete method? No (Prior to Java 8) Java 8 supports methods to have body in interface with default/static keywords