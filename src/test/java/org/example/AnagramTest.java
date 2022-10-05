package org.example;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest extends TestCase {

    private final Map<String, String> flipWordInLineData = new HashMap<>();

    @Override
    protected void setUp() throws Exception {
        flipWordInLineData.put("abcd efgh", "dcba hgfe");
        flipWordInLineData.put("a1bcd efg!h", "d1cba hgf!e");

        flipWordInLineData.put("abcd123fgh", "hgfd123cba");
        flipWordInLineData.put("12345678", "12345678");
        flipWordInLineData.put("Hello, World!", "olleH, dlroW!");
        flipWordInLineData.put("asd!@#$%^&*((fgh", "hgf!@#$%^&*((dsa");
        flipWordInLineData.put("private final Map<String, String>", "etavirp lanif gni<rtSpaM, gnirtS>");
        flipWordInLineData.put(null, null);
        flipWordInLineData.put("", "");
    }

    @Override
    protected void tearDown() throws Exception {
        flipWordInLineData.clear();
    }

    public void testAnagram() {

        for (String inputData : flipWordInLineData.keySet()) {

            String actualOutputData = Anagram.flipWordInLine(inputData);
            String trueOutputData = flipWordInLineData.get(inputData);
            assertEquals(actualOutputData, trueOutputData);
        }
    }
}