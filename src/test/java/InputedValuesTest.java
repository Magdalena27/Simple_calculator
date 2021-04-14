
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;


public class InputedValuesTest {

    @Test
    public void createInputedValues() {
        InputedValues inputedValues = new InputedValues();
        assertEquals(0, inputedValues.getValue1(), 1e-20);
        assertEquals(0, inputedValues.getValue2(), 1e-20);
        assertEquals(0, inputedValues.getResult(), 1e-20);
    }


    @Test
    public void properlySetValues() {
        final  String input = "9 \n3\n";

        InputStream stream = new ByteArrayInputStream(input.getBytes());
        InputedValues inputedValues = new InputedValues();
        inputedValues.setValues(stream);
        assertEquals(9, inputedValues.getValue1(), 1e-15);
        assertEquals(3, inputedValues.getValue2(), 1e-15);
    }

}