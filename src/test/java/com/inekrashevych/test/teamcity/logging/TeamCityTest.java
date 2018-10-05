package com.inekrashevych.test.teamcity.logging;

import java.util.stream.LongStream;

import org.junit.Test;

public class TeamCityTest {
    @Test
    public void testExtensiveLogging() {
        LongStream.range(0, 1_000_000).forEach(l ->
                System.out.println("test " + l + " this is a long line test that is supposed to cause troubles at console. yes, it is super long, you can not read this even. It is even longer than reading the whole log from book"));
    }
}
