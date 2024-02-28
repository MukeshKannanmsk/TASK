package mystringtask;
import ownexception.CustomException;
import taskrequirements.Utilities;
public class StringTask {


        
//1)length of the string
  public int stringLength (String myString) throws CustomException {
         Utilities.checkNull(myString, "String can't be null");
          return myString.length();
  	  }
  	
  	
  	 
//2)to convert String to character Array 
  public char[] stringToCharArray(String myString) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
       return myString.toCharArray();
	  } 
 

 
//3)To find the character at last but one      
//nullexception not needed                                                        
  public char fromTheLastNum (String myString,int lastLength) throws CustomException {
     int lengthOfString = stringLength(myString); 
      Utilities.checkIndexException(lengthOfString,lastLength); 
      int indexLength = lengthOfString - lastLength;
      return  myString.charAt(indexLength);
   	  } 

  
  
//4)To find no of occurrence    
//nullexception not needed 
  public int noOfOccurrence(String myString,char myLetter) throws CustomException {
      int occur=0;
       int lengthOfString = stringLength(myString);  
       for (int i=0;i<lengthOfString;i++)
       {
          if ( myLetter == myString.charAt(i) ) {
          occur = occur+1; } 
          }
  	   return occur;
       }   
  

  
//5)to find greatest position of given letter   
  public int greatestPosition(String myString,String letter) throws CustomException {
       Utilities.checkNull(myString, "String can't be null");
       Utilities.checkNull(letter,"second string cant be null");
        return myString.lastIndexOf(letter);
        } 
       
  

//6)To print last five letters of a string  
//nullexception not needed 
  public String substringLast(String myString,int lastNum) throws CustomException {  
     int lengthOfString = stringLength(myString);
     Utilities.checkIndexException (lengthOfString,lastNum);  
    int length = lengthOfString-lastNum;
       return myString.substring(length);
     }   

  


//7)To print first three letters of a string 
//nullexception not needed 
  public String substringFirst(String myString, int firstNum)  throws CustomException {    
      int lengthOfString = stringLength(myString); 
      Utilities.checkIndexException (lengthOfString,firstNum); 
        return myString.substring(0,firstNum);
      } 
  
        
        
//8)To replace the first three letters by XYZ        
  public String replace(String myString,String replaceLetter,int firstNum) throws CustomException {
   int lengthOfString = stringLength(myString); 
     Utilities.checkIndexException (lengthOfString,firstNum); 
     Utilities.checkNull(replaceLetter, "new replaced string can't be null");
    String firstLetter = myString.substring(0,firstNum);
       return myString.replace(firstLetter,replaceLetter);
     }        

        
        
//9)To check whether String starts with 'ent'    
  public boolean startsWith(String myString,String givenString) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
      Utilities.checkNull(givenString,"second string cant be null");
       return myString.startsWith(givenString);
      }        

        
        
//10)To check whether String ends with 'le'    
  public boolean endsWith(String myString,String givenString) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
      Utilities.checkNull(givenString,"second string cant be null");
      return myString.endsWith(givenString);
     }    

     
     
//11)To convert the String to Uppercase   
  public String toUpperCase(String myString) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
      return myString.toUpperCase();       
     } 

     
     
//12)To convert the String to Lowercase     
  public String toLowerCase(String myString) throws CustomException {
     Utilities.checkNull(myString, "String can't be null");
      return myString.toLowerCase();       
     }  

     
     
//13)To reverse a String    
//nullexception not needed 
  public String reverseString(String myString) throws CustomException { 
       char[] charArray = stringToCharArray(myString);
       int lengthOfString = stringLength(myString);
       for (int i =0; i < lengthOfString/2; i++) {
        char tempChar = charArray[i];
        charArray[i] = charArray[lengthOfString-1-i];
        charArray[lengthOfString-1-i] = tempChar;
        }  
       return new String(charArray);
     } 
      

      
//15)To accept multiple String & To remove the space      
  public String withOutSpace(String myString,String strings) throws CustomException {    
   	Utilities.checkNull(myString, "String can't be null");
   	 Utilities.checkNull(strings,"second string cant be null");
   	  return myString.concat(strings);
     } 
      
      
      
//16)To enclose a string in string array   
  public String[] split(String myString,String space) throws CustomException {    
      Utilities.checkNull(myString, "String can't be null");
       return myString.split(space);
     } 

      
      
//17)To merge String with '-'      
  public String join(String stringss,String myString,String delimeter) throws CustomException {  
	 Utilities.checkNull(myString, "String can't be null");
	 Utilities.checkNull(delimeter,"delemeter cant be null"); 
	 Utilities.checkNull(stringss,"second string cant be null");
	  return String.join(delimeter,myString,stringss);
     }  
      

      
//18)compare two Strings(case sensitive)       
  public boolean equalsWithCase(String myString,String anotherString) throws CustomException {
       Utilities.checkNull(myString, "String can't be null");
       Utilities.checkNull(anotherString,"second string cant be null");
       return myString.equals(anotherString);       
     } 
    

    
//19)compare two Strings(ingore case)     
  public boolean equalsIgnoreCase(String myString,String anotherString) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
      Utilities.checkNull(anotherString,"second string cant be null");
      return myString.equalsIgnoreCase(anotherString);       
     } 
    

    
//20)To remove space in the begining and in the end
  public String trim(String myString) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
      return myString.trim();       
     }       
     

          
}     
