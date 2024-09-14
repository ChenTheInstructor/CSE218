package p2;

public enum DaysOfMonth {
	JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31);
	
	private int days;
	
	DaysOfMonth(int days) {
		this.days = days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
	
}
