package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	// Injecting literal values 
	// Add new fields 
	private String emailAddress;
	private String team;

	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside the setter method setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside the setter method setTeam");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside the no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside the setter method setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
