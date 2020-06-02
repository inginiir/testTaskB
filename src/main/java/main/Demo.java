package main;

public class Demo {

    private static int[] m = {3, 7};
    public static void main(String[] args) {
        Calculator calculator = new Calculator();



        int result = calculator.sumOfMinTwoMinElements(m);
        System.out.println(result);
    }
}
