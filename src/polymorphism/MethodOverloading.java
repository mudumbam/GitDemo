package polymorphism;

public class MethodOverloading {
	
	public void A(int a,int b) {
		
		System.out.println(a+b);
		
	}
public void B(int a,int b,int c) {
	System.out.println(a+b+c);
	}
public void C(String a,String b) {
	
	System.out.println(a.concat(b));
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.A(20,30);
		obj.B(20,30,40);
		obj.C("manoj","nikitha");
		

	}

}
