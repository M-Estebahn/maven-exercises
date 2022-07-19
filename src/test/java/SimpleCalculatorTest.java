import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoAndTwoIsFour(){
        SimpleCalculator calculator=new SimpleCalculator();
        int test = calculator.add(2,2);

        assertEquals(4,test);

    }

}