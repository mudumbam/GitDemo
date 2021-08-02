package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(0,"hello");
		hm.put(1,"hello");
		hm.put(2,"hello");
		hm.put(3,"hello");
		hm.put(4,"hello");
		hm.put(null,null);
		hm.put(null,null);
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		
		Set sn =hm.entrySet();
		Iterator i = sn.iterator();
		while(i.hasNext()) {
			
		Map.Entry mp =(Map.Entry)i.next();
	System.out.println(	mp.getKey() +"" + mp.getValue());
	
}
		

	}

}
