package com.princylabs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Chapter1Test {

    private static com.princylabs.Chapter1 chapter1;

    @BeforeAll
    public static void setUp(){
        chapter1 = new com.princylabs.Chapter1();
    }

    @Test
    public void testHasUniqueChar() {
        String str = "qwerty";
        String str2 = "qwertyyy";

        assertTrue(chapter1.hasUniqueChar(str));
        assertTrue(!chapter1.hasUniqueChar(str2));
    }

    @Test
    public void testPermutation() {
        String str1 = "qwerty";
        String str2 = "ytrewq";
        String str3 = "poiutb";

        assertTrue(chapter1.permutation(str1,str2));
        assertTrue(!chapter1.permutation(str1,str3));
    }

    @Test
    public void testUrlify() {
        String str = "I am free      ";
        assertEquals(chapter1.urlify(str.toCharArray(),9), "I%20am%20free");
    }
}
