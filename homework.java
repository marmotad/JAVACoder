public class homework {
	public static void main(String[] args) {
		byte a =1;
		byte b = 2;
		byte tmp;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println(a + " " + b);

		int c = 5;
		int d = 6;
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println(c + " " + d);

		short e = 128;
		System.out.println(e / 100);
		short f = (short)(e%100);
//		int f = e % 100;
		System.out.println(f / 10);
		System.out.println(f % 10);
}
}