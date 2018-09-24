package tests;

import exercices.Primitives;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitivesTest extends MainTest {

    @Test
    public void testInteger() {
        Primitives obj = new Primitives();
        String methodName = "integer";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("1. integer", 42, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStr() {
        Primitives obj = new Primitives();
        String methodName = "str";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("2. str", "Hello", method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReal() {
        Primitives obj = new Primitives();
        String methodName = "real";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("3. real", 3.14, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBool() {
        Primitives obj = new Primitives();
        String methodName = "bool";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("4. bool", false, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNothing() {
        Primitives obj = new Primitives();
        String methodName = "nothing";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertNull("5. nothing", method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
