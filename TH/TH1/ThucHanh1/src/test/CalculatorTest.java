package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ra.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    public static final char ADDITION = '+';
    @Test
    @DisplayName("phep cong")
    void testCalculateAdd(){
        int a =1;
        int b=1;
        char o =ADDITION;
        int expected =2;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
    public static final char SUBTRACTION = '-';
    @Test
    @DisplayName("phep tru")
    void testCalculateSub(){
        int firstOperand =6;
        int secondOperand=4;
        char operator  =SUBTRACTION;
        int expected =2;

        int result = Calculator.calculate(firstOperand,secondOperand,operator );
        assertEquals(expected,result);
    }
    public static final char MULTIPLICATION = '*';
    @Test
    @DisplayName("phep nhan")
    void testCalculateMul(){

        int a =8;
        int b=2;
        char o =MULTIPLICATION;
        int expected =16;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
    public static final char DIVISION = '/';
    @Test
    @DisplayName("phep chia")
    void testCalculateDiv(){
        int a =10;
        int b=5;
        char o =DIVISION;
        int expected =2;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
}
