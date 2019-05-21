import org.junit.Assert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainTest {

    private final static String INVALID_ARGUMENTS = "No valid '%s' method found, check the method name or the arguments.";
    private final static String INVALID_CONSTRUCTOR = "No valid constructor found, check the arguments.";
    private final static String INVALID_ATTRIBUTE = "No valid attribute '%s' found";


    public Method testMethod(Object obj, String methodName, Class[] args) {
        Method method;
        try {
            method = obj.getClass().getDeclaredMethod(methodName, args);
            return method;
        } catch (NoSuchMethodException e) {
            Assert.fail(String.format(INVALID_ARGUMENTS, methodName));
        }
        return null;
    }

    public Constructor testConstructor(Object obj, Class[] args) {
        Constructor constructor;
        try {
            constructor = obj.getClass().getConstructor(args);
            return constructor;
        } catch (NoSuchMethodException e) {
            Assert.fail(INVALID_CONSTRUCTOR);
        }
        return null;
    }

    public Field testField(Object obj, String fieldName) {
        Field field;
        try {
            field = obj.getClass().getDeclaredField(fieldName);
            return field;
        } catch (NoSuchFieldException e) {
            Assert.fail(String.format(INVALID_ATTRIBUTE, fieldName));
        }
        return null;
    }
}
