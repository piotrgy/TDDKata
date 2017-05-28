import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by piotr_gy on 28.05.17.
 */
public class CalcTest {

    private Calc calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calc();

    }


    @Test
    public void addTest() {
        //given
        String input = new String("2 8");
        int expectedResult = 10;

        //when
        int result = calc.add(input);

        //then
        assertEquals(expectedResult, result);

    }

    @Test(expected = NumberFormatException.class)
    public void addTest2() {
        //given
        String input = new String("! 8");

        //when
        int result = calc.add(input);

        //then
        //assertEquals(input, result);

    }
    @Test
    public void addTest3() {
        //given
        String input = new String("1 3 2 2");
        int expectedResult = 8;

        //when
        int result = calc.add(input);

        //then
        assertEquals(expectedResult, result);
    }
    @Test
    public void addTest4() {
        //given
        String input = new String("2\n8");

        int expectedResult = 10;

        //when
        int result = calc.add(input);

        //then
        assertEquals(expectedResult, result);

    }
    @Test(expected = IllegalArgumentException.class)
    public void addTest5() {
        //given
        String input = new String("-10 8");

        //when
        int result = calc.add(input);


    }
    @Test
    public void addTest6() {
        //given
        String input = new String("1001 8");
        int expectedResult = 8;

        //when
        int result = calc.add(input);

        //then
        assertEquals(input, result);

    }
}