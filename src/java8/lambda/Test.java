package java8.lambda;

public class Test extends Thread{
	
	public volatile boolean exit = false;
	
	@Override
    public void run() {
        while(!exit){
        	int size=(int) ((int)10*Math.random());
        	System.out.println(size);
        	if(size==5){
        		try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		System.err.println("exit");	
        	}
        	System.out.println("size "+size);
        }
    }
	
	public static void main(String[] args) {
		Test t=new Test();
		t.start();
	}

}
