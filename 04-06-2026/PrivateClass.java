package AccessModifier;
class Sample{
	 int x=9;
}

public class PrivateClass {

	public static void main(String[] args) {
		Sample s= new Sample();
		int result=s.x;
		System.out.println("The value is " + result);

	}

}
