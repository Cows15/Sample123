package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class TrickyShit {

    public static void main(String[] args) {

//        System.out.println("Enter your number to see the conversion");
//        Scanner s = new Scanner(System.in);
//        int noodle = s.nextInt();
//
//        String sal = Integer.toBinaryString(noodle);
//
//        System.out.println("This is the converted integer to binary = "+ sal);

        String qp = "01000001";
        StringBuilder sb = new StringBuilder();
        Arrays.stream(qp.split("(?<=\\G.{8})"))
                .forEach(s -> System.out.print((char) Integer.parseInt(s, 2)));

        System.out.println("\n");
        System.out.println("\n");

        String qp11 = "01000001";
        int index = 0;
        while( index<qp11.length()){
            Integer num = Integer.parseInt(qp11);
            char letter = (char) (int) num;
//            gee += index;
            index++;
            System.out.println(letter);
        }



    }
//        char [] cxz = qp.toCharArray();
//        byte [] poo = qp.getBytes();
//        System.out.println(poo.length);
        //i wish to convert a binary number to a string
        //below method converts char to binary string

//        System.out.println("01000001".getBytes());
//
//        List<String> asd = new ArrayList<>();
//        asd.add("Jimmy");
//        asd.add("Eats");
//        asd.add("Food");
//
//        List<String> afl = new ArrayList<>();
//        afl.add("Whilst");
//        afl.add("Sipping");
//        afl.add("Coffee");
//
//        System.out.println(asd+""+ afl);//concats both ArrayLists together
//
//        BinaryOperator<Float> dee = (no412,no41)-> (no412+no41);
//        System.out.println(dee.apply(34.2f,98.2f));//adds both together
//
//        Predicate<String> msg = (a) -> a.isEmpty();
//            System.out.println(msg.test(""));//true
//
//        String carol = "Janis";
//        String wendy = "";
//        for(int w = carol.length()-1; w >= 0; w--){
//            wendy += carol.charAt(w);
//
//        }
//        System.out.println(wendy+carol);
//
//
//
//        long [] red = {230000,23224,2235435,26};
//        long [] loe = {3455,9886,123};
//        for(long d : red){
//            System.out.println(d);
//            loe = red;//first array reassigned into second array
//        }
//        System.out.println(Arrays.toString(loe));
//
//
//
////        char c = 'A';
////        String tim = Integer.toBinaryString(c);
////        System.out.println(tim);//1000001
//
////        byte [] qw = "01000001".getBytes();
////        System.out.println(qw);//big number
//
//
//    }
    }

