package com.biconsumer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main (String [] args) {
		Map<String,List<String>> studentDatabse=StudentDatabase.getAllStudents().stream()
				.filter(s->s.getGradeLevel()>3)
				
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		studentDatabse.entrySet().forEach(System.out::println);
	}
	
}
