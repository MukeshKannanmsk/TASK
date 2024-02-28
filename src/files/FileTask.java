package files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Properties;

import ownexception.CustomException;
import taskrequirements.Utilities;

public class FileTask {
	
	public void makeDir(String myDir) throws CustomException {
		Utilities.checkNull(myDir, "Directry cant be null");
		new File(myDir).mkdirs();
	}
	
	public String getDirectory() {
		return System.getProperty("user.dir");
	}
	
	public Writer getFileWriter(String fileName,String myDir) throws IOException {
		String filePath = myDir+File.separator+fileName;
		Writer myWriter = new FileWriter(filePath);
		return myWriter;
	}
	
	public void toWrite(String fileName, String myDir,String... myString) throws IOException, CustomException {
		Utilities.checkNull(fileName, "filename cant be null");
		Utilities.checkNull(myString, "String array cant be null");
		Utilities.checkNull(myDir, "Directory cant be null" );
	    try (Writer myWriter = getFileWriter(fileName,myDir)) {
	        for (String str : myString) {
	            myWriter.write(str);
	        }
	    } 
	}
	
    public Properties getProperty() {
    	Properties myProp = new Properties();
    	return myProp;
    }
    
    public void setProperty(Properties myProp,String keys,String values) throws CustomException {
    	Utilities.checkNull(keys, "keys cant be null");
    	Utilities.checkNull(values, "values cant be null");
            myProp.setProperty(keys, values);	
    }
    
    private OutputStream setOutStream(String fileName,String myDir) throws FileNotFoundException{
       	String path = myDir+File.separator+fileName;
        return new FileOutputStream(path);
    }

    private InputStream setInStream(String fileName,String myDir) throws FileNotFoundException{
    	String path = myDir+File.separator+fileName;
        return new FileInputStream(path);
    }
    
    public void store(Properties myProp, String fileName,String myDir) throws IOException, CustomException {
        Utilities.checkNull(myProp, "myProp cant be null");
        Utilities.checkNull(fileName, "fileName cant be null");
    	Utilities.checkNull(myDir,"directory cant be null");
        try (OutputStream out = this.setOutStream(fileName, myDir)) {
            myProp.store(out, fileName);
        }
    }

    public Properties toRead(Properties myProp, String fileName,String myDir) throws IOException, CustomException {
    	Utilities.checkNull(fileName, "fileName cant be null");
    	Utilities.checkNull(myProp, "myProp cant be null");
    	Utilities.checkNull(myDir,"directory cant be null");
        try (InputStream in = this.setInStream(fileName, myDir)) {
            myProp.load(in);
        } return myProp;
    } 
}   
