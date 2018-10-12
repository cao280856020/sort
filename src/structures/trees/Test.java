package structures.trees;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;

public class Test {
	public static void target(int i){
		new Exception("#"+i).printStackTrace();
	}
	public static void main(String[] args) throws Exception {
		Class<?> klass=Class.forName("structures.trees.Test");
		Method method=klass.getMethod("target", int.class);
//		for(int i=0;i<2_00_0;i++){
//			method.invoke(null, i);
//		}\
		System.out.println(Integer.valueOf("20")==2_0.0);
		Object list=Array.newInstance(Test.class, 10);
		System.out.println(list);
	}

}
