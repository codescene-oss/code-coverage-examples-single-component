package com.codescene;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringsTest {

    private static Strings strings;
    @BeforeAll
    static void setUp(){
        strings = new Strings();
    }

    @Test
    void capitalizeNull(){
        Assertions.assertNull(strings.capitalize(null));
    }

    @Test
    void capitalize(){
        Assertions.assertEquals("This Is A Test", strings.capitalize("this is a TEST"));
    }
}
