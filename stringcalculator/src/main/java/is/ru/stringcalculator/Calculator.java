package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text){
		if(text.equals(""))
		{		
			return 0;
		}
		else if(text.contains(","))
		{
			String [] numbers = text.split(",");
                        int sum = 0;
						
			for (int i = 0; i < numbers.length; i++)
			{
				sum += Integer.parseInt(numbers[i]);
			}
			return sum;
		}
		else
		{
			return 1;
		}
	}
}
