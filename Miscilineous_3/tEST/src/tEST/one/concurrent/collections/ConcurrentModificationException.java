package tEST.one.concurrent.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ConcurrentModificationException {
	
	public static void main(String[] args) {
		List<String> str = new Vector<>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
		Iterator<String> it = str.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(temp.equals("c")) {
				it.remove();
			}
			System.out.println(temp);
			str.remove(2);
			
		}
		
		System.out.println(str);

		

		
	}
	
	

}
