package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() 
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() 
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test 
	public void testTwoNumbers()
	{
		assertEquals (3, Calculator.add("1,2"));
	}
	
	@Test
	public void testThreeNumbers()
	{
		assertEquals(6, Calculator.add("1,2,3"));
	}
	
	@Test
        public void testTwoNumbersNewLine()
        {
                assertEquals(3, Calculator.add("1\n2"));
        }

	@Test
        public void testThreeNumbersNewLine()
        {
                assertEquals(6, Calculator.add("1\n2\n3"));
        }

	@Test
        public void testNewLineAndComma()
        {
                assertEquals(6, Calculator.add("1\n2,3"));
        }

	@Test
        public void testCommaAndNewLine()
        {
                assertEquals(6, Calculator.add("1,2\n3"));
        }

	@Test
        public void testTwoNumbersDelimiter()
        {
                assertEquals(3, Calculator.add("//;\n1;2"));
        }

	@Test
        public void testTwoNumbersDelimiterTwo()
        {
                assertEquals(3, Calculator.add("//=\n1=2"));
        }

	@Test
        public void testThreeNumbersDelimiter()
        {
                assertEquals(6, Calculator.add("//=\n1=2=3"));
        }

	@Test
        public void testTwoNumbersWithToLargeNum()
        {
                assertEquals(1, Calculator.add("1,1001"));
        }

	@Test
        public void testThreeNumbersWithToLargeNum()
        {
                assertEquals(7, Calculator.add("//?\n2?5?2002"));
        }

	/*@Test
        public void testTwoNumbersWithNegative()
        {
                assertEquals(0, Calculator.add("-1,2"));
        }*/
}
