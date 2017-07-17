package org.xcolab.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utility class for common conversions of ids lists to strings or models.
 */
public final class IdListUtil {
    private final static Logger _log = LoggerFactory.getLogger(IdListUtil.class);

    private IdListUtil() { }

    /**
     * Converts a string representation of id lists into an actual list
     * The list should only consists of numbers, commas, and (optionally) any amount of spaces.
     */
    public static List<Long> getIdsFromString(String commaSeparated) {
        if (StringUtils.isEmpty(commaSeparated)) {
            return Collections.emptyList();
        }
        String[] stringIds = commaSeparated.trim().split("\\s*,\\s*");
        return Stream.of(stringIds)
                .filter(StringUtils::isNumeric)
                .map(Long::valueOf)
                .collect(Collectors.toList());
    }

    /**
     * Converts a list of ids into a comma separated string
     */
    public static String getStringFromIds(Collection<Long> ids) {
        return StringUtils.join(ids, ',');
    }
}
