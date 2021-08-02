package constructors;

public class Constructor1 {
	
	
	public  Constructor1(int a,int b) {
		
		int c=a+b;
		
		System.out.println(c);
		
	}
	
public  Constructor1(String str) {
		
		
		
		System.out.println(str);
		
	}
public  Constructor1() {
	
	
	
	System.out.println("default constructor");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor1 c1=new Constructor1();
	//	Constructor1 c2=new Constructor1(2,3);
	//	Constructor1 c3=new Constructor1("manoj");

	}

}
