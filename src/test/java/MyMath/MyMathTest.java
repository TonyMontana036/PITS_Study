package MyMath;

import static org.testng.Assert.*;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MyMathTest {

    @Test
    public void setLengthZero() {
        int x = 0;
        String y = "Пиво";
        String expResult = "0";
        String result = MyMath.setLength(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void setLengthPositive() {
        int x = 1;
        String y = "Вода";
        String expResult = "Вода1";
        String result = MyMath.setLength(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void setLengthNegative() {
        int x = -1;
        String y = "Размазня";
        String expResult = "-1Размазня";
        String result = MyMath.setLength(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void setLengthBillion() {
        int x = 123456789;
        String y = "Слово";
        String expResult = "Слово12345";
        String result = MyMath.setLength(x, y);
        assertEquals(expResult, result);
    }

    @Test @Ignore
    public void testThouthand() {
    }
}