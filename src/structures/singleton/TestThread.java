package structures.singleton;

import java.util.UUID;

public class TestThread implements Runnable {

	
	@Override
	public void run() {
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		
	}

}
