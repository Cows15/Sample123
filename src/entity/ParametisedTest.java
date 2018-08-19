package entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static entity.Calculator.addASetOfDigits;
import static org.junit.Assert.assertThat;

//@RunWith(Parameterized.class)
//public class ParametisedTest {
//
//    private int number1;
//    private int number2;
//    private int numberExpected;
//
//    public ParametisedTest(int number1,int number2, int numberExpected){
//
//        this.number1 = number1;
//        this.number2 = number2;
//        this.numberExpected = numberExpected;
//    }
//    @Parameters
//    public static Collection<Object[]> data(){
//        return Arrays.asList(new Object[][]{
//                {2,2,4},{4,4,8},{8,8,16},{10,16,26}
//        });
//    }
//
//    @Test
//    public void checkTheSumOfNumbers(){
//        assertThat(addASetOfDigits(number1,number2),is(numberExpected);
//    }


