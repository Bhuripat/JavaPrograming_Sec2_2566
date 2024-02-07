import java.io.*;
import java.util.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(new File("d://txtfile//student.txt"));
		header();
		int i = 1;
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			String name = fname.substring(0,1)+"."+lname;
			double grade = Double.parseDouble(read.next());
			read.next();
			System.out.println(i+"\t"+id+"\t"+Level(id)+"\t"+name+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		read.close();
	}
	public static void header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("************************************************************************");
	}
	public static String Level(String id) {
		int year = 22 - Integer.parseInt(id.substring(0,2));
		return year+"th";
	}
	public static String Status(double grade) {
		if(grade>=2.00) {
			return "Pass";
		}
		else if(grade>1.00 && grade<2.00) {
			return "Critial";
		}
		else {
			return "Retired";
		}
	}
}
