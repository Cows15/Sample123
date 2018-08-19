package entity;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({entity.Calculator.class})
public class CalculatorTest {

    @Ignore("Please skip this message")
    @Test
    public void wrongSum() {
        int sum = 0;
        int[] pool = {12, 13, 14};
        for (int i : pool) {
            sum += i;
        }
        System.out.println("Value of array summed is  " + sum);
        assertEquals(38, sum);
    }

    @Test
    public void wrongString() {
        String retro = "Igloo";
        assertEquals("Igloo", retro);

//    @Test
//    public void addingNumbers(){
//
//        Calculator c = new Calculator();
//        int [] numbs = {1,2,3,4,5};
//        int summer = c.sumOfNumbers(numbs);
//        assertEquals(15,summer);
//    }

    }
}