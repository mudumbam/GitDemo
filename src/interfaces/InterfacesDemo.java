package interfaces;

public class InterfacesDemo implements TrafficLights {
	
	int a1=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficLights obj=new InterfacesDemo();
		InterfacesDemo obj1=new InterfacesDemo();
		obj.green();
		obj.red();
		obj.yellow();
		obj1.blue();
		System.out.println(obj.a);
		System.out.println(obj1.a1);

	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		
		System.out.println("its red please stop");
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		
		System.out.println("its green please go");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		
		System.out.println("its yellow please ready to go");
		
	}
	
	public void blue() {
		
		System.out.println("its blue please go with 100 speed");
	}

}
