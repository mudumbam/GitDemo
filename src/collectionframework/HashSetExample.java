package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//elements not stored in sequence order stores in random order
		HashSet<String>hs=new HashSet<String>();
		hs.add("manoj");
		hs.add("manoj");
		hs.add("kutha");
		hs.add("ghajini");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator interface in hashset
		
	Iterator<String>i=hs.iterator();
	
while(i.hasNext()) {
		
		System.out.println(i.next());
	}
	
	
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
	while(i.hasNext()) {
		
		System.out.println(i.next());
	}
	
		

	}

}
