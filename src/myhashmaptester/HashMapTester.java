package myhashmaptester;
import myhashmaptask.HashMapTask;
import ownexception.CustomException;
import myarraylisttester.CustomObject;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapTester {

	public static void main(String[] args) {
		HashMapTask obj = new HashMapTask();
		Scanner input = new Scanner(System.in);
		boolean condition=true;
		System.out.println("1. Write a program to create a HashMap. Print the HashMap & it’s size.\n"
				+ "2. to create a HashMap & add 3 pairs of keys(String) & values(String).\n"
				+ "3. to create a HashMap & add 3 pairs of keys(Integer) & values(Integer)\n"
				+ "4. to create a HashMap & add 3 pairs of keys(String) & values(Integer).\n"
				+ "5. to create a HashMap & add 3 pairs of keys(String) & value(your own object).\n"
				+ "6. to create a HashMap & add 3 keys(String). With a null value to one of the keys\n"
				+ "7. to create a HashMap & add a null key & non null value to it\n"
				+ "8. Write a program to check a key exists in a HashMap\n"
				+ "9. Write a program to check a value exists in a HashMap\n"
				+ "10. to create a HashMap Now change the values for all the 3 keys\n"
				+ "11. Write a program to get the value of a existing key in a HashMap\n"
				+ "12. Write a program to get the value of a non existing key in a HashMap\n"
				+ "13. to return “Zoho” as a value for a given non existing key in a HashMap.\n"
				+ "14. to remove an existing key in a HashMap.\n"
				+ "15. to remove an existing key only if it’s value matches with the given value in a HashMap\n"
				+ "16. Write a program to replace the value of an existing key in a HashMap.\n"
				+ "17. to replace the value of an existing key only if it’s value matches with the given value\n"
				+ "18. to transfer all the keys & values of a HashMap to another HashMap which has 3 pairs of keys & values already.\n"
				+ "19. to iterate over a HashMap & print all it’s key & its corresponding\n"
				+ "20. to remove all entries in a HashMap");
		
		while(condition) {
			try {
			System.out.print("\n Enter the question no:");
			 int select = input.nextInt();
			 input.nextLine();
			 switch(select) {
			 
			 case 1: 
				 HashMap <Object,Object> myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("The hashmap is :"+myMap);
				 int size = obj.sizeOfMap(myMap);
				 System.out.print("The size of the hashmap is :" + size);
				 break;
			 case 2:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of string: ");
				 int noOfStrings = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfStrings ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 3:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of Integer: ");
				 int noOfInt = input.nextInt();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 int myKey = input.nextInt();
					 System.out.print("enter the value"+(i+1)+":");
					 int myValue = input.nextInt();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 4:	 
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 int myValue = input.nextInt();
					 input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 5:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 CustomObject obj1 = new CustomObject(myValue);
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, obj1);
				 }
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 6:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt-1 ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("enter the Key null value"+(noOfInt)+":");
				 String myNullKey = input.nextLine();
				 String myNullValue = null;
				 myMap = (HashMap<Object, Object>) obj.add(myMap, myNullKey, myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 7:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt-1 ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 myNullKey = null;
				 System.out.print("enter the value for null key"+(noOfInt)+":");
				 myNullValue = input.nextLine();
				 myMap = (HashMap<Object, Object>) obj.add(myMap, myNullKey, myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 8:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to check:");
				 myNullKey = input.nextLine();
				 boolean checker = obj.containsKey(myMap, myNullKey);
				 if (checker==true) {
					 System.out.println("the key is present in the map");
				 } else System.out.println("the key is not present in the map");
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 9:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the value to check:");
				 myNullValue = input.nextLine();
				 checker = obj.containsValue(myMap, myNullValue);
				 if (checker==true) {
					 System.out.println("the value is present in the map");
				 } else System.out.println("the value is not present in the map");
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 10:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }  
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 for (Object key : obj.keySet(myMap)) {
			            System.out.print("Enter new value for key " + key + ": ");
			            myNullValue = input.nextLine();
			            myMap = (HashMap<Object, Object>) obj.add(myMap, key, myNullValue);
			        }
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 11:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to check:");
				 myNullKey = input.nextLine();
				 myNullValue = (String) obj.getValue(myMap,myNullKey);
				 System.out.println("the value of key is "+myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 12:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to check:");
				 myNullKey = input.nextLine();
				 myNullValue = (String) obj.getValue(myMap,myNullKey);
				 System.out.println("the value of key is "+myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 13:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to check:");
				 myNullKey = input.nextLine();
				 System.out.print("Enter the key to return:");
				 myNullValue = input.nextLine();
				 myNullValue = (String) obj.getDefault(myMap,myNullKey,myNullValue);
				 System.out.println("the value of key is "+myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 14:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to remove:");
				 myNullKey = input.nextLine();
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 myMap = (HashMap<Object, Object>) obj.remove(myMap, myNullKey);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 15:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to remove:");
				 myNullKey = input.nextLine();
				 System.out.print("Enter the value to remove:");
				 myNullValue = input.nextLine();
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 myMap = (HashMap<Object, Object>) obj.removeSpecific(myMap, myNullKey,myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 16:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to replace:");
				 myNullKey = input.nextLine();
				 System.out.print("Enter the new value to replace:");
				 myNullValue = input.nextLine();
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 myMap = (HashMap<Object, Object>) obj.replace(myMap, myNullKey,myNullValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 17:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.print("Enter the key to replace:");
				 myNullKey = input.nextLine();
				 System.out.print("Enter the value to remove:");
				 myNullValue = input.nextLine();
				 System.out.print("Enter the new value to replace:");
				 String myNewValue = input.nextLine();
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 myMap = (HashMap<Object, Object>) obj.replaceSpecific(myMap, myNullKey,myNullValue,myNewValue);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 18:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 HashMap <Object,Object> myNewMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer for 2nd map: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myNewMap = (HashMap<Object, Object>) obj.add(myNewMap, myKey, myValue);
				 }
				 myNewMap = (HashMap<Object, Object>) obj.transferMap(myMap, myNewMap);
				 System.out.println("The hashmap 1 is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap1 is :" + size);
				 System.out.println("The hashmap 2 is :"+myNewMap);
				 size = obj.sizeOfMap(myNewMap);
				 System.out.println("The size of the hashmap 2 is :" + size);
				 break;
			 case 19:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 for (Entry<Object, Object> entry : obj.entrySet(myMap)) {
			            String key = (String) entry.getKey();
			            String value = (String) entry.getValue();
			            System.out.println("Key: " + key + ", Value: " + value);
			        }
				 break;
			 case 20:
				 myMap = (HashMap<Object, Object>) obj.getHashMap();
				 System.out.print("Enter the number of strings and Integer: ");
				 noOfInt = input.nextInt();
				 input.nextLine();
				 for (int i=0;i<noOfInt ;i++) {
					 System.out.print("enter the Key"+(i+1)+":");
					 String myKey = input.nextLine();
					 System.out.print("enter the value"+(i+1)+":");
					 String myValue = input.nextLine();
					 myMap = (HashMap<Object, Object>) obj.add(myMap, myKey, myValue);
				 }
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 myMap = (HashMap<Object, Object>) obj.removeAll(myMap);
				 System.out.println("The hashmap is :"+myMap);
				 size = obj.sizeOfMap(myMap);
				 System.out.println("The size of the hashmap is :" + size);
				 break;
			 case 21:
				 condition = false;
				 break;
			 }
			} catch (CustomException cex){
			       cex.printStackTrace(); 
		    } catch (InputMismatchException iex) {
		       System.out.println("enter the correct input"); 
		       input.nextLine();
		       }	
	} input.close();
 } 
}

