package com.roostermaker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.roostermaker.gezin_zaken.Gezin;

public class GezinTest {

    @Test
    public void testBepaalVerhouding(){
        assertTrue(Gezin.bepaalVerhouding("1"), true);
    }
    
}
