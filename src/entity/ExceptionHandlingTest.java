package entity;

import org.junit.Test;


public class ExceptionHandlingTest {

    @Test(expected = ArithmeticException.class)
    public void cannotDivideByZero(){
        int x = 10/0;
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void outOB(){
        int [] reg = {1,2,3,4};
        System.out.println(reg[-1]);
    }
}
