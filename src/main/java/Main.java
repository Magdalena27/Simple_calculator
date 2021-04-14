import java.io.InputStream;
import java.util.Scanner;

public class Main {
    double resultOfOperation;

    public void chooseMathOperation(char mathOperator, InputStream inputStream) {
        try {
            switch (mathOperator) {
                case '+':
                    System.out.println("You selected addition.\n");
                    final Addition addition = new Addition();
                    addition.setValues(inputStream);
                    addition.count();
                    resultOfOperation = addition.getResult();
                    System.out.println("Your result: " + resultOfOperation);
                    break;
                case '-':
                    System.out.println("You selected subtraction.\n");
                    final Subtraction subtraction = new Subtraction();
                    subtraction.setValues(inputStream);
                    subtraction.count();
                    resultOfOperation = subtraction.getResult();
                    System.out.println("Your result: " + resultOfOperation);
                    break;
                case '*':
                    System.out.println("You selected multiplication.\n");
                    final Multiplication multiplication = new Multiplication();
                    multiplication.setValues(inputStream);
                    multiplication.count();
                    resultOfOperation = multiplication.getResult();
                    System.out.println("Your result: " + resultOfOperation);
                    break;
                case '/':
                    System.out.println("You selected division.\n");
                    final Division division = new Division();
                    division.setValues(inputStream);
                    division.count();
                    resultOfOperation = division.getResult();
                    System.out.println("Your result: " + resultOfOperation);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            System.out.println("Unsupported type of operation! Choose from: + - / *.");
        }
    }

    public char askForContinuation(InputStream inputStream) {
        char yesNo;

        System.out.println("Do you want to continue? (y/n)");
        Scanner scanner1 = new Scanner(inputStream);
        yesNo = scanner1.next().charAt(0);
        return yesNo;
    }

    public static void main(String[] args) {
        char choice;
        char wantToContinue;

        do {

            System.out.println("Choose type of operation from: + - * /");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.next().charAt(0);
            Main main = new Main();
            main.chooseMathOperation(choice, System.in);
            wantToContinue = main.askForContinuation(System.in);

        } while (wantToContinue == 'y');
    }
}
