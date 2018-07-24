package com.princylabs.chapter4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Chapter4Test {

    private static In in;
    private static Graph graph;

    @BeforeAll
    public static void setUp() {
        in = new In(Chapter4Test.class.getResource("tinyG.txt").getFile());
        graph = new Graph(in);
    }

    @Test
    public void testCreatingBasicGraph() {
        assertNotEquals(graph.V(), 0);
        assertNotEquals(graph.E(), 0);
    }



}
