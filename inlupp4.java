import java.io.*;
import java.util.*;

public class inlupp4 {
	 
	   static int antalA=0;
	   static int antalAndroid=0;
	   
	   static char ch;
	   static char ch2;

	   	 
	   public static String COMMA_DELIMITER = ",";
			   
	 	public static void main(String[] args) {
	 			
		List<List<String>> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("C:\\sample.csv"), "UTF-8")) {
				while (scanner.hasNextLine()) {
				  records.add(recordLine(scanner.nextLine()));
				}
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(List<String> s:records){ 
			//System.out.println(s);  
			
		}
		
		System.out.println("--------------------------------");
		System.out.println("totalt personer som arbetar med Android: "+antalAndroid);
		System.out.println("antal personer med bokstaven [A]: "+ antalA); 

		
} //main	
	//***************************************************
	 static List<String> recordLine(String line) {
		
		 List<String> Value = new ArrayList<String>();
		
		 try (Scanner sc = new Scanner(line)) {
			sc.useDelimiter(COMMA_DELIMITER);
			while (sc.hasNext()) {	Value.add(sc.next());	}
			
			
			
		 
		
		 //Name group member G1 & G2------	
	     ArrayList<String> arrayG1 = new ArrayList<String>();
	     ArrayList<String> arrayG2 = new ArrayList<String>();
	    
	     arrayG1.add (Value.get(1)); //System.out.println( arrayG1);
	     arrayG2.add (Value.get(2)); //System.out.println(arrayG2);	
	     
	        
	        for (int i=0; i < arrayG1.get(0).length(); i++) {
	            ch =arrayG1.get(0).charAt(0);
	            ch2 =arrayG2.get(0).charAt(0);
	        }//for loop
	        		if (  ch == 'A' ){
	        			antalA++;
	        			//System.out.println(arrayG1+" is in the list");
	        		} 
	        		else if (  ch2 == 'A'  ) {
	        			antalA++;

	        		    //System.out.println(arrayG2+" is in the list");
	        	    }
	       
			
			//timestamp lista----------------
	       	     ArrayList<String> timeStamp = new ArrayList<String>();
	       	     ArrayList<String> timeStamp2 = new ArrayList<String>();

	        		//System.out.println(Value.get(0)); 
	        		timeStamp.add(Value.get(0));
	        		System.out.println(Value.get(0)); 

	        		int antalLika=0;
	        	for (int i=0; i < Value.get(0).length(); i++) {
	        		
	        		if (  timeStamp.contains("11/27/2012 3:55:25") ){
	        			
	        			antalLika=i;
	        			System.out.println(antalLika);
	        			//nej det blir fel...måste veta hur söka row element
	        	    }
	        	}
	        	
			
			 //android work lista -------------------
				 
					if (Value.get(6).equals("Android App") ) {
						antalAndroid++;
						//System.out.println(Value.get(6)); 
					}
				
			// *******************************************
				
						

		}// ------- try ----- 	

		return Value;
		
	}

}