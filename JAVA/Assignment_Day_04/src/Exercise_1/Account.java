package Exercise_1;

import java.time.LocalDate;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String firstName;
	private String lastName;
	private String fullName;
	private String position;
	private LocalDate createDate;

//  a) Không có parameters

	public Account() {
	}

// b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)

	public Account(int id, String email, String userName, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
	}

// c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) 
// và Position của User, default createDate = now

	public Account(int id, String email, String userName, String firstName, String lastName, String position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate.now();
	}

// d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) 
// và Position của User, createDate.

	public Account(int id, String email, String userName, String firstName, String lastName, String position,
			LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	public void setUsername(String username) {
	    this.userName = userName;
	}

}
