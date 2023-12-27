import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		while(checkIndex(nums,indexNumb)) {
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
		}
		int currentValue = currentData(nums,indexNumb); //method return value 
		int prev = prevData(nums,indexNumb);
		int next = nextData(nums,indexNumb);
		JOptionPane.showMessageDialog(null, "Current data ,num["+indexNumb+"] is "+ currentValue
				+((prevData(nums,indexNumb) > 0 ? ("\nCurrent data ,num["+prev+"] is "+ nums[prev]) : "\nNo Prevoius data")
				+((nextData(nums,indexNumb) < 6 ? ("\nCurrent data ,num["+next+"] is "+ nums[next]) : "\nNo next data"))));
	}//end of main()
	
	public static boolean checkIndex(int[] number, int index) {
		/*if(index>=number.length||(index<0)) {
			return true;
		}
		else {
			return false;
		}*/
		
		return (index>=number.length||(index<0))?true:false ;
	}
	
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return index-1;
	}
	
	public static int nextData(int[] nums,int index) {
		return index+1;
	}
	
}
