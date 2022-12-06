package assignment7;

public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int attemptedCredits;
	private int passingCredits;
	private double totalGradeQualityPoints;
	private double bbBalance;
	public Student (String a, String b, int c) {
		firstName=a;
		lastName=b;
		studentID=c;
	}
	public String getFullName() {
		return firstName +" "+lastName;
	}
	public int getId() {
		return studentID;
	}
	public int getTotalPassingCredits() {
		return passingCredits;
	}
	public double calculateGradePointAverage() {
		return totalGradeQualityPoints/attemptedCredits;
	}
	public void submitGrade(double grade, int credits) {
		attemptedCredits = attemptedCredits+credits;
		if (grade>1.7) {
			passingCredits = passingCredits+credits;
		}
		totalGradeQualityPoints = credits * grade+totalGradeQualityPoints;
		calculateGradePointAverage();
	}
	public String getClassStanding() {
		if (passingCredits<30) {
			return "First Year";
		}
		if (30<=passingCredits&&passingCredits<60) {
			return "Sophomore";
		}
		if (60<=passingCredits&&passingCredits<90) {
			return "Junior";
		} else  {
			return "Senior";
		}
	}
	public boolean isEligibleForPhiBetaKappa() {
		if (passingCredits>=75&&passingCredits<98&&calculateGradePointAverage()>=3.8) {
			return true;
		}if (passingCredits>=98&&calculateGradePointAverage()>=3.6) {
			return true;
		}else {
			return false;
		}
	}
	public void depositBearBucks(double amount) {
		bbBalance = bbBalance + amount;
	}
	public void deductBearBucks(double amount) {
		bbBalance = bbBalance - amount;
	}
	public double getBearBucksBalance() {
		return bbBalance;
	}
	public double cashOutBearBucks() {
		if (bbBalance<=10) {
			double cashOut = 0;
			bbBalance = 0;
			return cashOut;
		}else {
			double cashOut = bbBalance - 10;
			bbBalance = 0;
			return cashOut;
		}
	}
	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		if (isHyphenated==true) {
			Student student1 = new Student(firstName, this.lastName+"-"+otherParent.lastName, id);
			student1.bbBalance = this.cashOutBearBucks()+otherParent.cashOutBearBucks();
			return student1;
		}else {
			Student student2= new Student(firstName, this.lastName, id);
			student2.bbBalance = this.cashOutBearBucks()+otherParent.cashOutBearBucks();
			return student2;
		}
	}
	public String toString() {
		return getFullName()+getId();
	}

}
