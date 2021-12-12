package edu.leicester.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

public class OptionGroupTest {

    @Test
    void testOptionGroupWithOneOption() {
        Option o = new Option("Option", "Nice option");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(o);
        assertEquals("[-Option Nice option]", optionGroup.toString());
    }

    @Test
    void testOptionGroupWithMultipleOptions() { 
    	Option o1 = new Option("Option1", "First option");
    	Option o2 = new Option("Option2", "Second option");
    	Option o3 = new Option("Option3", "Third option");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(o1);
        optionGroup.addOption(o2);
        optionGroup.addOption(o3);
        
        assertEquals("[-Option1 First option, -Option2 Second option, -Option3 Third option]",optionGroup.toString());
        assertEquals("[Option1, Option2, Option3]",optionGroup.getNames().toString());
        
            
    }
    
    @Test
    void testOptionGroupToGetValues() { 
    	Option o1 = new Option("Option1", "First option");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(o1);
//        System.out.println(optionGroup.getOptions().isEmpty());
        
        Assertions.assertFalse(optionGroup.getOptions().isEmpty());
//        assertEquals("[[ option: Option1  :: First option :: class java.lang.String ]]",optionGroup.getOptions());
            
    }
    
    @Test
    void testOptionGroupWithGetSelected() { 
    	Option o1 = new Option(null, null);
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setSelected(o1);
        assertEquals(null,optionGroup.getSelected());
    }
    
    @Test
    void testOptionGroupWithSetSelected() { 
    	Option o1 = new Option(null, null);
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setSelected(o1);
        assertEquals(null,optionGroup.getSelected());
    }
    
    @Test
    void testOptionGroupwithSetRequired() {
    	OptionGroup optionGroup = new OptionGroup();
    	optionGroup.setRequired(true);
    	assertEquals(true, optionGroup.isRequired());
    }

    // Write more tests here...
}
