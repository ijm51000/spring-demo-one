package com.luv2code.springdemo;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
	private String[] data = {
			"don't eat yellow snow",
			"luck is driven not given",
			"fortune favours the bold"
	};
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
