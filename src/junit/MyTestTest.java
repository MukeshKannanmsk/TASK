package junit;
import mystringtask.StringTask;
import ownexception.CustomException;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTestTest {
	StringTask obj = new StringTask();
	
	@Test
	//@Categories({myInterface.class})
	public void reversing() throws CustomException {
		
				assertEquals("hello",obj.reverseString("olleh"));
			
	}
	
	@Test
	public void lengthOfString() throws CustomException {
		assertEquals(5,obj.stringLength("Hello"));
	}



}
