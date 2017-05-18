import Model.ReversePolishNotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class ReversePolishNotationTest {

    @Test
    public void testCreateOutput(){
        String source = "(2*(1+3)/4)^2";
        String expected = "2 1 3 + * 4 / 2 ^";

        String actual = ReversePolishNotation.createOutput(source);
        assertEquals("Unexpected string value", expected, actual);
    }

}

