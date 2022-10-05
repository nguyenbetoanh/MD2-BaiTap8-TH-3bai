package ra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3(){
        int number =3;
        String expected ="Fizz";

        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz15(){
        int number=15;
        String expected ="FizzBuzz";

        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void  testFizz5(){
        int number=5;
        String expected="Buzz";

        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}
