package parse;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class RandomIdUtil {
	private static AtomicInteger counter = new AtomicInteger(0);
	
	public static String getRandomCode() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static String getRandomNumber() {
        if (counter.get() > 999999) {
            counter.set(1);
        }
        long time = System.currentTimeMillis();
        long returnValue = time * 100 + counter.incrementAndGet();
        return String.valueOf(returnValue);
    }
    
//	public static void main(String[] args) {
//		System.out.println(getRandomCode());
//	}
}
