import org.junit.jupiter.api.Test;
import xyz.jeelzzz.veil.Classes.Schemas.ConfigSchema;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testBasicUsage() {

        ConfigSchema schema = new ConfigSchema();
        Map<String, Object> test = Map.of("name", "marcel", "numbers", "hi");

        boolean valid = schema.validate(test);
        assertTrue(valid);
    }
}
