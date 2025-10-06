package com.codescene;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Strings {

    public String capitalize(String input){
        if(input == null) return null;
        return Arrays.stream(input.split(" "))
                .map(v -> v.substring(0, 1).toUpperCase() + v.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
