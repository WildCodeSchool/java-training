import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StringTrainingTest extends MainTest {

    @Test
    public void testJoin() {
        StringTraining obj = new StringTraining();
        String methodName = "join";
        Class[] args = new Class[]{String[].class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[] test = {"sample", "test", "value"};
            Assert.assertEquals("Method: " + methodName,
                    "sample|test|value",
                    method.invoke(obj, test, "|"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSplit() {
        StringTraining obj = new StringTraining();
        String methodName = "split";
        Class[] args = new Class[]{String.class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[] expected = {"sample", "test", "value"};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (String[]) method.invoke(obj, "sample,test,value", ","));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReplaceString() {
        StringTraining obj = new StringTraining();
        String methodName = "replaceString";
        Class[] args = new Class[]{String.class, String.class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "sxhtle",
                    method.invoke(obj, "sample", "amp", "xht"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReplaceChar() {
        StringTraining obj = new StringTraining();
        String methodName = "replaceChar";
        Class[] args = new Class[]{String.class, char.class, char.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "ixampli",
                    method.invoke(obj, "example", 'e', 'i'));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testOccurrences() {
        StringTraining obj = new StringTraining();
        String methodName = "occurrences";
        Class[] args = new Class[]{String.class, char.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    2,
                    method.invoke(obj, "example", 'e'));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCapitalize() {
        StringTraining obj = new StringTraining();
        String methodName = "capitalize";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "Sample",
                    method.invoke(obj, "sample"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSubString() {
        StringTraining obj = new StringTraining();
        String methodName = "subString";
        Class[] args = new Class[]{String.class, int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "amp",
                    method.invoke(obj, "sample", 1, 4));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLastChar() {
        StringTraining obj = new StringTraining();
        String methodName = "lastChar";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    'e',
                    method.invoke(obj, "sample"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFirstChar() {
        StringTraining obj = new StringTraining();
        String methodName = "firstChar";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    's',
                    method.invoke(obj, "sample"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLower() {
        StringTraining obj = new StringTraining();
        String methodName = "lower";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "sample",
                    method.invoke(obj, "sAmPlE"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpper() {
        StringTraining obj = new StringTraining();
        String methodName = "upper";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "SAMPLE",
                    method.invoke(obj, "sAmPlE"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLength() {
        StringTraining obj = new StringTraining();
        String methodName = "length";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    6,
                    method.invoke(obj, "sample"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIntToString() {
        StringTraining obj = new StringTraining();
        String methodName = "intToString";
        Class[] args = new Class[]{int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "42",
                    method.invoke(obj, 42));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCharToString() {
        StringTraining obj = new StringTraining();
        String methodName = "charToString";
        Class[] args = new Class[]{char.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "v",
                    method.invoke(obj, 'v'));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEquals() {
        StringTraining obj = new StringTraining();
        String methodName = "equals";
        Class[] args = new Class[]{String.class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    true,
                    method.invoke(obj, "value", "value"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConcatArgs() {
        StringTraining obj = new StringTraining();
        String methodName = "concatArgs";
        Class[] args = new Class[]{String.class, String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "sampletest",
                    method.invoke(obj, "sample", "test"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHelloFirstname() {
        StringTraining obj = new StringTraining();
        String methodName = "helloFirstname";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Method: " + methodName,
                    "Hello Pedro",
                    method.invoke(obj, "Pedro"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
