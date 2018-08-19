package entity;

public class Calculator {

    public int sumOfNumbers(int [] names) {

        int sum =0;
        for(int n : names){
            sum += n;
        }
        return sum;

    }

    public static int addASetOfDigits(int a, int b){
        return a + b;
    }
}