import javax.swing.*;
import java.util.Random;//use library for Random class
public class Practice1 {

	public static void main(String[] args) {
		//using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog(null, "Your balance: "+ balance+"\nInput money to withdraw:"));
		if(withdraw>balance) {
			JOptionPane.showMessageDialog(null, "ERORR: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw>20000) {
			JOptionPane.showMessageDialog(null, "ERORR: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw%100!=0) {
			JOptionPane.showMessageDialog(null, "ERORR: Cannot withdraw "+(withdraw%100)+" bath.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else			
		{
			JOptionPane.showMessageDialog(null, "Your withdraw "+withdraw+" bath."+"\n1000 = "+(withdraw/1000) +
												"\n500 = "+(withdraw%1000/500)+"\n100 = "+(withdraw%1000%500/100)
												,"MESSAGE",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
