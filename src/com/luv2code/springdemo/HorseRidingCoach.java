package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HorseRidingCoach implements Coach {
	
private FortuneService fortuneService;
	
	@Autowired
	public HorseRidingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do whatever horse riders do.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
