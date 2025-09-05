package run.vail.Classes.Fields;


import run.vail.Classes.Field;

public class IntField extends Field {
    public IntField(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object data) {
        return (data instanceof Integer);
    }
}
