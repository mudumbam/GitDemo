package staticvariables;

public class Static1 {
	
	String name; //instance variables
	String address;
public	static  String  city="telengana"; //class variables
static int i=0;
	
	Static1(String name,String address){
		
		this.name=name; //local variables
		this.address=address;
		i++;
		System.out.println(i);
	//	this.city=city;
	}
	
	public void getData() {
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
	}
	
	public static void getCity() {
		
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1 st=new Static1("manoj","hyd");
		st.getData();
		Static1.getCity();
		Static1 st2=new Static1("kutha","andhra");
		st.getData();
		Static1.getCity();
		

	}

}
