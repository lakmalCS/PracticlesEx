package lk.ac.kln.fct.learn.encapsulation.core;

import java.util.ArrayList;

public class Subject{
	private String subjectID;
	private String subjectName;
	private ArrayList<Degree> allowedDegrees;
	
	public Subject(String subjectID, String subjectName, ArrayList<Degree> allowedDegrees) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.allowedDegrees = allowedDegrees;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public ArrayList<Degree> getAllowedDegrees() {
		return new ArrayList<Degree>(allowedDegrees);
	}

	public void setAllowedDegrees(ArrayList<Degree> allowedDegrees) {
		this.allowedDegrees = allowedDegrees;
	}	
}
