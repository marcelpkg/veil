package run.vail.Classes;

import run.vail.Classes.Fields.StringField;

import java.util.HashMap;
import java.util.Map;

public class Schema {
    private HashMap<String, Field> fields = new HashMap<>();

    public void addField(Field field) {
        fields.put(field.getName(), field);
    }

    public boolean validate(Map<String, Object> data) {
        for(Field field: fields.values()) {
            String fieldName = field.getName();
            return field.validate(data.get(fieldName));
        }
        return false;
    }
}
