// javac Main.java -encoding utf-8 & java Main

// if you want to fetch annotation value
import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Test2 {
	String value();
}

public class Main {

	// 這個 Annotation 定義在 Test.java 內
	// @Test("test value")
	@Test2("test2 value")
	// public static void main(String[] args){
	public static void main(String[] args) throws NoSuchMethodException {
		Method[] m = Main.class.getMethods();
		System.out.println(m.length);
		
		for(Method pm:m){
			if(pm.getName()=="main"){
				Test2 bb = pm.getAnnotation(Test2.class);
				System.out.println(bb);
				System.out.println(bb.value());
			}
		}

		System.out.println("----------------------------");
		
		// 不需要 throws NoSuchMethodException
		// 這樣寫沒有 Try-Catch 將會跳錯。
		// Java 不允許沒有處理到的 Exception 所以要用 Try-Catch 防範, 或在 main Method 後面加 throws Exception {}
		try{
			Method m2 = Main.class.getMethod("main", String[].class);
			Test2 bb2 = m2.getAnnotation(Test2.class);
			System.out.println(bb2);
			System.out.println(bb2.value());
			
		}
		catch(NoSuchMethodException e){
			System.out.println(e.toString());
		}

		System.out.println("----------------------------");

		// 需要 throws NoSuchMethodException
		Method m2 = Main.class.getMethod("main", String[].class);
		Test2 bb2 = m2.getAnnotation(Test2.class);
		System.out.println(bb2);
		System.out.println(bb2.value());
	}
}
