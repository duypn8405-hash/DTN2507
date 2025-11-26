package Exercise_1;

public class Q3 {
	public static void main(String[] args) {

		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;

		System.out.println("===Question2====");
		System.out.printf("Số ngẫu nhiên: %05d \n", a);

		System.out.println("===Question3===");
// Chuyển số a thành chuỗi b, nhưng sẽ tạo fomat để ví dụ số rondom là 00234 vẫn in ra 34
		String b = String.format("%05d", a);
// substring(3): lấy ký tự từ index 3 đến hết.
		System.out.println("Hai số cuối: " + b.substring(3));
	}
}