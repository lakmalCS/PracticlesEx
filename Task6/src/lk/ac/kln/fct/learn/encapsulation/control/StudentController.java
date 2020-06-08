package lk.ac.kln.fct.learn.encapsulation.control;

import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import lk.ac.kln.fct.learn.encapsulation.core.Student;
import lk.ac.kln.fct.learn.encapsulation.core.Subject;

public class StudentController implements Cloneable{
	private static HashMap<Integer, Student> students = new HashMap<>();
	
	public void addStudent(Integer studentID, String name, String degree, HashMap<String,Subject> subjects, Double gpa) {
		Student student = new Student(studentID, name, degree,subjects,gpa);
		students.put(studentID, student);
	}
	
	//TODO something is not really correct here!
	public HashMap<Integer, Student> getStudents(){
		Gson gson = new Gson();
		String jsonString = gson.toJson(students);
		java.lang.reflect.Type type = new TypeToken<HashMap<Integer, Student>>(){}.getType();
		HashMap<Integer, Student> stu = gson.fromJson(jsonString, type);
		
		return stu;
	}	
}
