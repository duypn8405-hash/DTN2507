package Exercise_1;

import java.time.LocalDateTime;

public class Q3 {
	public static void main(String[] args) {

		// Tạo creator
		Account creator = new Account();
		creator.setUsername("admin");

		// a) Constructor không parameter
		Group group1 = new Group();

		// b) Constructor có GroupName, Creator, Account[], CreateDate
		Account[] members = { new Account(1, "a@gmail.com", "userA", "Nguyen", "An"),
				new Account(2, "b@gmail.com", "userB", "Tran", "Binh") };

		Group group2 = new Group("Group01", creator, members, LocalDateTime.now());

		// c) Constructor có usernames
		String[] usernames = { "mem01", "mem02", "mem03" };

		Group group3 = new Group("Group02", creator, usernames, LocalDateTime.of(2025, 11, 16, 0, 0));
	}
}
