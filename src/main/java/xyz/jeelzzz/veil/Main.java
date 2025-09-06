package xyz.jeelzzz.veil;

import xyz.jeelzzz.veil.Classes.Schemas.ConfigSchema;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ConfigSchema schema = new ConfigSchema();
        Map<String, Object> test = Map.of("name", "marcel", "numbers", "hi");

        System.out.println(schema.validate(test));
    }
}