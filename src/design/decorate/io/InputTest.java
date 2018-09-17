package design.decorate.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		String fileName="C://Users/win10/git/sort/src/design/decorate/io/test.txt";
		File file=new File(fileName);
		try {
			InputStream in=new LowerInputStream(file);
			while((c=in.read())>=0){
				System.out.print(c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
