package Exercise_2;

import java.time.LocalDate;

public class Q1 {
	public static void main(String[] args) {
		Account[] Accounts = new Account[5];
		for (int i = 0; i < Accounts.length; i++) {
			Account account = new Account();
			account.email = "Email " + i;
			account.userName = "User name " + i;
			account.fullName = "Full name " + i;
			account.createDate = LocalDate.now();
			Accounts[i] = account;
			System.out.println("Thông tin của Account là: " + i + " Email: " + Accounts[i].email + " UserName: "
					+ Accounts[i].userName + " FullName: " + Accounts[i].fullName + " CreateDate: "
					+ Accounts[i].createDate);
		}

	}
}
