package AccessModifier;

class B {
 int x=10;
    public void b1() {  
        System.out.println("This is a normal method");
    }

    protected int z = 10;

    protected void ProtectedMethod() {
        System.out.println("Protected Method");
    }
}

public class Default {

    public static void main(String[] args) {
        B obj = new B();

        int result = obj.x;
        System.out.println("Result is " + result);

        obj.b1();   
        obj.ProtectedMethod();  
    }
}