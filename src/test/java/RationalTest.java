import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() throws Rational.Illegal{
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 2);
        x.subtract(y);
        Assert.assertEquals(0, x.numerator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 2);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(4, 2);
        Rational y = new Rational(1, 2);
        x.divide(y);
        Assert.assertEquals(4, x.numerator);
    }

    @Test
    public void testEquals() throws  Rational.Illegal {
        Rational x = new Rational(1, 5);
        Rational y = new Rational(1, 5);
        Assert.assertEquals(x, y);
    }

    @Test
    public void testCompareTo() throws Rational.Illegal {
        Rational x = new Rational(5, 2);
        Rational y = new Rational(6, 2);
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 3);
        Assert.assertEquals("1/2", x.toString());
        Assert.assertEquals("1/3", y.toString());
    }
}
