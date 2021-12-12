package edu.leicester.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OptionTest {

    @Test
    void testConstructor() {
        Option option = new Option("test", "test", true, "description");
        option.optionalArg = true;
        assertTrue(option.acceptsArg());
        assertTrue(option.hasLongOpt());
        assertFalse(option.requiresArg());
        
    }

    @Test
    void testToSetArgName() {
        Option option = new Option("optTest", "longOptTest", true, "description");
        option.setArgName("TestArgName");
        assertEquals("TestArgName", option.getArgName());
        assertTrue(option.hasArgName());
        assertEquals("[ option: optTest longOptTest  [ARG] :: description :: class java.lang.String ]",option.toString());
    }
    
    @Test
    void testToTestHasArgName() {
        Option option = new Option("test", "description");
        option.setArgName(null);
        assertFalse(option.hasArgName());
    }
    
    @Test
    void testToAddValues() {
        Option option = new Option("test", "test", true, "description");
        option.valuesep = 'v';
        option.numberOfArgs = 5;        
        option.addValueForProcessing("testValue");
//        option1.addValueForProcessing("testValue2");
//        System.out.println(option1.getValuesList());
        assertEquals("testValue",option.getValue());
        assertEquals("[testValue]",option.getValuesList().toString());
    }
    
    // Write more tests here...
}
