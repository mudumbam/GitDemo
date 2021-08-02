package dateclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d= new Date();
	System.out.println(d.toString());
	SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
	SimpleDateFormat sdf1=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
	System.out.println(sdf.format(d).toString());
	System.out.println(sdf1.format(d).toString());
	}

}
