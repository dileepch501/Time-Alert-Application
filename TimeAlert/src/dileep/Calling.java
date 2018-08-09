package dileep;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Calling {
	//String val1,val2;
	public void Timer(String nam1,String nam2){
		
		String val1,val2;
		val1=nam1;
		val2=nam2;
		
		System.out.println("parameter1 receved"+val1);
		System.out.println("parameter 2 receved"+val2);
		for(;;)
		{
			String ss1=val1;
			String ss2=val2;
			String currentTime = new SimpleDateFormat("HH.mm").format(new Date());
			String timeToCompare = ss1;
			//System.out.println(timeToCompare);
			boolean x = currentTime.equals(timeToCompare);
			if(x== true)
			{
				//System.out.println(ss2);
				JOptionPane.showMessageDialog(null,ss2,"Time is"+ss1,JOptionPane.INFORMATION_MESSAGE);
		
				break;
			}
			//else
			//{
			//	System.out.println("time is not equal");
			//}
		}
	}

}
