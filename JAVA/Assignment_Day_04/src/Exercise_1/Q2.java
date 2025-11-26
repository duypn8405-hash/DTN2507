package Exercise_1;

import java.time.LocalDate;

public class Q2 {
	public static void main(String[] args) {

		// a) Dùng constructor không parameters
		Account acc1 = new Account();

		// b) Dùng constructor có 5 parameter
		Account acc2 = new Account(1, "an@gmail.com", "nguyenan", "Nguyen", "An");

		// c) Dùng constructor có position, default createDate = now
		Account acc3 = new Account(2, "binh@gmail.com", "tranbinh", "Tran", "Binh", "Leader");

		// d) Dùng constructor có position và createDate
		Account acc4 = new Account(3, "cuong@gmail.com", "lecuong", "Le", "Cuong", "Admin", LocalDate.of(2025, 11, 16));

	}
}
