package com.montesinnos.friendly.addresscleaner.field;

import com.montesinnos.friendly.addresscleaner.field.ZipNormalizer;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ZipNormalizerTest {

    @Test
    void isValidUSZipTest() {
        assertTrue(ZipNormalizer.isValidUSZip("12345"));
        assertTrue(ZipNormalizer.isValidUSZip("00000"));
        assertTrue(ZipNormalizer.isValidUSZip("43214-1530"));
        assertFalse(ZipNormalizer.isValidUSZip("UGX 234"));
    }

    @Test
    void getFormattedUSZipTest() {
        final ZipNormalizer zipNormalizer = new ZipNormalizer();
        assertEquals("43214-1530", zipNormalizer.normalize("43214-1530"));
        assertEquals("43214-1530", zipNormalizer.normalize("432141530"));
        assertEquals("12235", zipNormalizer.normalize("12 2 35"));
    }
}