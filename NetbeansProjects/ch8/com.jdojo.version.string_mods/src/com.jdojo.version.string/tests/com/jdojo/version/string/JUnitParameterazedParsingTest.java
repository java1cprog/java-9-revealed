package com.jdojo.version.string;

//Version String=9
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitParameterazedParsingTest {

    @Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"9",new VersionInfo("9")}, 
            {"9.1",new VersionInfo("9.1")}, 
            {"9.1.2",new VersionInfo("9.1.2")}, 
            {"9.1.2.3.4",new VersionInfo("9.1.2.3.4")}, 
           // {"9.0.0",new VersionInfo("9.0.0")},
            {"9.1.2-ea+153",new VersionInfo("9.1.2-ea+153")}, 
            {"9+132",new VersionInfo("9+132")}, 
            {"9-ea+132-2016-08-23",new VersionInfo("9-ea+132-2016-08-23")}, 
            {"9+-123",new VersionInfo("9+-123")},
            {"9.0.1-ea+132-2016-08-22.10.56.45am",new VersionInfo("9.0.1-ea+132-2016-08-22.10.56.45am")}
            
        });
        
        
    }
    private final String input;
    private final VersionInfo expected;

    public JUnitParameterazedParsingTest(String input, VersionInfo expected) {
        this.input = input;
        this.expected = expected;
    }
    
@Test
public void test(){
    System.out.println(expected);
}
}
