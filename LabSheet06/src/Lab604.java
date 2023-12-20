import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentId,strSubjectId;
	static int subjectId;
	public static void main(String[] args) {
		inputStudent();

	}//end main()
	
	public static void inputStudent() {
		do {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter subject Id:");
			subjectId = scan.nextInt();
			//convert subjectId from integer to string (strSubjectID
			strSubjectId = subjectId+"";
		}while(!(isLength(studentId,strSubjectId)));
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(strSubjectId));
		
	}//end inputStudent()
	
	public static boolean isLength(String id,String sub_id) {
		if (id.length()==10 && sub_id.length()==7) {
			return true;
		}
		return false;
	}//end isLength
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("21")&&id.substring(3,6).equals("1")) {
			return true;
		}else {
			return false;
		}
	}//end isITStudent()
	public static boolean isITSubject(String subid) {
		if(subid.substring(0,3).equals("21")&&subid.substring(3,6).equals("1")) {
			return true;
		}else {
			return false;
		}
	}
	public static void displayData(boolean sid,boolean subid) {
		if(sid) {
			System.out.println("Student id:"+studentId+" 1st year student in IT");
		}else {
			System.out.println("Student id:"+studentId+" is not 1st year student in IT");
		}
		if(subid) {
			System.out.println("Enroll in courses for Year 1");
		}else {
			System.out.println("Not enroll in courses for Year 1");
		}
	}//end displayData()
}
