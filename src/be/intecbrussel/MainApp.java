package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println("value outernumber : " + outerClass.getOuterNumber());
        outerClass.setOuterNumber(50);
        System.out.println("value outernumber : " + outerClass.getOuterNumber());

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("value inner number : " + innerClass.getInnerNumber());
        innerClass.setInnerNumber(100);
        System.out.println("value inner number : " + innerClass.getInnerNumber());

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println("value static inner number : " + staticInnerClass.getStaticInnerNumber());
        staticInnerClass.setStaticInnerNumber(500);
        System.out.println("value static inner number : " + staticInnerClass.getStaticInnerNumber());

    }
}
