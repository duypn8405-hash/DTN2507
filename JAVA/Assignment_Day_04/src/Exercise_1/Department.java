package Exercise_1;

public class Department {
	private int id;
	private String name;

//a) Không có parameters
	public Department() {
	}

// b) Có 1 parameter là nameDepartment và default id của Department = 0
	public Department(String name) {
		this.id = 0;
		this.name = name;
	}
}