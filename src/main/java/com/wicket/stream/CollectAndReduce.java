package com.wicket.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @param
 * @author CHS
 * @version 1.0
 * @copyright WICKET.COM
 * @classname CollectAndReduce
 * @description TODO
 * @date 2020/9/16 17:34
 */
public class CollectAndReduce {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
        List<Integer> numbers = stream.reduce(
                new ArrayList<Integer>(),
                (List<Integer> l,Integer e) ->{
                    l.add(e);
                    return l;},
                    (List<Integer> l1,List<Integer> l2) ->{
                        l1.addAll(l2);
                        return l1;
                    });
        System.out.println(numbers);
    }
}
