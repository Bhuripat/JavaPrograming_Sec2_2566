import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstname = fullname.substring(0,space);
			String lastname = fullname.substring(space+1);
			System.out.println("First Name: "+firstname);
			System.out.println("Last Name: "+lastname);
		}
	}

}
