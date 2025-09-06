package xyz.jeelzzz.veil.Classes.Fields;

import xyz.jeelzzz.veil.Classes.Field;

public class StringField extends Field {
    public StringField(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object data) {
        return (data instanceof String);
    }
}
