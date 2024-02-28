package myhashmaptask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import ownexception.CustomException;
import taskrequirements.Utilities;

public class HashMapTask {
	
	public <K,V> Map<K,V> getHashMap() {
		Map<K,V> myMap = new HashMap<>();
		return myMap;
	}
	
	public <K,V> int sizeOfMap(Map<K,V> myMap) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.size();
	}
	
	public <K,V> Map<K,V> add(Map<K,V> myMap,K key,V value) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		myMap.put(key, value);
		return myMap;
	}
	
	public <K,V> boolean containsKey(Map<K,V> myMap,K key) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.containsKey(key);
	}
	
	public <K,V> boolean containsValue(Map<K,V> myMap,V value) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.containsValue(value);
	}
	
	public <K,V> V getValue(Map<K,V> myMap,K key) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.get(key);
	}
	
	public <K,V> V getDefault(Map<K,V> myMap,K key,V value) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.getOrDefault(key,value);
	}	
	
	public <K,V> Map<K,V> remove(Map<K,V> myMap,K key) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		myMap.remove(key);
		return myMap;
	}
	
	public <K,V> Map<K,V> removeSpecific(Map<K,V> myMap,K key,V value) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		myMap.remove(key,value);
		return myMap;
	}
	
	public <K,V> Map<K,V> replace(Map<K,V> myMap,K key,V value) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		myMap.replace(key, value);
		return myMap;
	}
	
	public <K,V> Map<K,V> replaceSpecific(Map<K,V> myMap,K key,V oldValue,V newValue) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		myMap.replace(key, oldValue, newValue);
		return myMap;
	}
	
	public <K,V> Map<K,V> transferMap(Map<K,V> myMap1,Map<K,V> myMap2) throws CustomException {
		Utilities.checkNull(myMap1, "map1 cant be null");
		Utilities.checkNull(myMap2, "map2 cant be null");
		myMap2.putAll(myMap1);
		return myMap2;
	}
	
	public <K,V> Set<K> keySet(Map<K,V> myMap) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.keySet();
	}
	
	public <K,V> Set<Map.Entry<K,V>> entrySet(Map<K,V> myMap) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		return myMap.entrySet();
	}
	
	public <K,V> Map<K,V> removeAll(Map<K,V> myMap) throws CustomException {
		Utilities.checkNull(myMap, "map cant be null");
		myMap.clear();
		return myMap;
	}

}
