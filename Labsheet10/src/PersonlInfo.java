
public class PersonlInfo {
	private Person name; //object name reference class Person
	private Date dDay;	//object dDay reference class Date
	//declare 1 private attribute
	private int personID;
	
	//Default constructor
	//Postcondition: firstName = "",lastName=""
	//dMonth=1, dDay=1, and dYear=1990
	//personID=0
	PersonlInfo(){
		name = new Person();//firstName"",lastName=""
		dDay =new Date();//dMonth=1, dDay=1, dYear=1990
		personID =0;
	}
	
	//Constructor with parameter
	PersonlInfo(String first, String last, int month, int day ,int year, int ID ){
		name=new Person(first,last);
		dDay = new Date(month,day,year);
		personID = ID;
	}
	//Method to set the personal information
	//call set method from class Person and class Date
	public void setPersonlInfo(String first, String last, int month, int day ,int year, int ID ) {
		name.setName(first, last);
		dDay.setData(month, day, year);
		personID = ID;
	}
	
	//Method to return the string of personal information
	public String toString() {
		return "Name: "+name.toString() + "\n"+"Date of birth: "+dDay.toString()+"\n"+"PersonalID: "+personID;
	}
}

