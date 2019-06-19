package com.montesinnos.friendly.addresscleaner.field;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryLookupTest {

    @Test
    void cleanTest() {
        final CountryLookup lookup = new CountryLookup();
        assertEquals(Optional.of("US"), lookup.get("United States"));
        assertEquals(Optional.of("US"), lookup.get("UnitedStates"));
        assertEquals(Optional.of("US"), lookup.get("USA"));
        assertEquals(Optional.of("US"), lookup.get("United States Of america"));
        assertEquals(Optional.of("GB"), lookup.get("United Kingdom"));
        assertEquals(Optional.of("NL"), lookup.get("The Netherlands"));
        assertEquals(Optional.of("IM"), lookup.get("Isle of Man"));
    }
}