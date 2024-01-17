import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Scanner scan  = new Scanner(System.in); 
		System.out.print("Input book title: ");
		b1.setTitle(scan.nextLine());
		System.out.print("Input book price: ");
		b1.setPrice(scan.nextFloat());
		System.out.print("Input publish year: ");
		b1.setPulishyear(scan.nextInt());
		
		System.out.println(b1);
	}

}
