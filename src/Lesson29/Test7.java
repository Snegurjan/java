package Lesson29;

public class Test7 {
    public static void main(String[] args) {
        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 + value2;
            }
        };
        double d = operation.getResult(12, 24);
        System.out.println(d);
        Operation lambda = (value1, value2) -> value1+value2;
    }
}

interface Operation {
    double getResult(double value1, double value2);
}