package com.roostermaker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TakenTest {
    private TestScanner testScanner;

    @Test
    public void testMaaknieuweTaak(){
        new Taken("opruimen", 10);
        testScanner.setString("opruimen");
        // assertEquals(10, Taken.maakNieuweTaak(testScanner);

    }
}
