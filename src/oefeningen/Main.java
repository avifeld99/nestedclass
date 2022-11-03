package oefeningen;

public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();
        System.out.println(outer.getOutNum1());

        Outer.MathFunctions mathFunctions = outer.new MathFunctions();
        System.out.println(mathFunctions.min());
        System.out.println(mathFunctions.division());
    }
}
