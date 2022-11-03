package oefeningen;

public class Outer {

    private int outNum1 = 8;
    private int outNum2 = 16;

    public int getOutNum1() {
        return outNum1;
    }

    public void setOutNum1(int outNum1) {
        this.outNum1 = outNum1;
    }

    public int getOutNum2() {
        return outNum2;
    }

    public void setOutNum2(int outNum2) {
        this.outNum2 = outNum2;
    }

    // nested class
    public class MathFunctions implements oefeningen.MathFunctions {

        public int sum() {
            return outNum1 + outNum2;
        }

        public int min() {
            if (outNum1 < outNum2) {
                return outNum1;
            } else {
                return outNum2;
            }

        }public int max() {
            if (outNum1 > outNum2) {
                return outNum1;
            } else {
                return outNum2;
            }
        }

        @Override
        public double product() {
            return outNum1 * outNum2;
        }

        @Override
        public double division() {
            return (outNum1 + outNum2) /2;
        }
    }
}
