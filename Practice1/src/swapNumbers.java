public class swapNumbers{
public static void swap(int a, int b) {
    b = b + a;
	a = b - a;
	b = b - a;
}

public static void main(String[] args) {
	int a = 10;
	int b = 30;
	swap(a, b);
	System.out.printf("a is %d, b is %d", a, b); // a is 10, b is 20
}
}