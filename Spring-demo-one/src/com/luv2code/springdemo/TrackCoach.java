package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Custom start message and " + fortuneService.getFortune();
	}

	// add an init method
	public void doStartupStuff() {
		System.out.println("TrackCoach: Inside startup method");
	}
	// add a destroy method
	public void doCleanupStuff() {
		System.out.println("TrackCoach: Inside cleanup method");
	}
}
