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

    @Test
    public void thouthandTest1() {
        int x = -1000;
        boolean res = MyMath.thouthand(x);
        assertFalse(res);
    }

    @Test
    public void thouthandTest2() {
        int x = 30;
        boolean res = MyMath.thouthand(x);
        assertTrue(res);
    }

    @Test
    public void thouthandTest3() {
        int x = 31;
        boolean res = MyMath.thouthand(x);
        assertFalse(res);
    }

    @Test
    public void thouthandTest4() {
        int x = 78;
        boolean res = MyMath.thouthand(x);
        assertTrue(res);
    }

    @Test
    public void thouthandTest5() {
        int x = 101;
        boolean res = MyMath.thouthand(x);
        assertFalse(res);
    }

    @Test
    public void thouthandTest6() {
        int x = 102;
        boolean res = MyMath.thouthand(x);
        assertTrue(res);
    }
}