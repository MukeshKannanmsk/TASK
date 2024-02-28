package taskrequirements;
import ownexception.CustomException;

public class Utilities {



// method for null checker                
 public static void checkNull(Object myObject, String message) throws CustomException {
    if (myObject == null) {
        throw new CustomException(message, new NullPointerException("Object is null"));
    }
 }

                 


//method to check index out of bound        
 public static void checkIndexException (int lengthOfString,int number) throws CustomException {
         if ( number > lengthOfString ) {
        throw new CustomException("number should not be greater than the length " + lengthOfString); }  
         else if ( number < 0) {
        throw new CustomException("number should not be negative"); }  
        }   
        
        
}
