package lk.ac.kln.fct.learn.generics.core;

import java.util.Vector;

//TODO use generics for the value.
//You have to start changing the code from here.
public class Entry<K,Vector> {
	private K key;
	//TODO use generics for the value.
	private Vector value;	
	
	public Entry(K key, Vector value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public Vector getValue() {
		return value;
	}
	public void setValue(Vector value) {
		this.value = value;
	}
	
	
}