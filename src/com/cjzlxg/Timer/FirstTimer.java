package com.cjzlxg.Timer;

import java.util.Date;

public class FirstTimer implements Timer {
	
	long beginTime, endTime;
	Date myDate;
	
	@Override
	public Date begin() {
		myDate = new Date();
		beginTime = myDate.getTime();
		return myDate;
	}
	
	@Override
	public double quit() {
		endTime = new Date().getTime();
		return (endTime - beginTime) / 1000.0;
	}
	
}
