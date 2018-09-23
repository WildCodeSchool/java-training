package tests;

import org.junit.Assert;
import java.lang.reflect.Method;

public class MainTest {

    private final static String INCORRECT_ARGUMENTS = "No valid '%s' method found, check the method name or the arguments.";


    public Method testMethod(Object obj, String methodName, Class[] args) {
        Method method;
        try {
            method = obj.getClass().getDeclaredMethod(methodName, args);
            return method;
        } catch (NoSuchMethodException e) {
            Assert.fail(String.format(INCORRECT_ARGUMENTS, methodName));
        }
        return null;
    }
}
