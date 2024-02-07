import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt")); 
		while(readFile.hasNext()) {
			String fname = readFile.next();//read name data to fname variable
			String lname = readFile.next();//read surname data to lname variable
			readFile.next();//read password data
			String email = readFile.next().toUpperCase();//read email data to email variable
			String name = lname.substring(0,1)+"."+fname;
			System.out.println(name+" "+"("+email+")");
		}
		readFile.close();

	}

}
