// javac Main.java -encoding utf-8 & java Main

// if you want to fetch annotation value
import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Test2 {
	String value();
}

public class Main{

	// 這個 Annotation 定義在 Test.java 內
	// @Test("test value")
	@Test2("test2 value")
	public static void main(String[] args){
		Method[] m = Main.class.getMethods();
		System.out.println(m.length);
        
		// Method m = Main.class.getMethod("main");
		
		for(Method pm:m){
			if(pm.getName()=="main"){
				Test2 bb = pm.getAnnotation(Test2.class);
				System.out.println(bb);
				System.out.println(bb.value());
			}
		}
	}
}
