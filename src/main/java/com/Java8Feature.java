package com;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created By : Jemin
 * Date       : 5/3/17
 * Time       : 11:19 AM
 */
public class Java8Feature {
    public static void main(String argsp[]) {
        List<String> strs = Arrays.asList("Jwmin","patel","","ABS");
        String one = strs.stream().filter(n->!n.isEmpty()).collect(Collectors.joining(","));
        List<String> two = strs.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> sort = strs.stream().sorted().collect(Collectors.toList());
        strs.stream().limit(2).map(String::toUpperCase).forEach(System.out::println);
        System.out.println(one);
        System.out.println(two);
        System.out.println(sort);
    }
}
