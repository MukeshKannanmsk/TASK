package files;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

import ownexception.CustomException;

public class FileTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FileTask obj = new FileTask();
		 boolean condition=true;
		   
		  System.out.println("1.to create file without directory\n"
		  		+ "2.to create the file with directory");
		  while(condition) 
		  {
		  System.out.print("\n Enter the question no:");
		  int select = input.nextInt();
		  input.nextLine();
		  switch(select) 
		  {
		  
		  case 1:
		  try {
              System.out.print("enter the filename");
			  String myFile = input.nextLine();
		      String myDir = obj.getDirectory();
		      System.out.println(myDir);
		      System.out.print("enter the no of lines in the file");
		      int noOfLines = input.nextInt();
		      input.nextLine(); 
		      String[] myLine = new String[noOfLines];
		      for(int i=1;i<= noOfLines;i++) {
		    	  System.out.print("Enter the line"+i+":");
		    	  myLine[i-1] = input.nextLine()+"\n";
		      }
		      obj.toWrite(myFile,myDir, myLine);    
		      System.out.println("Successfully wrote to the file.");
		      Properties myProp = obj.getProperty();
		      System.out.print("Enter the no of keys And values");
		      noOfLines = input.nextInt();
		      input.nextLine();
		      for(int i=1;i <=noOfLines;i++) {
		    	  System.out.print("enter the key "+i+" :");
		    	  String keys = input.nextLine();
		    	  System.out.print("enter the value "+i+" :");
		    	  String values = input.nextLine();
		    	  obj.setProperty(myProp,keys, values);
		      }
		      System.out.print("enter the filename for property");
		      String fileName = input.nextLine();
		       obj.store(myProp, fileName, myDir);
		       System.out.println("Sucessfully Stored"); 
		       myProp =obj.toRead(myProp, fileName,myDir);
		       System.out.println("Successfully read to the file.");
		       System.out.print(myProp);
		       
		    } catch(FileNotFoundException fex) {
		    	System.out.println("file not found, error occurred."+fex.getMessage());
		    } catch (IOException iex) {
		        System.out.println("An error occurred."+iex.getMessage());
		    } catch (InputMismatchException iex) {
		    	System.out.println("enter the correct input");
		    	input.nextInt();
		    } catch (CustomException cex) {
		    	System.out.println("error occured");
		    }
		  break;
		  case 2:
			  try {
					 System.out.print("enter the directoy"); //"/home/mukesh-pt7280/myDir"
					 String myDir = input.nextLine();
		              obj.makeDir(myDir);
		              System.out.print("enter the filename");
					  String myFile = input.nextLine();
				      System.out.print("enter the no of lines in the file");
				      int noOfLines = input.nextInt();
				      input.nextLine(); 
				      String[] myLine = new String[noOfLines];
				      for(int i=1;i<= noOfLines;i++) {
				    	  System.out.print("Enter the line"+i+":");
				    	  myLine[i-1] = input.nextLine()+"\n";
				      }
				      obj.toWrite(myFile,myDir, myLine);    
				      System.out.println("Successfully wrote to the file.");
				      Properties myProp = obj.getProperty();
				      System.out.print("Enter the no of keys And values");
				      noOfLines = input.nextInt();
				      input.nextLine();
				      for(int i=1;i <=noOfLines;i++) {
				    	  System.out.print("enter the key "+i+" :");
				    	  String keys = input.nextLine();
				    	  System.out.print("enter the value "+i+" :");
				    	  String values = input.nextLine();
				    	  obj.setProperty(myProp,keys, values);
				      }
				      System.out.print("enter the filename for property");
				      String fileName = input.nextLine();
				       obj.store(myProp, fileName, myDir);
				       System.out.println("Sucessfully Stored"); 
				       myProp =obj.toRead(myProp, fileName,myDir);
				       System.out.println("Successfully read to the file.");
				       System.out.print(myProp);
				       
				    } catch(FileNotFoundException fex) {
				    	System.out.println("file not found, error occurred."+fex.getMessage());
				    } catch (IOException iex) {
				        System.out.println("An error occurred."+iex.getMessage());
				    } catch (InputMismatchException iex) {
				    	System.out.println("enter the correct input");
				    	input.nextInt();
				    } catch (CustomException cex) {
				    	System.out.println("error occured");
				    }
				 break;
		  case 3: 
			  condition = false;
			  break;
		    }  
		  } input.close();
	}

}
