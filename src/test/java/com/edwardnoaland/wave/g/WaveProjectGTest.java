package com.edwardnoaland.wave.g;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectGTest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-g:7", WaveProjectG.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectG.calculate(0));
    }
}
