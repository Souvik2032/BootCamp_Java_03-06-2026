package JavaOperators;

public class LogicalOperator {

    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        System.out.println((x > y) && (x < y));
        System.out.println((x > y) && (x < y));
        System.out.println((x > y) || (x < y));
        System.out.println((x > y) || (x < y));
        System.out.println(x != y);
        System.out.println(!(x > y));
    }
}