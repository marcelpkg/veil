import org.junit.jupiter.api.Test;
import xyz.jeelzzz.veil.Schema;
import xyz.jeelzzz.veil.primitives.StringSchema;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class MainTest {
    @Test
    public void testBasicUsage() {
//        TODO: a more elegant way to create a schema, like Veil.string()
//              need to figure out how it'd work with non-primitive schema types
        Schema testSchema = new StringSchema();
        boolean valid = testSchema.validate("hi");
        assertTrue(valid);
    }
}
