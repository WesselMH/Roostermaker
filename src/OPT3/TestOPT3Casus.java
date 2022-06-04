package com.roostermaker.OPT3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestOPT3Casus {

    Vliegtuig vliegtuig2 = new Vliegtuig(850, 2,true, true);
    Vliegtuig vliegtuig3 = new Vliegtuig(1100, 2, true, true);
    
    @Test
    public void testVliegenTrue(){
        
        assertTrue(Vliegtuig.vliegen(true, vliegtuig2.getGewicht(), 40));
        assertTrue(Vliegtuig.vliegen(true, vliegtuig2.getGewicht(), 60));
    }
    
    @Test
    public void testVliegenFalse(){
        assertFalse(Vliegtuig.vliegen(false, vliegtuig2.getGewicht(), 60));
        assertFalse(Vliegtuig.vliegen(true, vliegtuig3.getGewicht(), 40));
    }

    @Test
    public void testGewicht1(){
        Vliegtuig vliegtuig1 = new Vliegtuig(1, 1,false, false);
        assertEquals(100, vliegtuig1.tariefBerekenen());
    }

    @Test
    public void testGewicht999(){
        Vliegtuig vliegtuig999 = new Vliegtuig(999, 1,false, false);
        assertEquals(100, vliegtuig999.tariefBerekenen());
    }

    @Test
    public void testGewicht1000(){
        Vliegtuig vliegtuig1000 = new Vliegtuig(1000, 1,false, false);
        assertEquals(500, vliegtuig1000.tariefBerekenen());
    }

    @Test
    public void testGewicht1001(){
        Vliegtuig vliegtuig1001 = new Vliegtuig(1001, 1,false, false);
        assertEquals(500, vliegtuig1001.tariefBerekenen());    }

    @Test
    public void testGewicht4999(){
        Vliegtuig vliegtuig4999 = new Vliegtuig(4999, 1,false, false);
        assertEquals(500, vliegtuig4999.tariefBerekenen());
    }

    @Test
    public void testGewicht5000(){
        Vliegtuig vliegtuig5000= new Vliegtuig(5000, 1,false, false);
        assertEquals(2500, vliegtuig5000.tariefBerekenen());
    }

    @Test
    public void testGewicht5001(){
        Vliegtuig vliegtuig5001 = new Vliegtuig(5001, 1,false, false);
        assertEquals(2500, vliegtuig5001.tariefBerekenen());
    }

    @Test
    public void testPW1(){
        Vliegtuig vliegtuigPW1 = new Vliegtuig(500, 1,true, true);
        assertEquals(1089, vliegtuigPW1.tariefBerekenen());
    }

    @Test
    public void testPW2(){
        Vliegtuig vliegtuigPW2 = new Vliegtuig(500, 4,false, false);
        assertEquals(150, vliegtuigPW2.tariefBerekenen());
    }

    @Test
    public void testPW3(){
        Vliegtuig vliegtuigPW3 = new Vliegtuig(1500, 1,false, true);
        assertEquals(605, vliegtuigPW3.tariefBerekenen());
    }

    @Test
    public void testPW4(){
        Vliegtuig vliegtuigPW4 = new Vliegtuig(1500, 4,true, false);
        assertEquals(1550, vliegtuigPW4.tariefBerekenen());
    }

    @Test
    public void testPW5(){
        Vliegtuig vliegtuigPW5 = new Vliegtuig(5500, 1,true, false);
        assertEquals(3300, vliegtuigPW5.tariefBerekenen());
    }

    @Test
    public void testPW6(){
        Vliegtuig vliegtuigPW6 = new Vliegtuig(5500, 4,false, true);
        assertEquals(4537, vliegtuigPW6.tariefBerekenen());
    }
}
