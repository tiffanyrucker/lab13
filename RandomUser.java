
public class RandomUser extends Player {

	public RandomUser() {
		super();
		
	}

	@Override
	public Roshambo generateRoshambo() {
		int randNum = (int) (Math.random() * 3 + 1);
		if (randNum == 1) {
			return Roshambo.ROCK;
		
		}
		
		else if(randNum == 2) {
			return Roshambo.PAPER;
		}else if(randNum == 3)
			return Roshambo.SCISSOR;
		return null;
		}
	

	@Override
	public Roshambo generateRoshambo(String userInput) {
		
		return null;
	}

}
