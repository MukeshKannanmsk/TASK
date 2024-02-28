package mystringbuildertask;
import ownexception.CustomException;
import taskrequirements.Utilities;

public class StringBuilderTask {

      

 public int lengthOfBuilder(StringBuilder myBuilder) throws CustomException { 
     Utilities.checkNull(myBuilder, "Stringbuilder can't be null");
     return myBuilder.length();
   }
   
   
   
 public StringBuilder appendString(StringBuilder myBuilder,String delimiter,String... myString) throws CustomException {
      Utilities.checkNull(myBuilder, "Stringbuilder can't be null");
       Utilities.checkNull(myString, "String can't be null");
      for (String str : myString) {
         myBuilder.append(delimiter).append(str);
    }  return myBuilder;
    }
      
    
    
    
 public int lastIndexOf(String myString,String delimiter) throws CustomException {
      Utilities.checkNull(myString , "String can't be null");
      Utilities.checkNull(delimiter, "delimiter can't be null");
      return myString.lastIndexOf(delimiter);
      }   
      
      
      
 public StringBuilder insert(StringBuilder myBuilder,String myString,int insertPosition) throws CustomException {
      int length = lengthOfBuilder(myBuilder);
      Utilities.checkNull(myString, "String can't be null");  
      Utilities.checkIndexException(length,insertPosition);    
      return myBuilder.insert(insertPosition,myString);
      }   
      
      
      
 public StringBuilder delete(StringBuilder myBuilder,int start,int end) throws CustomException {
        int length = lengthOfBuilder(myBuilder);
        Utilities.checkIndexException(length,start);
        Utilities.checkIndexException(length,end); 
        return myBuilder.delete(start,end);       
        }
      
      
        
 public StringBuilder replace(StringBuilder myBuilder,String replaced,int start,int end) throws CustomException {
        int length = lengthOfBuilder(myBuilder);
        Utilities.checkNull(replaced, "replaced String can't be null");  
        Utilities.checkIndexException(length,start);
        Utilities.checkIndexException(length,end); 
        return myBuilder.replace(start,end,replaced);       
        }
        
      
             
  public StringBuilder reverse(StringBuilder myBuilder) throws CustomException {
      Utilities.checkNull(myBuilder, "Stringbuilder can't be null");
      return myBuilder.reverse();     
    }              
    
    
    
   public int indexOf(String myString,String delimiter) throws CustomException {
      Utilities.checkNull(myString, "String can't be null");
      Utilities.checkNull(delimiter, "delimiter can't be null");
            return myString.indexOf(delimiter);  
     }
     
     
}

