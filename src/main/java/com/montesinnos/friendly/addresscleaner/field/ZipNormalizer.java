package com.montesinnos.friendly.addresscleaner.field;

import com.montesinnos.friendly.commons.NumberUtils;
import org.apache.logging.log4j.util.Strings;

public class ZipNormalizer extends FieldNormalizer {

    public static boolean isValidUSZip(final String in) {

        if (Strings.isBlank(in)) {
            return false;
        }
        final String potentialZip = in.replace(" ", "").trim();

        //Can be 5 digits (\d\d\d\d\d)
        if (potentialZip.length() == 5) {
            return NumberUtils.isOnlyDigits(potentialZip);
        }
        //Or 9 digits (\d\d\d\d\d\d\d\d\d)
        else if (potentialZip.length() == 9) {
            return NumberUtils.isOnlyDigits(potentialZip);
        }
        //Or 10 digits (\d\d\d\d\d-\d\d\d\d)
        else if (potentialZip.length() == 10) {
            return NumberUtils.isOnlyDigits(potentialZip.substring(0, 5))
                    && potentialZip.charAt(5) == '-'
                    && NumberUtils.isOnlyDigits(potentialZip.substring(6));
        }

        return false;
    }

    @Override
    public String normalize(final String input) {
        if (!isValidUSZip(input)) {
            return null;
        }

        final String zip = input.replace(" ", "").trim();
        if (zip.length() == 9) {
            return zip.substring(0, 5) + "-" + zip.substring(5);
        }
        return zip;
    }
}
