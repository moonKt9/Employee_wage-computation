
public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int WAGE_PER_HOUR =20;
		final int FULL_DAY_HOUR =8;
		final int HALF_DAY_HOUR =8;
		final int TOTAL_WORKING_DAYS=20;
		final int TOTAL_WORKING_HOURS=100;
		final int IS_PART_TIME = 2;
		
		final int IS_FULL_TIME = 1;
		int dayCount=1;
		int totalWage=0;
		int workingHours=0;
		while (dayCount <= TOTAL_WORKING_DAYS && workingHours <=TOTAL_WORKING_HOURS) {
			int dailyWage=0;
			int empStatus=(int)(Math.random())%3;
			switch (empStatus) {
			case IS_FULL_TIME:
				System.out.println("Employee worked full time");
				workingHours=workingHours +FULL_DAY_HOUR;
				dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
				break;
			case IS_PART_TIME:
				
				System.out.println("Employee worked PART TIME");
				workingHours=workingHours +HALF_DAY_HOUR;
				dailyWage=WAGE_PER_HOUR*HALF_DAY_HOUR;
				break;
				default:
					System.out.println("Employee is absent");
			}
			totalWage=totalWage+dailyWage;
			System.out.println("Daily wage for day:"+dayCount+"is"+dailyWage);
			dayCount++;
		}
		System.out.println("Total Days:"+(dayCount-1));
		System.out.println("Total Working Hours:"+workingHours);
		System.out.println("Total wage for a month:"+totalWage);
	}
}
			
