package lk.ac.kln.fct.learn.generics.core;

import java.util.ArrayList;

//TODO use generics for the values.
public class Inventory<K,V> {
	private ArrayList<Entry<K,V>> entries = new ArrayList<>();
	
	public void addToInventory(Entry<K,V> entry) {
		for(Entry<K,V> e: entries) {
		    if(e.getKey().equals(entry.getKey())) {
		    	throw new IllegalArgumentException("Duplicate key found");
			}
		}
		entries.add(entry);
		
	}
	
	//TODO This method needs to return the complete array list.
	public ArrayList<Entry<K,V>> getInventory() {
		return entries;
	}	
	
	public Entry<K,V> getEntryByIndex(int index) {
		//This has been done as an example implementation.
		//Here I invoke the get method provided in the ArrayList class and return the value.
		return entries.get(index);
	}
			
	//TODO This method needs to return the matching entry object for a given key.
	public Entry<K,V> getEntryByKey(K key) {
		for(Entry<K,V> e : entries) { 
			if(e.getKey().equals(key))
				return e;
		}
		return null;
	}
	
	//TODO This method needs to return the index of a given entry object.
	//Read the Method Summary section in the following JavaDoc for array list.
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	//Select the suitable method, invoke it and return the value. (This it to understand methods provided by Java ArrayList class)
	//Note: Just one line implementation.
	public int getEntryIndex(Entry<K,V> entry) {
		return entries.indexOf(entry);
	}
	
	//TODO This method needs to remove a given entry object from the array list.
	//Read the Method Summary section in the following JavaDoc for array list.
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	//Select the suitable method, invoke it and return the value. (This it to understand methods provided by Java ArrayList class)
	//Note: Just one line implementation.
	public boolean removeByEntry(Entry<K,V> entry) {
		return entries.remove(entry);
	}
	

	//TODO This method needs to remove a given entry object using its' index.
	//After removing the object it should return the removed object.
	//Read the Method Summary section in the following JavaDoc for array list.
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	//Select the suitable method, invoke it and return the value. (This it to understand methods provided by Java ArrayList class)
	//Note: Just one line implementation.
	public Entry<K,V> removeByIndex(int index) {
		return entries.remove(index);
	}
	
	//TODO This method needs to remove all the entries.
	//Read the Method Summary section in the following JavaDoc for array list.
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	//Select the suitable method, invoke it to remove all the entry objects. (This it to understand methods provided by Java ArrayList class)
	//Note: Just one line implementation.
	public void removeAll() {
		entries.removeAll(entries);
	}
}
