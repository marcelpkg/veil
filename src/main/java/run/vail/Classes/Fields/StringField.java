package run.vail.Classes.Fields;

import run.vail.Classes.Field;

public class StringField extends Field {
    public StringField(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object data) {
        return (data instanceof String);
    }
}
