public class Calculator {
    public void calcAverage(int num1, double num2) {
        double average = (num1 + num2) / 2;
        System.out.println("The average is " + average);
    }

    public void calcAverage(int num1, int num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is " + average);
    }
}