import java.util.*;
public class AutherDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input auther name : ");
		String name = scan.nextLine();
		System.out.print("Input auther email: ");
		String email = scan.nextLine();
		System.out.print("auther gender: ");
		char gender = scan.nextLine().charAt(0);
		Author a1 = new Author(name,email,gender);
		System.out.print(a1);
		
	}

}
