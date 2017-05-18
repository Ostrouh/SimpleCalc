import Model.Calc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void testGetResult(){
        String source = "2 1 3 + * 4 / 2 ^";

        assertEquals("Unexpected result", 4.0, new Calc().getResult(source), 0.001);
    }
}
