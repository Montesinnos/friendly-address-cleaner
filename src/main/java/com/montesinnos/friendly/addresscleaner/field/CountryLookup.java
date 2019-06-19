package com.montesinnos.friendly.addresscleaner.field;

import com.montesinnos.friendly.commons.lookup.LookupMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.montesinnos.friendly.commons.lookup.LookupMapFactory.fromMaps;

public class CountryLookup extends FieldLookup {
    @Override
    public LookupMap load() {

        final Map<String, String> countryNames = Arrays.stream(Locale.getISOCountries())
                .map(x -> new Locale("", x))
                .collect(Collectors.toMap(Locale::getDisplayCountry, Locale::getCountry));


        final Map<String, String> countryCodes = countryNames.values()
                .stream()
                .collect(Collectors.toMap(Function.identity(), Function.identity()));


        final Map<String, String> extraCountries = new HashMap<>();
        extraCountries.put("USA", "US");
        extraCountries.put("United States Of america", "US");
        extraCountries.put("The Netherlands", "NL");

        return fromMaps(countryNames, countryCodes, extraCountries);
    }
}