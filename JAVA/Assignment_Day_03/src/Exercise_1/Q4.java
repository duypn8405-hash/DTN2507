package Exercise_1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		thuong();
	}

	public static void thuong() {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số a: ");
		a = scanner.nextInt();
		do {
			System.out.println("Mời bạn nhập b: ");
			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Nhập lại");
			}
		} while (b == 0);
		scanner.close();
		float c = (float) a / (float) b;
		System.out.println("Kết quả là: " + c);
	}
}
