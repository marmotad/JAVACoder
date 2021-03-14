public class test2 {
	public static <swhich> void main(String[] args) {
		int a = 153;
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 100 % 10;

		int outnum = (b * b * b) + (c * c * c) + (d * d * d);
		if (outnum == a) {
			System.out.println(a);
		}	else {
				System.out.println("no num");
		}
	}
}