package thiskeyword;

public class This1 {

	
	int a=2;
	 
	public void getData() {
		
		int a=3;
		
	int b=	a+this.a;
	System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This1 t=new This1();
	t.getData();

	}

}
