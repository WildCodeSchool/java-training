import org.junit.Assert;
import org.junit.Test;

public class LoopTrainingTest extends MainTest {

    @Test
    public void sum() {
        Assert.assertEquals(2, LoopTraining.sum(new int[]{1, 1}));
        Assert.assertEquals(2, LoopTraining.sum(new int[]{-1, 0, 1, 2}));
    }

    @Test
    public void concat() {
        Assert.assertEquals("abc", LoopTraining.concat(new String[]{"a", "b", "c"}));
        Assert.assertEquals("tacos", LoopTraining.concat(new String[]{"ta", "cos"}));
    }

    @Test
    public void hasEven() {
        Assert.assertEquals(false, LoopTraining.hasEven(new int[]{1, 1}));
        Assert.assertEquals(true, LoopTraining.hasEven(new int[]{-1, 0, 1, 2}));
    }

    @Test
    public void indexOf() {
        Assert.assertEquals(1, LoopTraining.indexOf(new int[]{1, 2, 3}, 2));
        Assert.assertEquals(2, LoopTraining.indexOf(new int[]{-1, 0, 1, 2}, 1));
        Assert.assertEquals(-1, LoopTraining.indexOf(new int[]{1, 7, 12, 28}, 42));
    }

    @Test
    public void count() {
        Assert.assertEquals(1, LoopTraining.count(new int[]{1, 2, 3}, 2));
        Assert.assertEquals(2, LoopTraining.count(new int[]{1, 0, 1, 2}, 1));
        Assert.assertEquals(0, LoopTraining.count(new int[]{1, 7, 12, 28}, 42));
    }

    @Test
    public void incrementEach() {
        Assert.assertArrayEquals(new int[]{3, 4, 5}, LoopTraining.incrementEach(new int[]{1, 2, 3}, 2));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, LoopTraining.incrementEach(new int[]{-1, 0, 1, 2}, 1));
    }
}
