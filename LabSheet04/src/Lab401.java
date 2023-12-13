import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,total;
		System.out.print("Input value of x: ");
		 x = scan.nextInt();
		 System.out.print("Input value of y: ");
		 y = scan.nextInt();
		while(y<x) {
		 System.out.print("Input value of y, agin : ");
		 y = scan.nextInt();
		 if(y>x) {
			break;
		 }
		 }
		for(int i=x+1;i<=y;i++) {
			total=x+i;
			System.out.println(x+"+"+i+"="+total);
			x=total;
		}
		
	
		}
		

	}


