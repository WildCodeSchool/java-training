package tests;

import exercices.Primitives;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitivesTest extends MainTest {

    @Test
    public void test1Integer() {
        Primitives obj = new Primitives();
        String methodName = "integer";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals(42, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2Str() {
        Primitives obj = new Primitives();
        String methodName = "str";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("Hello", method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3Real() {
        Primitives obj = new Primitives();
        String methodName = "real";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals(3.14, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4Bool() {
        Primitives obj = new Primitives();
        String methodName = "bool";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals(false, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test5Nothing() {
        Primitives obj = new Primitives();
        String methodName = "nothing";
        Class[] args = new Class[] { };

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertNull(method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
