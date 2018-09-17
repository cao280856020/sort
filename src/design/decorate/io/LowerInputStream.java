package design.decorate.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LowerInputStream extends FileInputStream {
	
	public LowerInputStream(File file) throws FileNotFoundException {
		super(file);
	}
	public int read()throws IOException{
		int c= super.read();
		return (c==-1?c:Character.toLowerCase(c));
	}
	public int read(byte[] b,int off,int len)throws IOException{
		int result=super.read(b, off, len);
		for(int i=off;i<off+result;i++){
			b[i]=(byte) Character.toLowerCase(b[i]);
		}
		return result;
	}
}
