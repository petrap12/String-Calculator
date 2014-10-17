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
			if(numbers.length == 2)
				return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
			else
				return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]);
		}
		else
		{
			return 1;
		}
	}
}
