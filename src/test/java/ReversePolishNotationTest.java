import model.RPN;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by ostrouh on 09.04.2017.
 */
public class RPNTest {

    @Test
    public void testCreateOutput(){
        String source = "(2*(1+3)/4)^2";
        String expected = "2 1 3 + * 4 / 2 ^";

        String actual = RPN.createOutput(source);
        assertEquals("Unexpected string value", expected, actual);
    }

}
