package xyz.jeelzzz.veil;

import java.util.HashMap;
import java.util.Map;

/**
 * Schemas are types or objects that can be used to validate that data matches it.
 */
public interface Schema {
    boolean validate(Object value);
}
