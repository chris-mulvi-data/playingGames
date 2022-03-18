package playGames;

import java.util.ArrayList;
import playGames.fizzBuzzGame;

public class playingWithLists {
	
	
	/**
	 * Main method for playing a version of FizzBuzz based around building and manipulating an ArrayList
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = buildNumberList(15);

		for(int num : numbers)
		{
			String output = "";
			System.out.println(Integer.toString(num));
			
			boolean multipleOfThree = playGames.fizzBuzzGame.checkForMultiple(3, num);
			System.out.println(String.valueOf(multipleOfThree));
			boolean multipleOfFive = playGames.fizzBuzzGame.checkForMultiple(5, num);
			System.out.println(String.valueOf(multipleOfFive));
			
			if (multipleOfThree == true)
			{
				output += "Fizz";
			}
			if (multipleOfFive == true)
			{
				output += "Buzz";
			}
//			System.out.println((output.length() > 0) ? output : num);
		}
	}
	
	/**
	 * build a list of numbers
	 * @param max
	 * @return
	 */
	public static ArrayList<Integer> buildNumberList(int max)
	{
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		for (int num = 1; num <= max; num++)
		{
			numberList.add(num);
		}
		return numberList;
	}
}
