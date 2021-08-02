package abstractclasses;

public class ConcreteChildClass extends ParentAbstractClass {
	
	int z=200;
	public void blue() {
		
		System.out.println("its blue please see and go");
		
	}
	
public void pink() {
		
		System.out.println("its pink halt the vehicle");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteChildClass c= new ConcreteChildClass();
		c.green();
		c.red();
		c.yellow();
		c.pink();
		c.blue();
		
		ParentAbstractClass p = new ConcreteChildClass();
		p.green();
		p.yellow();
		p.blue();
		p.red();
		System.out.println(p.z);
		System.out.println(c.z);
	}

}
