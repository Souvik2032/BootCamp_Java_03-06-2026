package AccessModifier;

public class Public extends B {

	public static void main(String[] args) {
		Public obj= new Public();
		int output= obj.x;
		System.out.println("Value is "+output);
		obj.b1();
	}

}
