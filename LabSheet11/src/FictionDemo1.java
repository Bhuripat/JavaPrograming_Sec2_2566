import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Input book name");
		String bookname = scan.nextLine();
		System.out.print("Input book year");
		int bookyear = scan.nextInt();
		scan.nextLine();
		Fictionbook book = new Fictionbook(bookname, bookyear);
		do {
			System.out.print("Input author name");
			book.setAuthorName(scan.nextLine());
			System.out.print("Input author email");
			book.setEmail(scan.nextLine());
		}while((book.checkFormatName()&&book.checkemail()));
		System.out.print(book);
	}

}
