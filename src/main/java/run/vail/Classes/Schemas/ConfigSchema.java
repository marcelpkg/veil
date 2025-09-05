package run.vail.Classes.Schemas;

import run.vail.Classes.Fields.IntField;
import run.vail.Classes.Fields.StringField;
import run.vail.Classes.Schema;

public class ConfigSchema extends Schema {
    public ConfigSchema() {
        addField(new StringField("name"));
        addField(new IntField("numbers"));
    }
}
