package edu.leicester.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OptionsTest {

    @Test
    void testGetOption() {
        Options options = new Options();
        Option option = new Option("opt", "desc");
        options.addOption(option);
        assertEquals(option,options.getOption("opt"));
    }

//    @Test
//    void test
    // Write more tests here...
}
