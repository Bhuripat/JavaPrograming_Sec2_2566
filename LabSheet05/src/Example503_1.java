import javax.swing.*;
public class Example503_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
		 sentence = JOptionPane.showInputDialog("Input a sentence: ");
			
		}
		int countSpace=0;
		for(int i=0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				countSpace+=1;
			}
		}
		System.out.println();
		JOptionPane.showMessageDialog(null, "This sentence has "+countSpace+" space"+"\nThis sentence has "+(countSpace+1)+" word.");

	}

}
