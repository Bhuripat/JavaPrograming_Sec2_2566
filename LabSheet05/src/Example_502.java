import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//1.input email from dialog box
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail:");
		//2.check email start with @ or space bar or not
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) {
			 yourEmail = JOptionPane.showInputDialog("Input your e-mail, again:"); 
		}
		//3.check email end with hotemail.com or gmail.com or not 
		yourEmail= yourEmail.toLowerCase();
		 if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			 JOptionPane.showMessageDialog(null, "Your email is "+yourEmail);
		 }else{
			 JOptionPane.showMessageDialog(null, "Your email is not hotmail or mail dot com");
			 
		 }
	}

}