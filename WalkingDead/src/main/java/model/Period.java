package model;

import java.util.Date;

public class Period {
	
	private int numberOfPeriods;
	
	private int state;
	
	private Date start;
	
	private Date end;

	public int getNumberOfPeriods() {
		return numberOfPeriods;
	}

	public void setNumberOfPeriods(int numberOfPeriods) {
		this.numberOfPeriods = numberOfPeriods;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
	
	
}
