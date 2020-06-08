package lk.ac.kln.fct.learn.encapsulation.core;

import java.awt.Window.Type;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Student {
	private Integer studentID;
	private String name;
	private String degree;
	//https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
	private HashMap<String,Subject> subjects = new HashMap<>();
	private Double gpa;

	
	public Student(Integer studentID, String name, String degree, HashMap<String, Subject> subjects, Double gpa) {
		this.studentID = studentID;
		this.name = name;
		this.degree = degree;
		this.subjects = subjects;
		this.gpa = gpa;
	}


	public Integer getStudentID() {
		return studentID;
	}


	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public HashMap<String, Subject> getSubjects() {
		Gson gson = new Gson();
		String jsonString = gson.toJson(subjects);
		java.lang.reflect.Type type = new TypeToken<HashMap<String, Subject>>(){}.getType();
		HashMap<String, Subject> sub = gson.fromJson(jsonString, type);
		
		return sub;
	}


	public void setSubjects(HashMap<String, Subject> subjects) {
		this.subjects = subjects;
	}


	public Double getGpa() {
		return gpa;
	}


	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
}
