package com.princylabs.chapter1;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Chapter1Test {

    private static Chapter1 chapter1;

    @BeforeAll
    public static void setUp(){
        chapter1 = new Chapter1();
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

    @Test
    public void testRotateMatrix() {
        int[][] matrix = new int[4][4];

        int c = 0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=c;
                c++;
            }
        }

        chapter1.rotateMatrix(matrix);

        assertEquals(matrix[0][0],1);
    }
}
