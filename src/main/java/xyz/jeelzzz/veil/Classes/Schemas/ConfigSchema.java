package xyz.jeelzzz.veil.Classes.Schemas;

import xyz.jeelzzz.veil.Classes.Fields.IntField;
import xyz.jeelzzz.veil.Classes.Fields.StringField;
import xyz.jeelzzz.veil.Classes.Schema;

public class ConfigSchema extends Schema {
    public ConfigSchema() {
        addField(new StringField("name"));
        addField(new IntField("numbers"));
    }
}
