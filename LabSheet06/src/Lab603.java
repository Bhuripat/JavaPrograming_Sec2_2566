import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your name, separated by a space.");
			String name = scan.nextLine();
			System.out.println( abbreviaName(name));

	}
	public static String abbreviaName(String fullname) {
		String fristname = fullname.substring(0,fullname.indexOf(" ") );
		String middlename = fullname.substring(fullname.indexOf(" ")+1,fullname.indexOf(" ")+2);
		String lastname = fullname.substring(fullname.lastIndexOf(" ")+1,fullname.lastIndexOf(" ")+2);
		
		
		
		
		
		
		return middlename+"."+lastname+"."+fristname;
		
	}

}
