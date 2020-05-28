package lk.ac.kln.fct.learn.reflection.main;

import lk.ac.kln.fct.learn.reflection.shapes.Rectangle;
import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = null;				
		try {
			Class<?> clazz = Rectangle.class;
			rectangle = (Rectangle) clazz.getConstructor().newInstance();
			//TODO
			//Get the super class's name field.
			//Set the value "Rectangle" to name field.
			Field name = clazz.getSuperclass().getDeclaredField("name"); //access the private data field of the super class
			name.setAccessible(true);									//set the private data field accessible
			name.set(rectangle, "Rectangle");							//set the name data field value to Rectangle
				
		} catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("Shape name: "+ rectangle.getName());
	}
}
