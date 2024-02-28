package mystringbuildertester;
import mystringbuildertask.StringBuilderTask;
import java.util.Scanner;
import ownexception.CustomException;
import java.util.InputMismatchException;


public class StringBuilderTester {
 public static void main(String...args) throws CustomException {
 StringBuilderTask obj = new StringBuilderTask();
 Scanner input = new Scanner(System.in);
  boolean condition=true;
   
  System.out.println("1)to create a StringBuilder print the length & the final String "
  		+ "\n2)to add 4 Strings to it & each String separated by a “#” & print the length & the final String "
  		+ "\n3)to insert another String in between those two Strings "
  		+ "\n4)to delete a string from string builder of two strings "
  		+ "\n5)replace space as \"-\" in string builder of threee strings "
  		+ "\n6)to reverse a string builder of three strings "
  		+ "\n7)to delete the character from given index "
  		+ "\n8)to replace character as \"XYZ\" in a stringbuilder "
  		+ "\n9)to find the first index of \"#\" "
  		+ "\n10)to find the last index of \"#\"  "
  		+ "\n11)Quit ");
  
 while(condition) 
 {
  try {
 System.out.print("\n Enter the question no:");
 int select = input.nextInt();
 input.nextLine();
 switch(select) 
 {
 
 case 1:
      StringBuilder myBuilder = new StringBuilder();
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder));
      System.out.print("Enter the String:");
      String myString=input.nextLine();
      myBuilder = obj.appendString(myBuilder,"",myString);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");
      break;
 case 2:
      System.out.print("Enter the String:");
      myBuilder = new StringBuilder(input.nextLine());
      System.out.print("Enter no of strings should be added:");
      int noOfStringBuilder = input.nextInt();
      input.nextLine();
      System.out.print("Enter delimeter:");
      String myDelimiter = input.nextLine();
      String[] stringsToAppend = new String[noOfStringBuilder];
        for (int i = 0; i < noOfStringBuilder; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringsToAppend[i] = input.nextLine() ; 
        }
        myBuilder = obj.appendString(myBuilder, myDelimiter, stringsToAppend);
      int lengthOfBuilder = obj.lengthOfBuilder(myBuilder);
      System.out.println("length of StringBuilder:"+lengthOfBuilder + "\n final string is \" " + myBuilder + " \" ");
      break;  
 case 3:
      System.out.print("Enter the 1st String:");
      myBuilder = new StringBuilder(input.nextLine());
      String space = " ";
      System.out.print("Enter the 2nd String:");
      myString = input.nextLine();
      myBuilder = obj.appendString(myBuilder,space,myString); 
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder)+"\n the stringbuilder is \" " + myBuilder + " \" ");     
      int insertPosition = obj.lastIndexOf(myBuilder.toString(),space);  
      System.out.print("enter the string to be inserted:");
      myString = input.nextLine();
      myBuilder = obj.insert(myBuilder,space+myString,insertPosition);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");
      break;
 case 4:
      System.out.print("Enter the 1st String:");
      myBuilder = new StringBuilder(input.nextLine());
      space = " ";
      System.out.print("Enter the 2nd String:");
      myString = input.nextLine();
      myBuilder = obj.appendString(myBuilder,space,myString); 
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder)+"\n the string builder is \" " + myBuilder + " \" "); 
      insertPosition = obj.lastIndexOf(myBuilder.toString(),space);  
      System.out.print("enter string number to be deleted:");
      int stringNumber = input.nextInt();
      if (stringNumber == 1) {   
      myBuilder = obj.delete(myBuilder,0,insertPosition+1); }
      else if (stringNumber == 2 ) {
      myBuilder = obj.delete(myBuilder,insertPosition,obj.lengthOfBuilder(myBuilder)); }
      else System.out.println("enter the correct number,the entered num doesn't exist");
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");
      break; 
 case 5:
      System.out.print("Enter the 1st String:");
      myBuilder = new StringBuilder(input.nextLine());
      space = " ";
      System.out.print("Enter the 2nd String:");
      myString = input.nextLine();
      System.out.print("Enter the 3rd String:");
      String myString2 = input.nextLine();
      myBuilder = obj.appendString(myBuilder,space,myString,myString2);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder)+"\n the string builder is \" " + myBuilder+ " \" "); 
      insertPosition = obj.indexOf(myBuilder.toString(),space);
      int replacePosition = obj.lastIndexOf(myBuilder.toString(),space);
      System.out.print("Enter the new character:");
      myString = input.nextLine();
      myBuilder = obj.replace(myBuilder,myString,insertPosition,insertPosition+1);
      myBuilder = obj.replace(myBuilder,myString,replacePosition,replacePosition+1);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");
      break; 
