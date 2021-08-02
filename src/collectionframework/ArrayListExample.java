package collectionframework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//they can accept the duplicate values	
		//array has fixed size array list grow dynamically
		
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> a1 = new ArrayList<String>();
		a.add("manoj");
		a.add("radha");
		a.add("meena");
		a.add("tejaswi");
		a.add("tejaswi");
		a.add("doll");
		a.add(0,"kutha");
		a.remove(0);
		a.remove("meena");
	//	a.removeAll(a);
		System.out.println(a);
	System.out.println(a.get(2));
if(	a.contains("kutha")) {
	System.out.println("it is present in the array");
}

else {
	System.out.println("it is not  present in the array");
	
}
	
if(	a.isEmpty()) {
	System.out.println("array is empty");
}

else {
	System.out.println("array is not  empty");
	
}

System.out.println(a.indexOf("kutha"));

System.out.println(a.size());

for(int i=0;i<a.size();i++) {
	
	if(a1.contains(a.get(i))) 
		continue;
		else
		a1.add(a.get(i));	
}

System.out.println(a1);
		

	}

}
