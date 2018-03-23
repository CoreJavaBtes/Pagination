package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Anupam");
		hs.add("Anupam");
		hs.add("Deepika");
		
		list.add("java");
		list.add("C++");
		list.add("PHP");
		
		list1.add("Amrit");
		list1.add("Deepika");
		list1.add("Yatin");
		
		list.addAll(list1);
		
		hs.addAll(list);
		
		Collections.sort(list);
		for(String al : list)
		{
			System.out.println(al);
		}
		/*for(int i = 0; i<list.size(); i++)
		{
			System.out.println("Values :: "+list.get(i));
		}
		*/
		
		
	}

}
