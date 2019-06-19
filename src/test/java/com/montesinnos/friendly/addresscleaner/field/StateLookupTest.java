package com.montesinnos.friendly.addresscleaner.field;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateLookupTest {

    @Test
    void cleanTest() {
        final StateLookup stateLookup = new StateLookup();
        assertEquals(Optional.of("CA"), stateLookup.get("cal iforniA"));
        assertEquals(Optional.of("CA"), stateLookup.get("ca"));
    }
}