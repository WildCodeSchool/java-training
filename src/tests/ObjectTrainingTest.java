import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectTrainingTest extends MainTest {

    @Test
    public void testAttributes() {
        ObjectTraining obj = new ObjectTraining();

        Field fieldName = testField(obj, "name");
        Field fieldAge = testField(obj, "age");
        Field fieldWilder = testField(obj, "wilder");

        Assert.assertEquals("1. Wrong type from 'name'", String.class, fieldName.getType());
        Assert.assertEquals("1. Wrong type from 'age'", int.class, fieldAge.getType());
        Assert.assertEquals("1. Wrong type from 'wilder'", boolean.class, fieldWilder.getType());
        try {
            fieldName.set(obj, "Charlie");
            Assert.fail("1. Attribute 'name' must be private !");
        } catch (IllegalAccessException e) {
            //
        }
        try {
            fieldAge.set(obj, 18);
            Assert.fail("1. Attribute 'age' must be private !");
        } catch (IllegalAccessException e) {
            //
        }
        try {
            fieldWilder.set(obj, false);
            Assert.fail("1. Attribute 'wilder' must be private !");
        } catch (IllegalAccessException e) {
            //
        }
    }

    @Test
    public void testConstructor() {
        ObjectTraining obj = new ObjectTraining();
        Class[] args = new Class[]{String.class, int.class};

        Constructor constructor = testConstructor(obj, args);
        try {
            Assert.assertNotNull("2. ObjectTraining(name, age)", constructor.newInstance("Charlie", 18));
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testName() {
        ObjectTraining obj = new ObjectTraining();
        String methodName = "setName";
        Class[] args = new Class[]{String.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertNull("4. setName", method.invoke(obj, "Charlie"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        methodName = "getName";
        args = new Class[]{};
        method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("3. getName", "Charlie", method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAge() {
        ObjectTraining obj = new ObjectTraining();
        String methodName = "setAge";
        Class[] args = new Class[]{int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertNull("6. setAge", method.invoke(obj, 18));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        methodName = "getAge";
        args = new Class[]{};
        method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("5. getAge", 18, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWilder() {
        ObjectTraining obj = new ObjectTraining();
        String methodName = "setWilder";
        Class[] args = new Class[]{boolean.class};

        Method method = testMethod(obj, methodName, args);
        try {
            Assert.assertNull("8. setWilder", method.invoke(obj, true));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        methodName = "isWilder";
        args = new Class[]{};
        method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("7. isWilder", true, method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWhomAmI() {
        ObjectTraining obj = new ObjectTraining();

        String methodName = "setName";
        Class[] args = new Class[]{String.class};
        Method method = testMethod(obj, methodName, args);
        try {
            method.invoke(obj, "Charlie");
        } catch (IllegalAccessException | InvocationTargetException e) {
            //e.printStackTrace();
        }

        methodName = "setAge";
        args = new Class[]{int.class};
        method = testMethod(obj, methodName, args);
        try {
            method.invoke(obj, 18);
        } catch (IllegalAccessException | InvocationTargetException e) {
            //e.printStackTrace();
        }

        methodName = "whoAmI";
        args = new Class[]{};
        method = testMethod(obj, methodName, args);
        try {
            Assert.assertEquals("9. whoAmI", "My name is Charlie and I'm 18", method.invoke(obj));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
