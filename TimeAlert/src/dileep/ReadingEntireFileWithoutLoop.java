package dileep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
    	Calling obj=new Calling();
    	
     String name;
    
    		
        File file = new File("data.txt");
        try {
        Scanner sc = new Scanner(file);
       
        sc.useDelimiter(";");
        
        while(sc.nextLine() != null){
        	 
        	name=sc.next();
        System.out.println(name);
        if(name.contains(":"))
        {
        	String[] parts = name.split(":");
        	String part1=parts[0];
        	String part2=parts[1];
        	obj.Timer(part1,part2);
        	//System.out.println(part1);
        	//Thread.sleep(5000);
        	//System.out.println(part2);
        }
       Thread.sleep(1000);
        
        }
        sc.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        
    	}
    }
}
