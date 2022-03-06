package playGames;

public class guessingGame {

	public static void main(String[] args) {
		
		// playing FizzBuzz in Java!
		for(int num = 1; num <= 100; num++)
		{
			String output = "";
			
			if (num % 3 == 0) {
				output += "Fizz";
			}
			if (num % 5 == 0) {
				output += "Buzz";
			}
			System.out.println((output.length() > 0) ? output : num);
		}
		
	}

}

