import org.junit.Assert;
import org.junit.Test;

public class FundamentalsTrainingTest extends MainTest {

    @Test
    public void sameValue() {
        Assert.assertEquals(0, FundamentalsTraining.sameValue(0));
        Assert.assertEquals(1, FundamentalsTraining.sameValue(1));
        Assert.assertEquals(2, FundamentalsTraining.sameValue(2));
    }

    @Test
    public void addOne() {
        Assert.assertEquals(1, FundamentalsTraining.addOne(0));
        Assert.assertEquals(2, FundamentalsTraining.addOne(1));
        Assert.assertEquals(3, FundamentalsTraining.addOne(2));
    }

    @Test
    public void addValues() {
        Assert.assertEquals(0, FundamentalsTraining.addValues(0, 0));
        Assert.assertEquals(1, FundamentalsTraining.addValues(0, 1));
        Assert.assertEquals(4, FundamentalsTraining.addValues(2, 2));
    }

    @Test
    public void isValueSuperiorToTen() {
        Assert.assertFalse(FundamentalsTraining.isValueSuperiorToTen(0));
        Assert.assertFalse(FundamentalsTraining.isValueSuperiorToTen(10));
        Assert.assertTrue(FundamentalsTraining.isValueSuperiorToTen(11));
    }

    @Test
    public void isValueZeroOrNegative() {
        Assert.assertTrue(FundamentalsTraining.isValueZeroOrNegative(0));
        Assert.assertTrue(FundamentalsTraining.isValueZeroOrNegative(-1));
        Assert.assertFalse(FundamentalsTraining.isValueZeroOrNegative(1));
    }

    @Test
    public void areValuesEquals() {
        Assert.assertTrue(FundamentalsTraining.areValuesEquals(0, 0));
        Assert.assertTrue(FundamentalsTraining.areValuesEquals(1, 1));
        Assert.assertFalse(FundamentalsTraining.areValuesEquals(0, 1));
    }

    @Test
    public void isFirstSuperiorToSecond() {
        Assert.assertFalse(FundamentalsTraining.isFirstSuperiorToSecond(0, 0));
        Assert.assertTrue(FundamentalsTraining.isFirstSuperiorToSecond(1, 0));
        Assert.assertFalse(FundamentalsTraining.isFirstSuperiorToSecond(0, 1));
    }

    @Test
    public void isValueEven() {
        Assert.assertFalse(FundamentalsTraining.isValueEven(3));
        Assert.assertTrue(FundamentalsTraining.isValueEven(2));
        Assert.assertTrue(FundamentalsTraining.isValueEven(42));
    }

    @Test
    public void isValueOdd() {
        Assert.assertTrue(FundamentalsTraining.isValueOdd(33));
        Assert.assertTrue(FundamentalsTraining.isValueOdd(3));
        Assert.assertFalse(FundamentalsTraining.isValueOdd(42));
    }

    @Test
    public void canValueBeDivided() {
        Assert.assertTrue(FundamentalsTraining.canValueBeDivided(4, 2));
        Assert.assertTrue(FundamentalsTraining.canValueBeDivided(6, 3));
        Assert.assertFalse(FundamentalsTraining.canValueBeDivided(11, 7));
    }

    @Test
    public void trueOrFalse() {
        Assert.assertEquals("true", FundamentalsTraining.trueOrFalse(true));
        Assert.assertEquals("false", FundamentalsTraining.trueOrFalse(false));
    }

    @Test
    public void zeroOrOneOrOther() {
        Assert.assertEquals("zero", FundamentalsTraining.zeroOrOneOrOther(0));
        Assert.assertEquals("one", FundamentalsTraining.zeroOrOneOrOther(1));
        Assert.assertEquals("other", FundamentalsTraining.zeroOrOneOrOther(10));
        Assert.assertEquals("other", FundamentalsTraining.zeroOrOneOrOther(-1));
    }

    @Test
    public void inferiorOrSuperiorOrEquals() {
        Assert.assertEquals("superior", FundamentalsTraining.inferiorOrSuperiorOrEquals(1, 0));
        Assert.assertEquals("inferior", FundamentalsTraining.inferiorOrSuperiorOrEquals(0, 1));
        Assert.assertEquals("equals", FundamentalsTraining.inferiorOrSuperiorOrEquals(0, 0));
    }

    @Test
    public void addIfInferiorSubstractIfSuperiorOrEquals() {
        Assert.assertEquals(3, FundamentalsTraining.addIfInferiorSubstractIfSuperiorOrEquals(1, 2));
        Assert.assertEquals(1, FundamentalsTraining.addIfInferiorSubstractIfSuperiorOrEquals(2, 1));
        Assert.assertEquals(0, FundamentalsTraining.addIfInferiorSubstractIfSuperiorOrEquals(1, 1));
    }

    @Test
    public void firstOrSecond() {
        Assert.assertTrue(FundamentalsTraining.firstOrSecond(true, false));
        Assert.assertTrue(FundamentalsTraining.firstOrSecond(false, true));
        Assert.assertTrue(FundamentalsTraining.firstOrSecond(true, true));
        Assert.assertFalse(FundamentalsTraining.firstOrSecond(false, false));
    }

    @Test
    public void firstAndSecond() {
        Assert.assertFalse(FundamentalsTraining.firstAndSecond(true, false));
        Assert.assertFalse(FundamentalsTraining.firstAndSecond(false, true));
        Assert.assertTrue(FundamentalsTraining.firstAndSecond(true, true));
        Assert.assertFalse(FundamentalsTraining.firstAndSecond(false, false));
    }

    @Test
    public void booleanEquals() {
        Assert.assertFalse(FundamentalsTraining.booleanEquals(true, false));
        Assert.assertFalse(FundamentalsTraining.booleanEquals(false, true));
        Assert.assertTrue(FundamentalsTraining.booleanEquals(false, false));
        Assert.assertTrue(FundamentalsTraining.booleanEquals(true, true));
    }

    @Test
    public void notValue() {
        Assert.assertFalse(FundamentalsTraining.notValue(true));
        Assert.assertTrue(FundamentalsTraining.notValue(false));
    }

    @Test
    public void whichValueIsThis() {
        Assert.assertEquals(1, FundamentalsTraining.whichValueIsThis(0, 1, true));
        Assert.assertEquals(0, FundamentalsTraining.whichValueIsThis(0, 1, false));
    }
}
