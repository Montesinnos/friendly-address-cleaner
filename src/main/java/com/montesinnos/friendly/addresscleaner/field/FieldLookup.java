package com.montesinnos.friendly.addresscleaner.field;

import com.montesinnos.friendly.commons.lookup.LookupMap;

import java.io.Serializable;
import java.util.Optional;

public abstract class FieldLookup implements Serializable {
    private final LookupMap lookupMap;

    public FieldLookup() {
        this.lookupMap = load();
    }

    public abstract LookupMap load();

    public Optional<String> get(final String input) {
        return lookupMap.get(input);
    }

    public Optional<String> get(final Optional<String> input) {
        if (input.isPresent()) {
            return lookupMap.get(input.get());
        }
        return Optional.empty();
    }

}
