import java.util.*;
public final class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score =new double[5];
		int mean=0;
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score [i] = scan.nextDouble();
			mean+=score[i];
	}
		mean=mean/score.length;//mean/=score.length;
		System.out.println("Average of "+score.length+" is "+mean);
		int cout = 1;
		for(double _score:score) {
			if(_score>mean) {
				System.out.println("> student "+cout+" ("+_score+")");
				cout++;
			}
			
		}
}
	}
