package entity;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamBLamB {


    public static void main(String[] args) {
        Predicate<String> stringLen = (s) -> s.length() < 20;
        System.out.println("Length of string is " + stringLen.test("Jimmy Macelroy"));

        Consumer<String> chisel = (c) -> System.out.println(c.toUpperCase());
        chisel.accept("Lima Beans");//LIMA BEANS

        BinaryOperator<Integer> nums = (noo, poo) -> (noo + noo);
        System.out.println(nums.apply(100, 2));//30 == noo(1st variable) and (2nd var)
        //console prints 60

        Supplier<String> sda = () -> "JAVA IS GETTING EASIER";
        System.out.println(sda.get());//basically sda instance variable gets the string

        UnaryOperator<String> msg = (q) -> q.toUpperCase();

        System.out.println(msg.apply("Nomad"));

        IntFunction<String> cobvertInt = (num) -> Integer.toString(num);
        System.out.println(cobvertInt.apply(987).length());//length is 3

        IntFunction<String> convertBB = Integer::toString;
        System.out.println(convertBB.apply(5433).length());//length is 4

        Consumer<String> print = System.out::println;//static metho reference to println statement
        print.accept("Going to IBIZA");

        UnaryOperator<String> makeGreeting = "I am So Horny"::concat;//lambda method reference to string class method concat()
        System.out.println(makeGreeting.apply(" for hot sex"));


        //these lambda expressions come from a Functional Interface
        //abstract method in interface are called using instance variables
        Calculate add = (n, m) -> n + m;
        Calculate diff = (o, p) -> Math.abs(o - p);

        System.out.println(add.calc(10, 13));
        System.out.println(diff.calc(90, 56));

        UnaryOperator<String> s = "Hi"::concat;
        System.out.println(s.apply(" Tom"));//prints Hi Tom

        Consumer<String> tits = System.out::println;
        tits.accept("Going on a date");

        List<String> holiday = new ArrayList<>();
        holiday.add("Vietnam");
        holiday.add("USA");
        holiday.add("Turkey");
        holiday.stream().sorted().findFirst();
        System.out.println(holiday);

        Stream.of("Broncos", "Raiders", "Cowboys", "Crows", "Warriors").filter(b -> {
            System.out.println("=======  " + b);
            return b.startsWith("C");
        })
                .forEach(b -> System.out.println("Stars with C " + b));//iterates through list and locates
        //anything that starts with "C"

        Arrays.asList("Honey", "Chocolate", "Coca-Cola", "Peanut-Butter", "Donuts")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //Collections

        Arrays.asList("Red", "Green", "Blue")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);//Returns Blue to console due to Array being sorted alphabetically

        Stream.of("Apple", "Kiwi", "Mango", "Orange", "Passionfruit")
                .filter(fruit -> {
                    System.out.println("Filter is " + fruit);
                    return fruit.startsWith("K");

                })
                .forEach(fruit -> System.out.println("Starts with M " + fruit));//iterates through the streamList and returns
        //mango using lambda variable fruits to invoke the startsWith(), forEach invokes the filter method

        IntStream.range(2, 8)
                .forEach(System.out::println);//prints 2 3 4 5 6 7 (range between 2 -8//8 is excluded)

        Arrays.stream(new int[]{908, 207, 458}).map(n -> n + n).average().ifPresent(System.out::println);


        Stream.of(1.3, 2.6, 3.8).mapToInt(Double::intValue).forEach(System.out::println);//prints all the values truncating doubles to int
        // 1 2 3

        Stream.Builder<String> bus = Stream.builder();
        Stream<String> str = bus.add("LUKE").add("JAMES").add("seb").add("paUl").add("MonicA").build();
        List<String> lit = str.map(String::toLowerCase).collect(Collectors.toList());
        lit.forEach(System.out::print);




    }


    @FunctionalInterface
    public interface Calculate {
        int calc(int x, int y);
    }
}



