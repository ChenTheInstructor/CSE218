package p3_courses;

public class Demo {

	public static void main(String[] args) {
		Hours earlyMorning = Hours.EARLY_MORNING;
		System.out.println(earlyMorning.getTimeRange().getStartTime());
		System.out.println(earlyMorning.getTimeRange().getEndTime());
	}

}
