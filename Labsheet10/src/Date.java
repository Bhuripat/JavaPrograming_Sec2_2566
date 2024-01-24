
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	//Default constructor
	//Postcondition: dMonth=1, dDay=1, dYear=1900
	public Date() {
		dDay=1;
		dMonth=1;
		dYear=1900;
	}
	
	//constructor to set the date
	//dMonth, dDay and aYear are set according to the parameters
	Date(int  month, int day, int year){
		dMonth = month;
		dDay = day;
		dYear= year;
	}
	
	public void setData(int  month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear= year;
	}
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return dMonth+"-"+dDay+"-"+dYear;
	}
}
