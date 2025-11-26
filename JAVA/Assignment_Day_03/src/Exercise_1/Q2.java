package Exercise_1;

public class Q2 {
	public static void main(String[] args) {

		int min = 0;
		int max = 99999;
		// Math.random() tạo số thực ngẫu nhiên trong khoảng [0, 1)
		int a = (int) (Math.random() * max) + min;

		System.out.printf("Số ngẫu nhiên: %05d ", a);
	}
}