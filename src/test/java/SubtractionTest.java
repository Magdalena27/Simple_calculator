import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {


    @Test
    public void createSubtraction() {
        final Subtraction subtraction = new Subtraction();
        assertEquals(0, subtraction.getValue1(), 1e-20);
        assertEquals(0, subtraction.getValue2(), 1e-20);
        assertEquals(0, subtraction.getResult(), 1e-20);
    }

    @Test
    public void subtractProperly() {
        final Subtraction subtraction = new Subtraction();
        subtraction.setValue1(81);
        subtraction.setValue2(11);
        subtraction.count();
        assertEquals(70, subtraction.getResult(), 1e-20);
    }
}

