package finalExamTakeHome;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomNthSmallest {

	public static void main(String[] args) {

		Set<Integer> ts = new TreeSet<Integer>();

		while (ts.size() < 500) {
			int rndNumber = new Random().nextInt(999);
			ts.add(rndNumber);

		}
		System.out.println(ts);
		Object[] rndNumberInArray = ts.toArray();
		System.out.println("Enter Nth smallest number of 500 random rumber of rannge 0-999: ");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		System.out.println(N + "th smallest number is: " + rndNumberInArray[N - 1]);

	}

}
