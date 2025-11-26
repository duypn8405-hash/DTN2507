package Exercise_4;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Type your name: ");
		String a = nhap.nextLine();
		System.out.println("Tên bạn vừa nhập là: " + a);
		String[] arr = a.trim().split("\\s+");
		System.out.println(arr.length);

//	a.trim(): Xóa khoảng trắng đầu và cuối chuỗi
//	.split("\\s+"): Tách chuỗi thành mảng dựa trên một hoặc nhiều dấu cách, tab, hoặc ký tự trắng khác.
//	\\s+ nghĩa là:
//		\\s : ký tự khoảng trắng (space, tab, xuống dòng…)
//		+ : 1 hoặc nhiều lần
	}
}
