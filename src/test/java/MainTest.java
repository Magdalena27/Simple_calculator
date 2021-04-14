import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main main = new Main();

    @Test
    public void checkChoosingAddition() {
        final  String input = "9 \n3\n";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        main.chooseMathOperation('+',stream);
        assertEquals(12, main.resultOfOperation, 1e-15);
    }

    @Test
    public void checkChoosingSubtraction() {
        final String subtractionInput = "90\n10";
        InputStream stream2 = new ByteArrayInputStream(subtractionInput.getBytes());
        main.chooseMathOperation('-', stream2);
        assertEquals(80, main.resultOfOperation, 1e-15);
    }

    @Test
    public void checkChoosingMultiplication() {
        final String multiplicationString = "15\n3";
        InputStream stream3 = new ByteArrayInputStream(multiplicationString.getBytes());
        main.chooseMathOperation('*', stream3);
        assertEquals(45, main.resultOfOperation, 1e-15);
    }

    @Test
    public void checkChoosingDivision() {
        final String divisionString = "197\n10";
        InputStream stream4 = new ByteArrayInputStream(divisionString.getBytes());
        main.chooseMathOperation('/', stream4);
        assertEquals(19.7, main.resultOfOperation, 1e-15);
    }

    @Test
    public void checkChoosingWrongTypeOfOperation() throws UnsupportedOperationException{
        final String wrongOperation = "2\n5";
        InputStream stream5 = new ByteArrayInputStream(wrongOperation.getBytes());
        main.chooseMathOperation('^', stream5);

    }

    @Test
    public void checkSettingContinuationChoice() {
        final String yesOrNot = "n";
        InputStream stream5 = new ByteArrayInputStream(yesOrNot.getBytes());
        assertEquals('n', main.askForContinuation(stream5));
    }

}
