package xyz.jeelzzz.veil.primitives;

import xyz.jeelzzz.veil.Schema;

public class StringSchema implements Schema {
    public boolean validate(Object value) {
        return (value instanceof String);
    }
}
