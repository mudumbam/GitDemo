package polymorphism;

public class MethodOverriding2  extends MethodOverriding1 {
	
	int a1=12345;
	int b1=23456;
	public void red() {
		// TODO Auto-generated method stub
		
		System.out.println("jai balayya");
		
	}

	
	public void green() {
		// TODO Auto-generated method stub
		
		System.out.println("jai mahesh babu");
		
	}

	
	public void yellow() {
		// TODO Auto-generated method stub
		
		System.out.println("jai powerstar");
		
	}
	
	public void blue() {
		
		System.out.println("jai chennakeshava");
	}
	

	public void pink() {
		
		System.out.println("jai nagarjuna");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		MethodOverriding2  obj =new MethodOverriding2();
//	System.out.println(	obj.a1);
//	System.out.println(	obj.b1);
//		obj.red();
//		obj.green();
//		obj.blue();
//		obj.yellow();
//		obj.pink();
		
		
		//	obj1.pink();
		MethodOverriding1  obj3 =new MethodOverriding1();
		System.out.println(	obj3.a1);
		System.out.println(	obj3.b1);
			obj3.red();
			obj3.green();
			obj3.blue();
			obj3.yellow();
		//	obj3.pink();
		

	}

}
