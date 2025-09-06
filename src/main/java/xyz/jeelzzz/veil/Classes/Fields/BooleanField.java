package xyz.jeelzzz.veil.Classes.Fields;

import xyz.jeelzzz.veil.Classes.Field;

public class BooleanField extends Field {
    public BooleanField(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object data) {
        return (data instanceof Boolean);
    }
}
