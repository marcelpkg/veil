package xyz.jeelzzz.veil.Classes.Fields;


import xyz.jeelzzz.veil.Classes.Field;

public class IntField extends Field {
    public IntField(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object data) {
        return (data instanceof Integer);
    }
}
