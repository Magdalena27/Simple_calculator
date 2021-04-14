import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    
        @Test
        public void createMultiplication() {
            final Multiplication multiplication = new Multiplication();
            assertEquals(0, multiplication.getValue1(), 1e-20);
            assertEquals(0, multiplication.getValue2(), 1e-20);
            assertEquals(0, multiplication.getResult(), 1e-20);
        }

        @Test
        public void multiplicateProperly() {
            final Multiplication multiplication = new Multiplication();
            multiplication.setValue1(15.5);
            multiplication.setValue2(10);
            multiplication.count();
            assertEquals(155, multiplication.getResult(), 1e-20);
        }
    }

