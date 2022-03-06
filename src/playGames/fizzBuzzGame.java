package playGames;

public class fizzBuzzGame {

	public static void main(String[] args) {
		int[] factors = new int[2];
		factors[0] = 3;
		factors[1] = 5;
		String[] words = new String[2];
		words[0] = "Fizz";
		words[1] = "Buzz";
		playFizzBuzz(100, factors, words);
		
	}
	
	/**
	 * playing the FizzBuzz game from 1 to n 
	 * using provided factors and replacement words
	 * @param number
	 * @param factors
	 */
	public static void playFizzBuzz(int number, int[] factors, String[] words) 
	{
		for (int num = 1; num <= number; num++) 
		{
			String output = "";
			
			for (int index = 0; index < factors.length; index++)
			{
				boolean hasRemainder = findRemainder(num, factors[index]);
				
				if(hasRemainder == false)
				{
					output += words[index];
				}
			}
			System.out.println((output.length() > 0) ? output : num);
		}
	}
	
	
	
	/**
	 * Determines if there is a remainder when dividing a number by a factor
	 * @param num
	 * @param factor
	 * @return hasRemainder
	 */
	public static boolean findRemainder(int num, int factor)
	{
		boolean hasRemainder = true;
		
		if (num % factor == 0)
		{
			hasRemainder = false;
		}
		
		return hasRemainder;
	}
}
