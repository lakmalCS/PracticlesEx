package lk.ac.kln.fct.data.processor;

import java.util.ArrayList;

import lk.ac.kln.fct.data.pojo.Record;

public class Main {
	private static final String FILE_PATH = "C:/Users/Lakshan Madushanka/eclipse-workspace/covid-19-exercise2/src/covid-19-data.json";
	private static final String DATE = "18/05/2020";
	
	public static void main(String[] args) {
		DataProcessor processor = new DataProcessor();
		//TODO
		ArrayList<Record> records = processor.getDataByDate(FILE_PATH, DATE);
		sortAndPrint(records);
	}
		
	public static void sortAndPrint(ArrayList<Record> records) {
		records.sort((record1, record2)-> Integer.compare(record2.getCases(), record1.getCases()));
		//TODO
		for(int i=0;i<records.size();i++) {
			Record recordObject2 = records.get(i);
			if(recordObject2.getCases()>=1000) {
				System.out.println(recordObject2);
			}
		}
	}
}
