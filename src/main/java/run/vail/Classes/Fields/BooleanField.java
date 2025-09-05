package run.vail.Classes.Fields;

import run.vail.Classes.Field;

public class BooleanField extends Field {
    public BooleanField(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object data) {
        return (data instanceof Boolean);
    }
}
