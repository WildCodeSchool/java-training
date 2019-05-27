import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MatrixTrainingTest extends MainTest {

    @Test
    public void testOccurrences() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "occurrences";
        Class[] args = new Class[]{char[][].class, char.class};

        Method method = testMethod(obj, methodName, args);
        try {
            char[][] matrix = {
                    {'2', '5', '3'},
                    {'2', '7', '2'},
            };
            Assert.assertEquals("Method: " + methodName,
                    3,
                    method.invoke(obj, (Object) matrix, '2'));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCountEvens() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "countEvens";
        Class[] args = new Class[]{int[][].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {5, 3},
                    {2, 7},
                    {1, 4},
            };
            Assert.assertEquals("Method: " + methodName,
                    2,
                    method.invoke(obj, (Object) matrix));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testContains() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "contains";
        Class[] args = new Class[]{int[][].class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {5, 3},
                    {2, 7},
            };
            Assert.assertEquals("Method: " + methodName,
                    true,
                    method.invoke(obj, (Object) matrix, 2));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSum() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "sum";
        Class[] args = new Class[]{int[][].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {4, 2},
                    {8, 4},
            };
            Assert.assertEquals("Method: " + methodName,
                    18,
                    method.invoke(obj, (Object) matrix));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReplace() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "replace";
        Class[] args = new Class[]{int[][].class, int.class, int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {1, 2},
                    {3, 4},
                    {8, 6},
            };
            int[][] expected = {
                    {1, 2},
                    {3, 4},
                    {5, 6},
            };
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (int[][]) method.invoke(obj, matrix, 5, 2, 0));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValueAtPosition() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "valueAtPosition";
        Class[] args = new Class[]{int[][].class, int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {1, 2},
                    {4, 5},
                    {7, 8},
            };
            Assert.assertEquals("Method: " + methodName,
                    4,
                    method.invoke(obj, matrix, 1, 0));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWidth() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "width";
        Class[] args = new Class[]{int[][].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {4, 5},
                    {1, 2},
                    {7, 8},
            };
            Assert.assertEquals("Method: " + methodName,
                    2,
                    method.invoke(obj, (Object) matrix));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHeight() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "height";
        Class[] args = new Class[]{int[][].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] matrix = {
                    {7, 8},
                    {4, 5},
                    {1, 2},
            };
            Assert.assertEquals("Method: " + methodName,
                    3,
                    method.invoke(obj, (Object) matrix));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testStringMatrix() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "stringMatrix";
        Class[] args = new Class[]{String[].class, String[].class, String[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[] a = {"4", "5", "6"};
            String[] b = {"1", "2", "3"};
            String[] c = {"7", "8", "9"};
            String[][] expected = {a, b, c};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (String[][]) method.invoke(obj, a, b, c));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIntMatrix() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "intMatrix";
        Class[] args = new Class[]{int[].class, int[].class, int[].class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[] a = {4, 5, 6};
            int[] b = {1, 2, 3};
            int[] c = {7, 8, 9};
            int[][] expected = {a, b, c};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (int[][]) method.invoke(obj, a, b, c));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyStringMatrix() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "emptyStringMatrix";
        Class[] args = new Class[]{int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            String[][] expected = {{null, null}, {null, null}, {null, null}};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (String[][]) method.invoke(obj, 3, 2));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyIntMatrix() {
        MatrixTraining obj = new MatrixTraining();
        String methodName = "emptyIntMatrix";
        Class[] args = new Class[]{int.class, int.class};

        Method method = testMethod(obj, methodName, args);
        try {
            int[][] expected = {{0, 0, 0}, {0, 0, 0}};
            Assert.assertArrayEquals("Method: " + methodName,
                    expected,
                    (int[][]) method.invoke(obj, 2, 3));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
