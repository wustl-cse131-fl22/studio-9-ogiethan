package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	private Map<String, Student> studentMap;
	public UniversityDatabase() {
		studentMap = new HashMap<String, Student>();
	}

	public void addStudent(String accountName, Student student) {
		studentMap.put(accountName, student);
	}

	public int getStudentCount() {
		return studentMap.size();
	}

	public String lookupFullName(String accountName) {
		if (studentMap.get(accountName)==(null)) {
			return null;
		}
		return studentMap.get(accountName).getFullName();
		
	}

	public double getTotalBearBucks() {
		double total = 0;
		for (String i:studentMap.keySet()) {
			total = total + studentMap.get(i).getBearBucksBalance();
		}
		return total;
	}
}
