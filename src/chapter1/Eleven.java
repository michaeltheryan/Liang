package chapter1;

public class Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double initialPop = 312032486;
		final int daysInYear = 365;
		final int secondsInYear = daysInYear * 24 * 60 * 60;
		final double birthsPerSecond = 1.0/7;
		final double deathsPerSecond = 1.0/13;
		final double immigrantsPerSecond = 1.0/45;
		double currentPop = initialPop;

		for(int i = 1; i <= 5; i++) {
			currentPop += secondsInYear * birthsPerSecond;
			currentPop -=  secondsInYear * deathsPerSecond;
			currentPop += secondsInYear * immigrantsPerSecond;
			System.out.println("Year " + i + " population = " + (int) currentPop);
		}
	}

}
