package design.iterator;

import java.util.Iterator;

public class DinerMenu {

	private static final int MAX=6;
	
	MenuItem[] item;
	
	public Iterator createIterator(){
		return new DinerMenuIterator(item);
	}
}
