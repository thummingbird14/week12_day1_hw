import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void willAdd(){
        assertEquals( 5, calculator.add(2,3));
    }

    @Test
    public void willSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void willSubtractNegativeResult(){
        assertEquals(-1, calculator.subtract(2,3));
    }

    @Test
    public void willMultiply(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void willDivide(){
        assertEquals(0.666, calculator.divide(2,3), 0.05);
    }

}
