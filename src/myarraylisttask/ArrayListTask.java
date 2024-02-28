package myarraylisttask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ownexception.CustomException;
import taskrequirements.Utilities;


//Coding to the interface...

public class ArrayListTask {
	
	public <T> int sizeOfList(List<T> myList ) throws CustomException{
		Utilities.checkNull(myList, "List can't be null");
		return myList.size();
	}
	
	
	public <T> List<T> getArrayList() throws CustomException {
		 List<T> myList =new ArrayList<>();
		return myList;
	}
	
	public <T> List<T> add(T myObj, List<T> myList) throws CustomException{
		Utilities.checkNull(myList, "List can't be null");
		Utilities.checkNull(myObj, "object can't be null");
	    myList.add(myObj);
	    return myList;
	}    
	
    public <T> List<T> addArrayList(List<T> myList1,List<T> myList2) throws CustomException {
    	Utilities.checkNull(myList1, "List1 can't be null");
    	Utilities.checkNull(myList2, "List2 can't be null");
    	myList1.addAll(myList2);
    	return myList1;
    }
	
	public <T> int indexOf(List<T> myList ,T myString) throws CustomException {
		Utilities.checkNull(myList, "List can't be null");
		Utilities.checkNull(myString, "string can't be null");
		return myList.indexOf(myString);
	}
	
	public <T> Iterator<T> getIterator(List<T> myList) throws CustomException {
		Utilities.checkNull(myList, "List can't be null");
		Iterator<T> iterator = myList.iterator();
        return iterator;
	}
	
	public <T> Object get(List<T> myList, int index)throws CustomException  {
		int size = sizeOfList(myList);
		Utilities.checkIndexException(size,index); 
		return myList.get(index);
	}
	
	public <T> int lastIndexOf(List<T> myList ,Object obj) throws CustomException {
		Utilities.checkNull(myList, "List can't be null");
		Utilities.checkNull(obj, "object can't be null");
		return myList.lastIndexOf(obj);
	}
	
	public <T> List<T> addSpecific(List<T> myList,T myString,int index) throws CustomException {
		int size = sizeOfList(myList);
		Utilities.checkIndexException(size,index); 
		Utilities.checkNull(myString, "String can't be null");
		myList.add(index,myString);
		return myList;
	}
	
	public <T> List<T> newArrayList(List<T> myList,int firstNum,int lastNum) throws CustomException  {
		int firstSize = sizeOfList(myList);
		Utilities.checkIndexException(firstSize,firstNum);
		Utilities.checkIndexException(firstSize,lastNum);
		return myList.subList(firstNum,lastNum);
	}
	
	public <T> List<T> removeDecimal(List<T> myList,int index) throws CustomException {
		int size = sizeOfList(myList);
		Utilities.checkIndexException(size,index); 
		myList.remove(index);
		return myList;
	}
	
	public <T> List<T> removeAll(List<T> myList1,List<T> myList2) throws CustomException  {
		Utilities.checkNull(myList1, "List1 can't be null");
    	Utilities.checkNull(myList2, "List2 can't be null");
		myList1.removeAll(myList2);
		return myList1;
	}
	
	public <T> List<T> retainAll(List<T> myList1,List<T> myList2) throws CustomException {
		Utilities.checkNull(myList1, "List1 can't be null");
    	Utilities.checkNull(myList2, "List2 can't be null");
    	myList1.retainAll(myList2);
		return myList1;
	}
	
	public <T> List<T> clear(List<T> myList) throws CustomException {
		Utilities.checkNull(myList, "List can't be null");
		myList.clear();
		return myList;
	}
	
	public <T> boolean contains(List<T> myList,Object myString)throws CustomException {
		Utilities.checkNull(myList, "List can't be null");
		Utilities.checkNull(myString, "String can't be null");
		return myList.contains(myString);
	}


}
