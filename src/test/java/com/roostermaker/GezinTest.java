package com.roostermaker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GezinTest {

    @Test
    public void testBepaalVerhouding(){
        assertTrue(Gezin.bepaalVerhouding("1"), true);
    }
    
}
