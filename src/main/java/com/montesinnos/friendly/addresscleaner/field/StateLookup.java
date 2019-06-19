package com.montesinnos.friendly.addresscleaner.field;

import com.montesinnos.friendly.commons.lookup.LookupMap;
import com.montesinnos.friendly.commons.lookup.LookupMapFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StateLookup extends FieldLookup {
    @Override
    public LookupMap load() {
        final Map<String, String> stateNames = new HashMap<>();
        stateNames.put("Alabama", "AL");
        stateNames.put("Alaska", "AK");
        stateNames.put("Alberta", "AB");
        stateNames.put("American Samoa", "AS");
        stateNames.put("Arizona", "AZ");
        stateNames.put("Arkansas", "AR");
        stateNames.put("Armed Forces (AE)", "AE");
        stateNames.put("Armed Forces Americas", "AA");
        stateNames.put("Armed Forces Pacific", "AP");
        stateNames.put("British Columbia", "BC");
        stateNames.put("California", "CA");
        stateNames.put("Colorado", "CO");
        stateNames.put("Connecticut", "CT");
        stateNames.put("Delaware", "DE");
        stateNames.put("District Of Columbia", "DC");
        stateNames.put("Florida", "FL");
        stateNames.put("Georgia", "GA");
        stateNames.put("Guam", "GU");
        stateNames.put("Hawaii", "HI");
        stateNames.put("Idaho", "ID");
        stateNames.put("Illinois", "IL");
        stateNames.put("Indiana", "IN");
        stateNames.put("Iowa", "IA");
        stateNames.put("Kansas", "KS");
        stateNames.put("Kentucky", "KY");
        stateNames.put("Louisiana", "LA");
        stateNames.put("Maine", "ME");
        stateNames.put("Manitoba", "MB");
        stateNames.put("Maryland", "MD");
        stateNames.put("Massachusetts", "MA");
        stateNames.put("Michigan", "MI");
        stateNames.put("Minnesota", "MN");
        stateNames.put("Mississippi", "MS");
        stateNames.put("Missouri", "MO");
        stateNames.put("Montana", "MT");
        stateNames.put("Nebraska", "NE");
        stateNames.put("Nevada", "NV");
        stateNames.put("New Brunswick", "NB");
        stateNames.put("New Hampshire", "NH");
        stateNames.put("New Jersey", "NJ");
        stateNames.put("New Mexico", "NM");
        stateNames.put("New York", "NY");
        stateNames.put("Newfoundland", "NF");
        stateNames.put("North Carolina", "NC");
        stateNames.put("North Dakota", "ND");
        stateNames.put("Northwest Territories", "NT");
        stateNames.put("Nova Scotia", "NS");
        stateNames.put("Nunavut", "NU");
        stateNames.put("Ohio", "OH");
        stateNames.put("Oklahoma", "OK");
        stateNames.put("Ontario", "ON");
        stateNames.put("Oregon", "OR");
        stateNames.put("Pennsylvania", "PA");
        stateNames.put("Prince Edward Island", "PE");
        stateNames.put("Puerto Rico", "PR");
        stateNames.put("Quebec", "QC");
        stateNames.put("Rhode Island", "RI");
        stateNames.put("Saskatchewan", "SK");
        stateNames.put("South Carolina", "SC");
        stateNames.put("South Dakota", "SD");
        stateNames.put("Tennessee", "TN");
        stateNames.put("Texas", "TX");
        stateNames.put("Utah", "UT");
        stateNames.put("Vermont", "VT");
        stateNames.put("Virgin Islands", "VI");
        stateNames.put("Virginia", "VA");
        stateNames.put("Washington", "WA");
        stateNames.put("West Virginia", "WV");
        stateNames.put("Wisconsin", "WI");
        stateNames.put("Wyoming", "WY");
        stateNames.put("Yukon Territory", "YT");

        final Map<String, String> stateCodes = stateNames.values()
                .stream()
                .collect(Collectors.toMap(Function.identity(), Function.identity()));

        return LookupMapFactory.fromMaps(stateNames, stateCodes);
    }
}
