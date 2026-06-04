package DecisionMakingStatements;

public class Nested_If {
	public static void main(String args[]) {
	String country="usa";
	if(country.endsWith("India")) {
		if(country.contains("Bihar")) {
			System.out.println("State is Bihar");
		}else if(country.contains("Assam")) {
			System.out.println("State is Assam");
		}else {
			System.out.println("State is not mentioned");
		}
	}else {
		System.out.println("India is not your country");
	}

}
}
