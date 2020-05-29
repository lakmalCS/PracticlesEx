package lk.ac.kln.fct.learn.reflection.main;

import java.awt.Color;
//import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
//import java.text.Format.Field;
import java.util.Arrays;

import javax.sql.CommonDataSource;

import lk.ac.kln.fct.learn.reflection.core.Shape;
import lk.ac.kln.fct.learn.reflection.shapes.Rectangle;
import lk.ac.kln.fct.learn.reflection.shapes.Square;
import lk.ac.kln.fct.learn.reflection.util.Dimension;

public class Main {
	private final static String COLOR = "Color";
	private final static String GET = "get";
	private final static String SET = "set";
	
	public static void main(String[] args) {
		Dimension dim1 = new Dimension(5,10);
		Dimension dim2 = new Dimension(15,15);
		
		Shape shape1 = createShape(Rectangle.class, dim1);
		Shape shape2 = createShape(Square.class, dim2);
		
		Color red = new Color(255,0,0);
		Color green = new Color(0, 255, 0);
		
		System.out.println(shape1.getName()+" : "+shape1.area() +" : "+ setColorAndGetColorName(shape1,COLOR,red));
		System.out.println(shape2.getName()+" : "+shape2.area()+" : "+ setColorAndGetColorName(shape2,COLOR,green));
	}
	
	//Class<? extends Shape> means: An unknown class which extends Shape.
	public static Shape createShape(Class<? extends Shape> clazz, Dimension dimension) {
		try {
			//TODO
			//Using reflection find the correct constructor (To find the constructor you have to use the parameter type), invoke the constructor and create an instance.
			//Return the created instance.
			//Constructor<?> cons = clazz.getConstructor
			
			Constructor<?> constructor = clazz.getDeclaredConstructor(Dimension.class);
			constructor.setAccessible(true);
			Shape shape = (Shape)constructor.newInstance(dimension);
			

			return shape;
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid class or invalid Type", e);
		}
	}
	
	public static String setColorAndGetColorName(Shape shape, String name, Color value) {
		String getterName = GET + name;
		String setterName = SET + name;
		String fieldName = name.toLowerCase();
		Class<?> clazz = shape.getClass();
		try {
			//TODO
			//Find the setter method using reflection and set color.
			//You need to know the type of the attribute being set. 
			//To work this out, you need to get the "type" of the corresponding field		
			
			Method setColor = clazz.getDeclaredMethod(setterName, clazz.getDeclaredField(fieldName).getType());
			setColor.invoke(shape, value);
					
			//TODO
			//Find the getter method using reflection.
			//Invoke the getter method to get color name.
			
			Method getColor = clazz.getDeclaredMethod(getterName);
			getColor.setAccessible(true);
			String color = getColor.invoke(shape).toString();
			
			return color;
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid class or invalid Type", e);
		}
	}
}

