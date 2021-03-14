public class test3 {
	public static void main (String[] args) {
	long num = 1000L;
		if (num % 2 == 0 ) {
			System.out.println("偶数");
} else if  ( num % 2 == 1 ) {
			System.out.println("奇数");
}

	byte grades =120 ;
		if (grades > 90 && grades < 100) {
			System.out.println('A');
		} else if  (grades > 80 && grades < 90) {
			System.out.println('B');
		} else if  (grades > 60 && grades < 80) {
			System.out.println('C');
		} else if  (grades < 60) {
			System.out.println('D');
		} else {
			System.out.println("Error");
}
}
}