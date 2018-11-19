package com.montesinnos.friendly.addresscleaner.field;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateTest {

    @Test
    void cleanTest() {
        final State state = new State();
        assertEquals(Optional.of("CA"), state.get("cal iforniA"));
        assertEquals(Optional.of("CA"), state.get("ca"));
    }
}