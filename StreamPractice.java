package com.meghana;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> salary = new ArrayList<Integer>();
        salary.add(1000);
        salary.add(2000);
        salary.add(3100);
        salary.add(4200);
        salary.add(5500);

        Long output = salary.stream().filter((Integer sal)->sal>3000).count();
        System.out.println(output);

        Stream<String> OriginalName = Stream.of("Hi","Hello","How","Are","You");
        List<String > newOriginalName = OriginalName.filter((String name)->name.length()>=3).map((String x)->x.toUpperCase()).collect(Collectors.toList()) ;
        System.out.println(newOriginalName);

//
//        Stream<String> newOne = OriginalName.map((String x)->x.toLowerCase());
//        List<String> finalOne = newOne.toList();
//        System.out.println(finalOne);

//        List<List<String>> sentance = Arrays.asList(
//                Arrays.asList("Hi","hello","EveryOne"),
//                Arrays.asList("My", "Name" , "Is" ,"Sushmitha"),
//                Arrays.asList("Who","Are","You")
//        );
//
//        Stream<String> word1 = sentance.stream().flatMap((List<String> sent2)-> sent2.stream().map(String::toUpperCase));
//        List<String > word2 = word1.collect(Collectors.toList());
//        System.out.println(word2);


        Integer[] arr ={1,2,2,3,4,5,6,7,7,9};
        Stream<Integer>  new1 = Arrays.stream(arr).distinct();
        List<Integer> N2 = new1.collect(Collectors.toList());
        System.out.println(N2);

        Integer[] arr1 = {1,2,3,9,4,8,5,7,6};
        List<Integer> arr2 = Arrays.stream(arr1).sorted().collect(Collectors.toList());
        System.out.println(arr2);

        List<Integer> numbersAre = Arrays.asList(1,5,28,46,99);
        List<Integer> numStream = numbersAre.stream().
                filter((Integer val)->val>10).
                peek((Integer val)-> System.out.println(val)).
                map((Integer val)-> 1*val).
                collect(Collectors.toList());
        System.out.println(numStream);


        List<Integer> Numbers = Arrays.asList(2,1,3,4,5,10,30);
        List<Integer> num2 = Numbers.stream().filter((Integer val)->val>=3).
                sorted().min((Integer val1, Integer val2)->val1-val2).
                filter((Integer val)->val>=5).stream().
                collect(Collectors.toList());
        System.out.println(num2);




    }
}




