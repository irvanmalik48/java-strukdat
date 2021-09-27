import java.util.ArrayList;
import java.util.Scanner;

class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp;
		while (true) {
			temp = in.nextInt();
			if (temp >= 0) arr.add(temp); else if (temp < 0) break;
		}
		System.out.println(arr);
	}
}
