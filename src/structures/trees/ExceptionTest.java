package structures.trees;

public class ExceptionTest {

	public static void s()throws Exception{
		try{
			throw new RuntimeException("1");
		}catch(Exception e){
			throw e;
		}finally{
			throw new Exception("2");
		}
	}
	
	public static void main(String[] args) {
		try {
			s();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
