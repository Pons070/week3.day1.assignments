package week3.day1;

public class Students {
	
	public void getStudentInfo(String Name, int ID, String Department) {
		
		System.out.println("Student Name is: " +Name);
		System.out.println("Student ID is: " +ID);
		System.out.println("Department Name is: " +Department);
		
		
	}
	
	public void getStudentInfo(String CollegeName, String Collegecode) {
		System.out.println("College Name is: " +CollegeName);
		System.out.println("College Code is: " +Collegecode);
		
	}
	public void getStudentInfo(double CGPA, String phoneNumber) {
		System.out.println("Student CGPA is: " +CGPA);
		System.out.println("Student Number is: " +phoneNumber);
		
	}

	public static void main(String[] args) {
		
		Students studentInfo = new Students();
		
		studentInfo.getStudentInfo(72.1, "9043464005");
		studentInfo.getStudentInfo("Anna University", "AU0022");
		studentInfo.getStudentInfo("Ponsangkar", 22070, "Civil");
	}
	
	
}
