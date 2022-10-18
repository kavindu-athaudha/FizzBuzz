import org.testng.annotations.Test;

import java.util.List;

public class FizzBuzz {
    public static String fizzBuzz(Integer number){
        return "Fizz";
    }

    @Test
    public static void testFizzBuzz(){
        assert fizzBuzz(1).equals("1");
        assert fizzBuzz(3).equals("Fizz");
        assert fizzBuzz(5).equals("Buzz");
        assert fizzBuzz(15).equals("FizzBuzz");
    }
}
