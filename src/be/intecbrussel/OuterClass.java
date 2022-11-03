package be.intecbrussel;

public class OuterClass {

    // properties ...
    private int outerNumber = 10;

    // constructors

    // getters and setters, methods
    public int getOuterNumber() {
        return outerNumber;
    }

    public void setOuterNumber(int outerNumber) {
        this.outerNumber = outerNumber;
    }

    class InnerClass {

        // properties ...
        private int innerNumber = 5;

        // constructors

        // getters and setters, methods
        public int getInnerNumber() {
            return innerNumber;
        }

        public void setInnerNumber(int innerNumber) {
            this.innerNumber = innerNumber;
        }
    }

    public static class StaticInnerClass {

        // properties ...
        private int staticInnerNumber = 50;

        public int getStaticInnerNumber() {
            return staticInnerNumber;
        }

        public void setStaticInnerNumber(int staticInnerNumber) {
            this.staticInnerNumber = staticInnerNumber;
        }
    }

}