case 6:
      System.out.print("Enter the 1st String:");
      myBuilder = new StringBuilder(input.nextLine());
      space = " ";
      System.out.print("Enter the 2nd String:");
      myString = input.nextLine();
      System.out.print("Enter the 3rd String:");
      myString2 = input.nextLine();
      myBuilder = obj.appendString(myBuilder,space,myString,myString2);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder)+"\n the string builder is \" " + myBuilder + " \" "); 
      myBuilder = obj.reverse(myBuilder);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");
      break; 
 case 7:
      System.out.print("Enter the String:");
      myBuilder = new StringBuilder(input.nextLine());  
      System.out.println("length of StringBuilder:"+ obj.lengthOfBuilder(myBuilder));  
      System.out.print("Enter the 1st index:");
      int firstIndex = input.nextInt();
      System.out.print("Enter the last index:");
      int lastIndex = input.nextInt();     
      myBuilder = obj.delete(myBuilder,firstIndex,lastIndex); 
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");
      break; 
 case 8:
      System.out.print("Enter the String:");
      myBuilder = new StringBuilder(input.nextLine());  
      System.out.println("length of StringBuilder:"+ obj.lengthOfBuilder(myBuilder));  
      System.out.print("Enter the 1st index:");
      firstIndex = input.nextInt();
      System.out.print("Enter the last index:");
      lastIndex = input.nextInt(); 
      input.nextLine();
      System.out.print("Enter the string to be replaced:");  
      myString = input.nextLine();
      myBuilder = obj.replace(myBuilder,myString,firstIndex,lastIndex); 
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder) + "\n final string is \" " + myBuilder + " \" ");        
      break;     
 case 9:
      System.out.print("Enter the 1st String:");
      myBuilder = new StringBuilder(input.nextLine());
      System.out.print("Enter the between character:");
      space = input.nextLine();
      System.out.print("Enter the 2nd String:");
      myString = input.nextLine();
      System.out.print("Enter the 3rd String:");
      myString2 = input.nextLine();
      myBuilder = obj.appendString(myBuilder,space,myString,myString2);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder)+"\n the string builder is \" " + myBuilder + " \" ");    
      firstIndex = obj.indexOf(myBuilder.toString(),space);
      System.out.println("The first index of "+space+ " is " + firstIndex);
      break;  
 case 10:        
      System.out.print("Enter the 1st String:");
      myBuilder = new StringBuilder(input.nextLine());
      System.out.print("Enter the between character:");
      space = input.nextLine();
      System.out.print("Enter the 2nd String:");
      myString = input.nextLine();
      System.out.print("Enter the 3rd String:");
      myString2 = input.nextLine();
      myBuilder = obj.appendString(myBuilder,space,myString,myString2);
      System.out.println("length of StringBuilder:"+obj.lengthOfBuilder(myBuilder)+"\n the string builder is \" " + myBuilder + " \" ");    
      lastIndex = obj.lastIndexOf(myBuilder.toString(),space);
      System.out.println("The last index of "+space+ " is " + lastIndex);
      break;                 
 case 11:
      condition = false;
      break;
    }
   } catch (CustomException cex){
       cex.printStackTrace(); 
    } catch (InputMismatchException iex) {
       iex.printStackTrace(); 
      System.out.println("enter the correct input"); 
      input.nextLine();
      }
  } input.close();
 }      
}          

      
