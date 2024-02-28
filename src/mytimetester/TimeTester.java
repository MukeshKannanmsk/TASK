package mytimetester;
import mytimetask.TimeTask;
import java.time.zone.ZoneRulesException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ownexception.CustomException;

public class TimeTester {

	public static void main(String[] args) {
		TimeTask obj = new TimeTask();
		
		Scanner input = new Scanner(System.in);
		  boolean condition=true;

		 System.out.println("1. Return the currentTime with Date, seconds etc\n"
		 		+ "2. Return the currentTime in milliseconds. Using System class as well.\n"
		 		+ "3. Return the currentTime with Date,seconds in New york & London.\n"
		 		+ "4. Return the week day for the currentTime in millis or any given time in millis\n"
		 		+ "5. Return the month(not numeric) of the currentTime in millis or any given time\n"
		 		+ "6. Return the Year of the currentTime in millis or any given time in millis\n"
		 		+ "7. Quit");

		 while(condition) 
		 {
         try {
		 System.out.print("\n Enter the question no:");
		 int select = input.nextInt();
		 input.nextLine();
		 switch(select) 
		 {
		 case 1:
			 System.out.println(obj.currentTimeDate());
			 break;
		 case 2:
			 System.out.println(obj.currentTimeInMilliseconds());
			 break;
		 case 3:
			 System.out.println("enter the zone1 :");
			 String myString1 =input.nextLine();
			 System.out.println("enter the zone2 :");
			 String myString2 =input.nextLine();
			 System.out.println(obj.zoneTimeDate(myString1));
			 System.out.println(obj.zoneTimeDate(myString2));
			 break;
		 case 4:
			 System.out.println("enter 1 for current time");
			 System.out.println("enter 2 for user time");
			 int choice = input.nextInt();
			 input.nextLine();
			 if(choice==1) {
				 long millis = obj.currentTimeInMilliseconds();
				 System.out.println("enter the zone :");
				 String myString =input.nextLine();
				 System.out.println(obj.day(millis,myString));
			 } else if (choice ==2) {
				 System.out.println("enter the zone :");
				 String myString =input.nextLine();
				 System.out.println("enter the time in milliseconds");
				 long millis = input.nextLong();
				 System.out.println(obj.day(millis,myString)); 
			 } else System.out.println("enter either 1 or 2");
			 break;
		 case 5:
			 System.out.println("enter 1 for current time");
			 System.out.println("enter 2 for user time");
			 choice = input.nextInt();
			 input.nextLine();
			 if(choice==1) {
				 long millis = obj.currentTimeInMilliseconds();
				 System.out.println("enter the zone :");
				 String myString =input.nextLine();
				 System.out.println(obj.month(millis,myString));
			 } else if (choice ==2) {
				 System.out.println("enter the zone :");
				 String myString =input.nextLine();
				 System.out.println("enter the time in milliseconds");
				 long millis = input.nextLong();
				 System.out.println(obj.month(millis,myString)); 
			 } else System.out.println("enter the either 1 or 2");
			 break;
		 case 6:
			 System.out.println("enter 1 for current time");
			 System.out.println("enter 2 for user time");
			 choice = input.nextInt();
			 input.nextLine();
			 if(choice==1) {
				 long millis = obj.currentTimeInMilliseconds();
				 System.out.println("enter the zone :");
				 String myString =input.nextLine();
				 System.out.println(obj.year(millis,myString));
			 } else if (choice ==2) {
				 System.out.println("enter the zone :");
				 String myString =input.nextLine();
				 System.out.println("enter the time in milliseconds");
				 long millis = input.nextLong();
				 System.out.println(obj.year(millis,myString)); 
			 } else System.out.println("enter the either 1 or 2");
			 break;
		 case 7:
			 condition = false;
			 break;	 
		 }
		 
	 } catch (CustomException cex) {
		 System.out.print("error occured "+ cex.getMessage());
	 } catch (InputMismatchException iex) {
		 System.out.println("enter crct input " + iex.getMessage());
		 input.nextLine();
	 } catch (ZoneRulesException zex) {
			System.out.println("refer the zone crctly"+ zex.getMessage());
		} 
		 }    
        input.close();
	}

}
