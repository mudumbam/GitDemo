package collectionframework;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String>hm=new Hashtable<Integer,String>();
		hm.put(0,"hello");
		hm.put(1,"hello");
		hm.put(2,"hello");
		hm.put(3,"hello");
		hm.put(4,"hello");
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
