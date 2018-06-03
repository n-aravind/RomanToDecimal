import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalTest {
//This is a comment just to test
    private RomanToDecimal convert;

    @Before
    public void setUp() {
        convert = new RomanToDecimal();
    }

    @Test
    public void convertRomanIToDecimal1(){
        assertEquals(1,convert.computeDecimalValue("I"));
    }

    @Test
    public void convertRomanIIToDecimal2(){
        assertEquals(2,convert.computeDecimalValue("II"));
    }

    @Test
    public void convertRomanIIIToDecimal3(){
        assertEquals(3,convert.computeDecimalValue("III"));
    }

    @Test
    public void convertRomanVToDecimal5(){
        assertEquals(5,convert.computeDecimalValue("V"));
    }

    @Test
    public void convertRomanVIToDecimal6(){
        assertEquals(6,convert.computeDecimalValue("VI"));
    }

    @Test
    public void convertRomanVIIToDecimal7(){
        assertEquals(7,convert.computeDecimalValue("VII"));
    }

    @Test
    public void convertRomanXToDecimal10(){
        assertEquals(10,convert.computeDecimalValue("X"));
    }

    @Test
    public void convertRomanIVToDecimal4(){
        assertEquals(4,convert.computeDecimalValue("IV"));
    }

    @Test
    public void convertRomanIXToDecimal9(){
        assertEquals(9,convert.computeDecimalValue("IX"));
    }
}
