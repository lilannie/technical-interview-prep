package acmPractice;

import java.io.BufferedInputStream;
import java.util.Scanner;

// problem 11933
/*
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3084
 */
class SplitNumber {
	public static void main(String args[]) // entry point from OS
	{
		SplitNumber myWork = new SplitNumber(); // create a dynamic instance
		myWork.begin(); // the true entry point
	}

	void begin() {
		Scanner in;
		
		in = new Scanner(new BufferedInputStream(System.in)); 
		// useful to do this for large input files

		// loop over inputs
		while (in.hasNext()) {
			int num = in.nextInt();
			if (num <= 0) break;
			
			System.out.println(splitNumber(num));

		} // end of while
		in.close();
		System.exit(0);
	}
	
	String splitNumber(int num) {
		String binaryString = Integer.toBinaryString(num);
		boolean isA = true;
		String a = "";
		String b = "";

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				if (isA) {
					a += "1";
					b += "0";
					isA = false;
				}
				else {
					a += "0";
					b += "1";
					isA = true;
				}
			}
			else {
				a += "0";
				b += "0";
			}
		}

		int aInt = Integer.parseInt(a, 2);
		int bInt = Integer.parseInt(b, 2);

		return ""+aInt+" "+bInt;
	}
}

