
public class Date {
	private int year;
	private int month;
	private int day;
	public Date(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toString() {
		//Use built-i function String.format() to from a formatted String
		//Specifier "0" to print leading zero => 01/02/2024
		return String.format("%02d/%02d/%04d", month,day,year);
	}
	public void setDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}