package com.jdojo.version.string;

import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitVersionParsingTest {

    
    private static Runtime.Version parse(String versonString) {
        Runtime.Version version = Runtime.Version.parse(versonString);
        return version;
    }

    @Test
    public void test_magor1() {
        final String inputMajor = "9";
        final int expectedMajor = Integer.parseInt(inputMajor, 10);

        final Runtime.Version version = parse(inputMajor);
        
        assertEquals(expectedMajor, version.major());

    }
    
    @Test
    public void test_minor1() {
        final String input = "9.1";
        final String[] array = input.split("\\.");
        final int expectedMajor = Integer.parseInt(array[0],10);
        final int expectedMinor = Integer.parseInt(array[1],10);

        final Runtime.Version version = parse(input);
        
        assertEquals(expectedMajor, version.major());
        assertEquals(expectedMinor, version.minor());

    }
    
    @Test
    public void test_security1() {
        final String input = "9.1.2";
        final String[] array = input.split("\\.");
        final int expectedMajor = Integer.parseInt(array[0],10);
        final int expectedMinor = Integer.parseInt(array[1],10);
        final int expectedSecurity = Integer.parseInt(array[2],10);

        final Runtime.Version version = parse(input);
        
        assertEquals(expectedMajor, version.major());
        assertEquals(expectedMinor, version.minor());
        assertEquals(expectedSecurity, version.security());

    }
    
}
