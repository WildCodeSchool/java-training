import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArrayTrainingTest extends MainTest {

    @Test
    public void testConcat() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "concat";
        Class[] args = new Class[]{int[].class, int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] first = {3, 6, 5};
            int[] second = {2, 7};
            int[] expected = {3, 6, 5, 2, 7};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (int[]) method.invoke(obj, first, second));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReverse() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "reverse";
        Class[] args = new Class[]{int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {3, 5, 7};
            int[] expected = {7, 5, 3};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (int[]) method.invoke(obj, (Object) array));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEquals() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "equals";
        Class[] args = new Class[]{int[].class, int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] first = {2, 6};
            int[] second = {2, 6};
            Assert.assertEquals("Method: " + methodName,
                    true,
                    method.invoke(obj, first, second));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCapitalize() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "capitalize";
        Class[] args = new Class[]{String[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[] array = {"test", "sample", "value"};
            String[] expected = {"Test", "Sample", "Value"};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (String[]) method.invoke(obj, (Object) array));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testContains() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "contains";
        Class[] args = new Class[]{int[].class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {2, 7, 4};
            Assert.assertEquals("Method: " + methodName,
                    true,
                    method.invoke(obj, array, 7));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSum() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "sum";
        Class[] args = new Class[]{int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {2, 7, 4};
            Assert.assertEquals("Method: " + methodName,
                    13,
                    method.invoke(obj, (Object) array));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReplace() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "replace";
        Class[] args = new Class[]{int[].class, int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {2, 7, 4};
            int[] expected = {2, 3, 4};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (int[]) method.invoke(obj, array, 3, 1));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValueAtPosition() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "valueAtPosition";
        Class[] args = new Class[]{int[].class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {4, 5, 6};
            Assert.assertEquals("Method: " + methodName,
                    5,
                    method.invoke(obj, array, 1));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLastValue() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "lastValue";
        Class[] args = new Class[]{int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {4, 5, 6};
            Assert.assertEquals("Method: " + methodName,
                    6,
                    method.invoke(obj, (Object) array));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFirstValue() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "firstValue";
        Class[] args = new Class[]{int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {4, 5, 6};
            Assert.assertEquals("Method: " + methodName,
                    4,
                    method.invoke(obj, (Object) array));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLength() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "length";
        Class[] args = new Class[]{int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] array = {4, 5, 6};
            Assert.assertEquals("Method: " + methodName,
                    3,
                    method.invoke(obj, (Object) array));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringArray() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "stringArray";
        Class[] args = new Class[]{String.class, String.class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[] result = {"test", "sample", "value"};
            Assert.assertArrayEquals("Method: " + methodName,
                    result,
                    (String[]) method.invoke(obj, "test", "sample", "value"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIntArray() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "intArray";
        Class[] args = new Class[]{int.class, int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] result = {4, 5, 6};
            Assert.assertArrayEquals("Method: " + methodName,
                    result,
                    (int[]) method.invoke(obj, 4, 5, 6));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyStringArray() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "emptyStringArray";
        Class[] args = new Class[]{int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[] result = {null, null};
            Assert.assertArrayEquals("Method: " + methodName,
                    result,
                    (String[]) method.invoke(obj, 2));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyIntArray() {
        ArrayTraining obj = new ArrayTraining();
        String methodName = "emptyIntArray";
        Class[] args = new Class[]{int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] result = {0, 0, 0, 0};
            Assert.assertArrayEquals("Method: " + methodName,
                    result,
                    (int[]) method.invoke(obj, 4));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
