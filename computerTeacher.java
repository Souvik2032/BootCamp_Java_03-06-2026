package variable_testing;

public class computerTeacher extends teacher {
		String mainSubject="Physics";
		void display() {
			System.out.println("College: " +collegeName);
			System.out.println("Designation: " +designation);
			System.out.println("Main Subject: " +mainSubject);
		}
	public static void main(String[] args) {
		computerTeacher obj= new computerTeacher();
		obj.display();

	}

}
