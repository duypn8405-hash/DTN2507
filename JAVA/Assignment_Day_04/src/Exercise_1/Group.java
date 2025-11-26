package Exercise_1;

import java.time.LocalDateTime;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Account[] accounts;
	private LocalDateTime createDate;

//	a) Không có parameters

	public Group() {
	}

//  b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate

	public Group(String name, Account creator, Account[] accounts, LocalDateTime createDate) {
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

//    c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
//   Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
	public Group(String name, Account creator, String[] usernames, LocalDateTime createDate) {
	    this.name = name;
	    this.creator = creator;
	    this.createDate = createDate;

	    // Gán đúng vào field
	    this.accounts = new Account[usernames.length];

	    for (int i = 0; i < usernames.length; i++) {
	        Account acc = new Account(); 
	        acc.setUsername(usernames[i]);
	        this.accounts[i] = acc;
	    }
	}


	}

