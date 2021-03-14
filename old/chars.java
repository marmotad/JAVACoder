public class chars {
	public static void main (String[] args) {
	char a = 'L';
	System.out.println(a);

	char b = '0' + 10;
	System.out.println(b);

	char c = '0';
	int d = c + 1;
//不能用char类型接收，否则会提示类型不兼容
	System.out.print(d);
}
}