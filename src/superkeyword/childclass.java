package superkeyword;

public class childclass extends parentclass {

	
	String name="manojclickacademy";
	
	public childclass() {
		super();
		System.out.println("child class constructor");
	}
	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
public void getData() {
		super.getData();
		System.out.println("iam child class");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclass cd=new childclass();
		cd.getStringdata();
		cd.getData();
		
		

	}

}
