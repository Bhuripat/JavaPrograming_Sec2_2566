import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("d://txtfile//BookData.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books : ");
		double rateinput = input.nextDouble();
		System.out.println("--------------------------------------------------------------------------------");
		int book = 0;
		String tmp = "";
		int i = 1;
		while((tmp=read.readLine())!=null) {
			String[]data = tmp.split("\t");
			String title = data[0];
			String author = data[1];
			double rate = Double.parseDouble(data[2]);
			String reviews = data[3];
			if(rate>=rateinput) {
				System.out.println("Book "+i+title+"write by "+author+"("+reviews+") reviews");
				book++;
			}
			i++;
		}
		read.close();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print("There are "+book+" book get rating more than "+rateinput);
	}

}
