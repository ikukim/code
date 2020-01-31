package string;

import java.util.ArrayList;
import java.util.Iterator;


public class a {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); 
		list.add("A");
		list.add("B");
		list.add("C");
		
		for (String
				i : list) { 
		    System.out.println(i);
		    
		    
		    
    
		}
		
		Iterator<String> it = list.iterator();
	    while (it.hasNext()) {
	        System.out.println(it.next());
	    }
	    
	}
}
