package mystringtester;
import mystringtask.StringTask;
import java.util.Scanner;
import java.util.Arrays;
import ownexception.CustomException;

public class StringTester {
 public static void main(String[] args) throws CustomException {
 StringTask obj = new StringTask();
 Scanner input = new Scanner(System.in);
  boolean condition=true;

 System.out.println("1)To find String Length "
 		+ "\n2)To convert String to character Array "
 		+ "\n3)To find the character at last but one "
 		+ "\n4)To find no of occurrence "
 		+ "\n5)To find greatest position of given letter "
 		+ "\n6)To print last five letters of a string "
 		+ "\n7)To print first three letters of a string "
 		+ "\n8)To replace the first three letters by XYZ "
 		+ "\n9)To check whether String starts with 'ent' "
 		+ "\n10)To check whether String ends with 'le' "
 		+ "\n11)To convert the String to Uppercase "
 		+ "\n12)To convert the String to Lowercase "
 		+ "\n13)To reverse a String "
 		+ "\n14)To accept multiple String "
 		+ "\n15)To remove the space "
 		+ "\n16)To enclose a string in string array "
 		+ "\n17)To merge String with '-' "
 		+ "\n18)compare two Strings(case sensitive) "
 		+ "\n19)compare two Strings(ingore case) "
 		+ "\n20)To remove space in the begining and in the end "
 		+ "\n21)quit");

 while(condition) 
 {

 System.out.print("\n Enter the question no:");
 int select = input.nextInt();
 input.nextLine();
 switch(select) 
 {

case 1:
     try {
     System.out.print("Enter the String:");
     String myString = null;   
     int lengthOfString = obj.stringLength(myString);
     System.out.println("The length of the string is " + lengthOfString); 
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;
case 2:
     try {
     System.out.print("Enter the String:");
     String myString= input.nextLine();
     char[] charArray = obj.stringToCharArray(myString);
     System.out.print("The character array is ");
     System.out.println( charArray);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break; 
case 3:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();     
     System.out.print("Enter the no of letter from last letter:");
     int lastLength = input.nextInt();
     input.nextLine();  
     char character = obj.fromTheLastNum(myString,lastLength);
     System.out.print("the character at last but " + lastLength + " is "+character);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;
case 4:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter the letter:");
     char myLetter = input.next().charAt(0);
     int occurrenceOfLetter = obj.noOfOccurrence(myString,myLetter);
     System.out.println("no of occurrence of " + myLetter + " is:"+ occurrenceOfLetter);
     } catch (CustomException cex){ 
       cex.printStackTrace(); }
     break;  
case 5:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter the letter:");
     String letter = input.nextLine();
     int grestestPositionOfLetter = obj.greatestPosition(myString,letter);
     System.out.println("The greatest position of " + letter + ":"+grestestPositionOfLetter);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;
case 6:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter the no of last letters:");
     int lastNum = input.nextInt();
     input.nextLine();   
     String lastLetters = obj.substringLast(myString,lastNum);
     System.out.println("The last " + lastNum + " letters of a string:"+ lastLetters);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;
case 7:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter how many letter should be print:");
     int firstNum = input.nextInt();
     input.nextLine();
     String firstLetters = obj.substringFirst(myString,firstNum);
     System.out.println("The first " + firstNum + " letters of a string:"+ firstLetters);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break; 
case 8:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter how many letter want to be replaced:");
     int firstNum = input.nextInt();
     input.nextLine();
     System.out.print("Enter the letters to be replaced:");
     String replaceLetter = input.nextLine();
     String replaced = obj.replace(myString,replaceLetter,firstNum);
     System.out.println("The new replaced string:"+ replaced);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;   
case 9:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter starting String:");
     String givenString = input.nextLine();     
     boolean startWith = obj.startsWith(myString,givenString);    
     System.out.println(startWith);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;  
case 10:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     System.out.print("Enter ending String:");
     String givenString = input.nextLine();        
     boolean endWith = obj.endsWith(myString,givenString);    
     System.out.println(endWith);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;   
case 11:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     String toUpper = obj.toUpperCase(myString);    
     System.out.println("the uppercase of given string is \" "+ toUpper + " \" ");
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;      
case 12:
     try { 
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     String toLower = obj.toLowerCase(myString);    
     System.out.println("the lowercase of given string is \" "+ toLower + " \" ");
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;  
case 13:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     String reversed=obj.reverseString(myString);
     System.out.println("The reversed String is " + reversed);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;   
case 14: 
     try {
	String delimeter = " ";
     System.out.print("Enter no of String:");
     int noOfString = input.nextInt();
     input.nextLine();	     
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     for (int i=1;i<noOfString;i++) {
   	    String stringss=input.nextLine();
   	    myString = obj.join(stringss,myString,delimeter);
	 }     
     System.out.println(myString);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;  
case 15: 
     try {
     System.out.print("Enter no of String:");
     int noOfString = input.nextInt();
     input.nextLine();
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     for (int i=0;i<noOfString;i++)
	 {	String stringss=input.nextLine();
     	myString = obj.withOutSpace(myString,stringss);
     }           
     System.out.println(myString);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;        
case 16:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     String space = " ";     
     String[] splited = obj.split(myString,space);
     System.out.println(Arrays.toString(splited));
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;            
case 17:
     try {
   	 System.out.print("enter the merge character:");
	 String delimeter = input.nextLine();
     System.out.print("Enter no of String:");
     int noOfString = input.nextInt();
     input.nextLine();	     
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     for (int i=1;i<noOfString;i++) {
   	    String strings=input.nextLine();
   	    myString = obj.join(strings,myString,delimeter);
	 }     
     System.out.println(myString);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break; 
case 18:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();                                         
     System.out.print("Enter the String:");
     String anotherString = input.nextLine(); 
     boolean compare = obj.equalsWithCase(myString,anotherString);
     System.out.println(compare);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;       
case 19:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();                                           
     System.out.print("Enter the String:");
     String anotherString = input.nextLine();
     boolean compared = obj.equalsIgnoreCase(myString,anotherString);
     System.out.println(compared);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;     
case 20:
     try {
     System.out.print("Enter the String:");
     String myString = input.nextLine();
     String noSpace = obj.trim(myString);
     System.out.println(noSpace);
     } catch (CustomException cex){
       cex.printStackTrace(); }
     break;                  
case 21:
     condition = false;
     break;     
   }
 } 
     
 input.close();
 }
}
