import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {


    @Test
    public void createAddition() {
        final Addition addition = new Addition();
        assertEquals(0, addition.getValue1(), 1e-20);
        assertEquals(0, addition.getValue2(), 1e-20);
        assertEquals(0, addition.getResult(), 1e-20);
    }

    @Test
    public void addProperly() {
        final Addition addition = new Addition();
        addition.setValue1(15.5);
        addition.setValue2(20);
        addition.count();
        assertEquals(35.5, addition.getResult(), 1e-20);
    }
}