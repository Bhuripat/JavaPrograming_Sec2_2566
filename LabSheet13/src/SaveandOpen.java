import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		// create object for write(save) data to File using PrintStream Class
				PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
				//create object for input data from keyboard(console)
				Scanner scan = new Scanner(System.in);
				String answer;
				do {
					header();
					System.out.print("Enter name:");
					name = scan.next();
					System.out.print("Enter department:");
					dept = scan.next();
					
					//save all data to file
					writeFile.println(name+"\t"+dept);
					System.out.print("Enter data again?: ");
					answer = scan.next().toLowerCase();
				}while(answer.equals("y"));
				
	}
	public void read() {
		try {
			//create object for read File using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			int i = 0;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+") "+name);
					check = true;
				}
			}
			if(check==false) {
				System.out.println("\nSorry, no department: "+super.getDept()+"in File");
			}
			if(i>0) {
				header();
				System.out.println("Employee in department: "+super.getDept()+"is"+i+" person.");
			}
			readFile.close();
			
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}
}
