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
        assertFalse(option.requiresArg());
    }
    
    @Test
    void testToAddValues() {
        Option option = new Option("test", true, "description");
        
        option.valuesep = 'v';
        option.addValueForProcessing("testValue");
//        option1.addValueForProcessing("testValue2");
//        System.out.println(option1.getValuesList());
        assertEquals("testValue",option.getValue());
        assertEquals("[testValue]",option.getValuesList().toString());
    }
    
    @Test
    void testForEqual() {
    Option option = new Option(null, null);
    Option option1 = new Option("test", true, "description");
    Option option2 = new Option("test", "longOptTest", true, "description");
    assertFalse(option1.equals(option));
    assertFalse(option2.equals(option1));
    assertFalse(option.equals(null));
    }
    
    // Write more tests here...
}
