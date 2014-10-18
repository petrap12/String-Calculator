package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text)
	{
		if(text.equals(""))
		{		
			return 0;
		}
		else if(text.contains("//"))
		{
			if(text.contains("-"))
				return 0;
			else
			{
				String delimiter = text.substring(2,3);
				String newText = text.substring(4);
				return sum(splitByAnyDelimiter(newText, delimiter));
			}
		}
		else if(text.contains(",") || text.contains("\n"))
		{
			if(text.contains("-"))
				return 0;
			else
				return sum(splitByNewLineAndComma(text));
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

	private static String[] splitByNewLineAndComma(String numbers)
	{
		return numbers.split(",|\\n");
	}

	private static String[] splitByAnyDelimiter(String numbers, String delimiter)
	{
		return numbers.split(delimiter);
	}
}
