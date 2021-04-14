import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputedValues {

    private double value1;
    private double value2;
    private double result;

    public  void setValue1(final double value1) {
        this.value1 = value1;
    }

    public void setValue2(final double value2) {
        this.value2 = value2;
    }

    public void setResult(final double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public double getValue2() {
        return value2;
    }

    public double getValue1() {
        return value1;
    }

    void setValues(InputStream inputStream) {
        try {
            System.out.println("Input your numbers.\nValue1: ");
            Scanner scanner = new Scanner(inputStream);
            value1 = scanner.nextDouble();
            System.out.println("Value2: ");
            value2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Wrong input. Expected float number.");
        }
    }

}
