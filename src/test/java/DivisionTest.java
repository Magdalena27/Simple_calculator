import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {


    @Test
    public void createDivision() {
        final Division division = new Division();
        assertEquals(0, division.getValue1(), 1e-20);
        assertEquals(0, division.getValue2(), 1e-20);
        assertEquals(0, division.getResult(), 1e-20);
    }

    @Test
    public void divideProperly() {
        final Division division = new Division();
        division.setValue1(15);
        division.setValue2(3);
        division.count();
        assertEquals(5, division.getResult(), 1e-20);
    }
}