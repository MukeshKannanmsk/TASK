package myarraylisttester;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import ownexception.CustomException;
import myarraylisttask.ArrayListTask;

public class ArrayListTester {

	public static void main(String[] args) {
		ArrayListTask obj = new ArrayListTask();
		Scanner input = new Scanner(System.in);
		boolean condition=true;
		System.out.println("1.to create an ArrayList & print the size of it\n"
				+ "2.to create an ArrayList & add 5 Strings \n"
				+ "3.to create an ArrayList & add 5 integers \n"
				+ "4.to create an ArrayList & add your custom objects \n"
				+ "5.to create an ArrayList & add 2 integers, add 3 Strings  & 2 custom objects\n"
				+ "6.to find the index of any one of the already added String\n"
				+ "7.to Use the iterator method & for loop to print each element in the ArrayList\n"
				+ "8.to Print the String at a given index in the ArrayList & the size of it\n"
				+ "9.to Find the first & last position(index) of a duplicate string.\n"
				+ "10.to add a given String at the 2nd position of the ArrayList\n"
				+ "11.to create a new ArrayList(second ArrayList) with elements from 3 to 8 position of the first ArrayList\n"
				+ "12.to create another ArrayList (third ArrayLIst) using the above two ArrayLists.\n"
				+ "13. to create another ArrayList (third ArrayLIst) using the above two ArrayLists."
				+ " But all the elements of secondArrayList should be ahead of thefirst ArrayList elements.\n"
				+ "14. Write a program to Remove a decimal value at position 4 from the ArrayList.\n"
				+ "15.to remove the elements from the first ArrayList which are present in the secondArrayList\n"
				+ "16.to remove the elements from the first ArrayListwhich are not present in the secondArrayList\n"
				+ "17.to Remove all the long values from the ArrayLIst.\n"
				+ "18.to Check whether a given String is present in the ArrayList");
		
		while(condition) {
			try {
			 System.out.print("\n Enter the question no:");
			 int select = input.nextInt();
			 input.nextLine();
			 switch(select) {
			 
			 case 1:
				 ArrayList<String> myList = new ArrayList<>();
				 int size = obj.sizeOfList(myList);
				 System.out.println("the array list is : " +myList);
				 System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 2:
				 System.out.print("Enter the no of String : ");
				 int noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myString = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myString, myList);
			        }  
			     System.out.println("the array list is : " +myList);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 3:
				 System.out.print("Enter the no of long to be added : ");
				 int noOfInt =input.nextInt();
				 ArrayList<Integer> myIntList = new ArrayList<>();
			        for (int i = 0; i < noOfInt; i++) {
			            System.out.print("Enter long " + (i + 1) + ": ");
			            int myInt= input.nextInt() ;
			            myIntList = (ArrayList<Integer>) obj.add(myInt, myIntList);
			        }
				 System.out.println("the array list is : " +myIntList);
			     size = obj.sizeOfList(myIntList);
			     System.out.println("Size of the arraylist is:"+size);
			     break;
			 case 4:
				 ArrayList<CustomObject> myObjList = new ArrayList<>();
				 System.out.print("Enter the no of object : ");
				 int noOfObjects = input.nextInt();
				 input.nextLine();
			        for (int i = 0; i < noOfObjects; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myString = input.nextLine();
			            CustomObject obj1 = new CustomObject(myString);
			            myObjList = (ArrayList<CustomObject>) obj.add(obj1,myObjList);   
			        }
			     
			     System.out.println("the array list is : " +myObjList);
			     size = obj.sizeOfList(myObjList);
			     System.out.println("Size of the arraylist is:"+size);
				 break; 
			 case 5:	
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 ArrayList<Object> myStringList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myString = input.nextLine() ;
			            myStringList = (ArrayList<Object>) obj.add(myString, myStringList);
			        }      
			     System.out.print("Enter the no of int to be added : ");
			     noOfInt =input.nextInt();   
			        for (int i = 0; i < noOfInt; i++) {
			            System.out.print("Enter long " + (i + 1) + ": ");
			            int myInt= input.nextInt() ;
			            myStringList = (ArrayList<Object>) obj.add(myInt, myStringList);
			        }
				 System.out.print("Enter the no of object : ");
				 noOfObjects = input.nextInt();
				 input.nextLine();
			        for (int i = 0; i < noOfObjects; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myString = input.nextLine();
			            CustomObject obj1 = new CustomObject(myString);
			            myStringList = (ArrayList<Object>) obj.add(obj1,myStringList);   
			        }
			     System.out.println("the array list is : " +myStringList);
			     size = obj.sizeOfList(myStringList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 6:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myString = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myString, myList);
			        }    
			     System.out.println("enter string to known the index :");
			     String myString = input.nextLine();
			     int index = obj.indexOf(myList, myString);
			     System.out.println("the array list is : " +myList);
			     System.out.println("the index of given string is :"+index);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 7:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }      
			        Iterator<String> iterator = obj.getIterator(myList);
		            System.out.println("Using Iterator:");
		            while (iterator.hasNext()) {
		                System.out.println(iterator.next());
		            }
		            System.out.println("\nUsing for loop:");
		            for (String element : myList) {
		                System.out.println(element);
		            }

			       size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 8:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }      
			     System.out.print("enter the index");
			     index = input.nextInt();
			     Object myStr = obj.get(myList, index);
			     System.out.print("the string at given index is " + myStr);
			     System.out.println("the array list is : " +myList);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 9:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     System.out.println("enter string to known the index :");
			     myString = input.nextLine();
			     index = obj.indexOf(myList, myString);
			     int lastIndex = obj.lastIndexOf(myList, myString);
			     System.out.println("the array list is : " +myList);
			     System.out.println("the firstindex of given string is :"+index);
			     System.out.println("the lastindex of given string is :"+lastIndex);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 10:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     System.out.print("enter the string to be added");
			     myString = input.nextLine();
			     System.out.print("enter the position the string to be added");
			     index = input.nextInt();
			     myList = (ArrayList<String>) obj.addSpecific(myList, myString, index);
			     System.out.println("the array list is : " +myList);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 11:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     ArrayList<String> myList2 = new ArrayList<>();
			     System.out.print("enter the from position of list:");
			     index = input.nextInt();
			     System.out.print("entre the to position of List:");
			     lastIndex = input.nextInt();
			     myList2 = (ArrayList<String>) obj.newArrayList(myList, index, lastIndex);
			     System.out.println("the array list is : " +myList2);
			     size = obj.sizeOfList(myList2);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 12:
				 System.out.print("Enter the no of String  for list 1: ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }    
			        System.out.println("the array list is : " +myList);   
			     System.out.print("Enter the no of String for list 2: ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList2 = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList2 = (ArrayList<String>) obj.add(myStrings, myList2);
			        }     
			        System.out.println("the array list is : " +myList2);
			     ArrayList<String> myList3 = new ArrayList<>();
			     myList3 = (ArrayList<String>) obj.addArrayList(myList, myList2);
			     System.out.println("the array list is : " +myList3);
			     size = obj.sizeOfList(myList3);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 13:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     System.out.print("Enter the no of String for list 2: ");
		    	 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList2 = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
				         System.out.print("Enter string " + (i + 1) + ": ");
				         String myStrings = input.nextLine() ;
				         myList2 = (ArrayList<String>) obj.add(myStrings, myList2);
		            }     
			     myList3 = new ArrayList<>();
			     myList3 = (ArrayList<String>) obj.addArrayList(myList2, myList);
			     System.out.println("the array list is : " +myList3);
			     size = obj.sizeOfList(myList3);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 14:
				 System.out.print("Enter the no of long to be added : ");
				 noOfInt =input.nextInt();
				 ArrayList<Double> myDecimalList = new ArrayList<>();
			        for (int i = 0; i < noOfInt; i++) {
			            System.out.print("Enter long " + (i + 1) + ": ");
			            Double myDecimal= input.nextDouble() ;
			            myDecimalList = (ArrayList<Double>) obj.add(myDecimal, myDecimalList);
			        }
				 System.out.print("Enter the index to be removed:");
				 index = input.nextInt();
				 myDecimalList = (ArrayList<Double>) obj.removeDecimal(myDecimalList, index);
				 System.out.println("the array list is : " +myDecimalList);
			     size = obj.sizeOfList(myDecimalList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 15:
				 System.out.print("Enter the no of String  for list 1: ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     System.out.print("Enter the no of String for list 2: ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList2 = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList2 = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     myList = (ArrayList<String>) obj.removeAll(myList, myList2);
			     System.out.println("the array list is : " +myList);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 16:
				 System.out.print("Enter the no of String  for list 1: ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     System.out.print("Enter the no of String for list 2: ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList2 = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList2 = (ArrayList<String>) obj.add(myStrings, myList);
			        }     
			     myList = (ArrayList<String>) obj.retainAll(myList, myList2);
			     System.out.println("the array list is : " +myList);
			     size = obj.sizeOfList(myList);
			     System.out.println("Size of the arraylist is:"+size);
				 break;
			 case 17:
				 System.out.print("Enter the no of long to be added : ");
				 noOfInt =input.nextInt();
				 ArrayList<Long> myLongList = new ArrayList<>();
			        for (int i = 0; i < noOfInt; i++) {
			            System.out.print("Enter long " + (i + 1) + ": ");
			            long myLong= input.nextLong() ;
			            myLongList = (ArrayList<Long>) obj.add(myLong, myLongList);
			        }
				 System.out.println("the array list is : " +myLongList);
			     size = obj.sizeOfList(myLongList);
			     System.out.println("Size of the arraylist is:"+size);
			     myLongList = (ArrayList<Long>) obj.clear(myLongList);
			     System.out.println("the array list after clearing is : " +myLongList);
			     size = obj.sizeOfList(myLongList);
			     System.out.println("Size of the arraylist after clearing 1is:"+size);
				 break;
			 case 18:
				 System.out.print("Enter the no of String : ");
				 noOfStrings = input.nextInt();
				 input.nextLine();
				 myList = new ArrayList<>();   
			        for (int i = 0; i < noOfStrings; i++) {
			            System.out.print("Enter string " + (i + 1) + ": ");
			            String myStrings = input.nextLine() ;
			            myList = (ArrayList<String>) obj.add(myStrings, myList);
			        }   
			     System.out.print("Enter the String present in the list:");
			     myString = input.nextLine();
			     boolean myChecker = obj.contains(myList, myString);
			     if (myChecker==true) {
			    	 System.out.print("the String present in the list");
			    	 System.out.println("the array list is : " +myList);
				     size = obj.sizeOfList(myList);
				     System.out.println("Size of the arraylist is:"+size);
			     }
			     else {
			    	 System.out.print("the String is not present in the list");
			    	 System.out.println("the array list is : " +myList);
				     size = obj.sizeOfList(myList);
				     System.out.println("Size of the arraylist is:"+size);
			     }
				 break;
			 case 19:	 
				 condition = false;
				 break;
				 
			 }
			} catch (CustomException cex){
			       System.out.println("eeror occured"); 
			 } catch (InputMismatchException iex) {
			       iex.printStackTrace(); 
			      System.out.println("enter the correct input"); 
			      input.nextLine();
			      }
		} input.close();
		
	}

}
