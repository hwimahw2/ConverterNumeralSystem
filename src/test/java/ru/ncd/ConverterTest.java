package ru.ncd;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void convertFromAToDecimalIfUnitTest() throws OverFlowException{
        String number = "123";
        int a = 10;
        int b = 10;
        long result = Converter.convertFromAToDecimal(number, a, b);
        assertEquals("Wrong result", 123, result);

    }
    @Test
    public void convertFromAToDecimalElseUnitTest() throws OverFlowException{
        String number = "123";
        int a = 12;
        int b = 10;
        long result = Converter.convertFromAToDecimal(number, a, b);
        assertEquals("Wrong result", 171, result);
    }
    @Test
    public void convertToBNumeralSystemUnitTest(){
        long numberInDecimal = 123;
        String result = Converter.convertToBNumeralSystem(numberInDecimal, 10);
        assertEquals("Wrong result", "123", result);
    }
    @Test
    public void countResult() throws OverFlowException, InputException{
        String result = Converter.countResult("123", 10,10);
        assertEquals("Wrong result", "123", result);

    }
    @Test
    public void noZeros() throws OverFlowException, InputException{
        String result = Converter.noZeros("00000123");
        assertEquals("Wrong result", "123", result);
    }
}
