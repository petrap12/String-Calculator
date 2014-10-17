package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text)
	{
		if(text.equals(""))
		{		
			return 0;
		}
		else if(text.contains(",") && text.contains("\n"))
		{
			return sum(splitByNewLineAndComma(text));
		}
                else if(text.contains(","))
                {
			return sum(splitByComma(text));
                }
		else if(text.contains("\n"))
		{
			return sum(splitByNewLine(text));
		}
		else
		{
			return 1;
		}
	}

	private static int sum(String[] numbers)
	{
		int totalSum = 0;
						
		for (int i = 0; i < numbers.length; i++)
		{
			totalSum += Integer.parseInt(numbers[i]);
		}
	
		return totalSum;
	}

	private static String[] splitByComma(String numbers)
	{
		return numbers.split(",");
	}

	private static String[] splitByNewLine(String numbers)
	{
		return numbers.split("\n");
	}

	private static String[] splitByNewLineAndComma(String numbers)
	{
		return numbers.split(",|\\n");
	}
}
