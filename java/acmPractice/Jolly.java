package acmPractice;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

// problem 10038
/*
Sample Input
4 1 4 2 3
5 1 4 2 -1 6
Sample Output
Jolly
Not jolly
 */
class Jolly {
	public static void main(String args[]) // entry point from OS
	{
		Jolly myWork = new Jolly(); // create a dynamic instance
		myWork.begin(); // the true entry point
	}

	void begin() {
		Scanner in;
		
		in = new Scanner(new BufferedInputStream(System.in)); 
		// useful to do this for large input files
		
		// loop over inputs
		while (in.hasNext()) {
			int num = in.nextInt();
			if (num <= 0) continue;
			if (num == 1) {
				BigInteger a = in.nextBigInteger();
				System.out.println("Jolly");
				continue;
			}

			boolean isThere[] = new boolean[num-1];
			BigInteger a = in.nextBigInteger();
			
			for (int i = 1; i < num; i++){
				BigInteger b = in.nextBigInteger();
				long diff;
				diff = b.subtract(a).abs().longValue() - 1;
				a = b;
				
				if ((diff >= 0) && (diff < (num - 1))) isThere[(int) diff] = true;
			}
			
			checkJolly(isThere);

		} // end of while
		in.close();
	}
	
	void checkJolly(boolean[] isThere) {
		int num = isThere.length;
//		for (int i = 0; i < num; i++) {
//			System.out.print(isThere[i] + " ");
//		}
//		System.out.println();
		for (int i = 0; i < num; i++) {
			if (!isThere[i]) {
				System.out.println("Not jolly");
				return;
			}
		}
		System.out.println("Jolly");			
	}


}

