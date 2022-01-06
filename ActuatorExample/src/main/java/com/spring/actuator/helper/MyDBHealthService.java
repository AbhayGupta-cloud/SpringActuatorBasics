package com.spring.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class MyDBHealthService implements HealthIndicator{

	public boolean isHealthGood() {
		//custom logic
		return true;
	}
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		if(isHealthGood()) {
			return Health.up().withDetail("Database Service","Database Service Is Running").build();
		}
		return Health.down().withDetail("Database Service","Database Service Is Running Down.").build();
	}

}
