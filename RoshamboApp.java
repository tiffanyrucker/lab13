import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		// declare and initialize variables
		Scanner scan = new Scanner(System.in);
		Player human = new User();
		Player computer = null;
		String userName;
		String userChoice;
		String userInput;
		Roshambo value = null;
		Roshambo userValue;
		

		// prompt user to enter name
		userName = Validator.getString(scan, "Please enter a name:");
		human.setName(userName);

		// prompt user to select opponent. Validate input

		userChoice = Validator.getString(scan, "Would you like to play against TheJets or TheSharks? j/s.");

		// prompt user to enter R<P<S
		userInput = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S): ");

		// display opponents choice
		if (userChoice.equalsIgnoreCase("j")) {
			computer = new Dummy();
			computer.setName("TheJets");
			value = computer.generateRoshambo();
			System.out.println("TheJets" + value);

		} else if (userChoice.equalsIgnoreCase("s")) {
			computer = new Dummy();
			computer.setName("TheSharks");
			value = computer.generateRoshambo();
			System.out.println("TheSharks" + value);
		}

		// prompt user to select rock, paper scissor. Validate input

		// System.out.println(userName + ":" + human.generateRoshambo(userInput));

		// display users choice
		userValue = human.generateRoshambo(userInput);
		System.out.println(userName + ":" + userValue);

		// display results of match. write a separate method
		System.out.println(displayResult(computer, human, value, userValue));
		// prompt user to continue
		System.out.println("Play again? (y/n");

		scan.close();

		{
		}

	}

	public static String displayResult(Player computer, Player human, Roshambo userValue, Roshambo value) {
		// do stuff else if statements to determine if rock beat paper and so on
		if (userValue == value) {
			return "It's a draw!";
		} else if (userValue == Roshambo.ROCK && value == Roshambo.PAPER
				|| userValue == Roshambo.PAPER && value == Roshambo.SCISSOR
				|| userValue == Roshambo.SCISSOR && value == Roshambo.ROCK) {
			return computer.getName() + "wins!";
		} else {
			return human.getName() + "Wins!";
		} // if they are the same its a draw

	}
}
