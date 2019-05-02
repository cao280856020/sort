package structures.singleton;

public class Singleton {

	private Singleton(){};
	
	public static volatile Singleton INSTANCE=null;
	
	public static Singleton get(){
		
		
		if(INSTANCE==null){
			synchronized(Singleton.class){
				if(INSTANCE==null){
					System.out.println(Thread.currentThread().getName()+"   aaa");
					INSTANCE=new Singleton();
				}
			}
		}
		
		return INSTANCE;
	}
	
}
