package oop.asg02;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for BigInteger class, part E
 */
public class BigIntegerPartETest
{
    @Test
    public void testGreaterCompare()
    {
        BigInteger bigInt1 = new BigInteger(999);
		BigInteger bigInt2 = new BigInteger(1000);
        assertEquals(-1, bigInt.compareTo(bigInt2));
    }
    
	@Test
    public void testLessCompare()
    {
        BigInteger bigInt1 = new BigInteger(99);
		BigInteger bigInt2 = new BigInteger(100);
        assertEquals(1, bigInt.compareTo(bigInt2));
    }

	@Test
    public void testEqualCompare()
    {
        BigInteger bigInt1 = new BigInteger(10);
		BigInteger bigInt2 = new BigInteger(10);
        assertEquals(0, bigInt.compareTo(bigInt2));
    }

	@Test
    public void testCloneValue()
    {
        BigInteger bigInt1 = new BigInteger(1000);
		BigInteger bigInt2 = bigInt1.clone();
        assertEquals(10, bigInt2.toLong());
    }
}