package com.roostermaker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TakenTest {

    @Test
    public void testNieuweTaak(){
        int aantalTaken = Taken.taken.size();
        Taken.taken.add(new Taken("Handen wassen", 1));
        assertEquals(aantalTaken + 1, Taken.taken.size());

    }
}
