package com.montesinnos.friendly.addresscleaner.field;

import java.io.Serializable;
import java.util.Optional;

public abstract class FieldNormalizer implements Serializable {

    public abstract String normalize(final String input);

    public Optional<String> tryToNormalize(final String input) {
        return Optional.ofNullable(normalize(input));
    }

}
