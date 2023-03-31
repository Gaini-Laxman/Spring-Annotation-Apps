package com.klinnovations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	 
	@Autowired
	private Chip chip;
	public Robot() {
System.out.println("Robot::Constructor");
	
	}
	public void doWork() {
		String Type = chip.chipType();
		if(Type.equals("32-BIT")){
			System.out.println("Performance is slow ....");
		}

	}

}
