package com.montesinnos.friendly.addresscleaner.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreetNormalizerTest {

    @Test
    void normalizeTest() {
        final StreetNormalizer street = new StreetNormalizer();
        assertEquals("735 State ST", street.normalize("735 State Street"));
        assertEquals("HWY 101", street.normalize("hwy 101"));
        assertEquals("780 Lynnhaven PKWY", street.normalize("780 Lynnhaven Pkwy"));
    }
}