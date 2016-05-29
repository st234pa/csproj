import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		System.out.println(run()[0]);
	}
	public int[] run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("r");
		int r = scan.nextInt();
		System.out.println("c");
		int c = scan.nextInt();
		int[] coords = {r, c};
		return coords;
	}
}