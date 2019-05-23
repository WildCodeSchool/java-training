import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArrayTrainingTest extends MainTest {

    @Test
    public void testEmptyIntArray() {
        StringTraining obj = new StringTraining();
        String methodName = "emptyIntArray";
        Class[] args = new Class[]{String[].class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] result = {0, 0, 0, 0};
            Assert.assertEquals("Method: " + methodName,
                    result,
                    method.invoke(obj, 4));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
