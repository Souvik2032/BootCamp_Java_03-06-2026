package JavaOperators;

public class AssignmentOperator {

    public static void main(String[] args) {
        int x = 5;
        int var = 0;  
        
        var += x;
        System.out.println("+= " + var);
        
        var -= x;
        System.out.println("-= " + var);
        
        var *= x;
        System.out.println("*= " + var);
    }
}
